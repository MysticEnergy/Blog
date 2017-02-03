package com.mystic.service;

import com.mystic.dto.BlogReqDTO;
import com.mystic.dto.BlogRspDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mystic.dao.BlogMapper;
import com.mystic.pojo.Blog;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wasmir on 2016/12/22.
 * Add select method by imguang 2017/2/3.
 */

@Service
public class BlogServices {

    @Resource
    private BlogMapper blogMapper;
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public List<BlogRspDTO> selectAllBlogs() {
        List<BlogRspDTO> blogRspDTOList = new ArrayList<BlogRspDTO>();
        List<Blog> blogs = blogMapper.selectAll();
        for (Blog blog : blogs) {
            blogRspDTOList.add(blog2DTO(blog));
        }
        return blogRspDTOList;
    }

    /*
    * 把pojo转换为DTO
    * @TODO 用反射实现
    * */

    public BlogRspDTO blog2DTO(Blog blog) {
        BlogRspDTO blogreqDTO = new BlogRspDTO();
        blogreqDTO.setId(blog.getId());
        blogreqDTO.setCreateTime(sdf.format(blog.getCreateTime()));
        blogreqDTO.setContent(blog.getContent());
        blogreqDTO.setTitle(blog.getTitle());
        if (blog.getUpdateTime() != null) {
            blogreqDTO.setUpdateTime(sdf.format(blog.getUpdateTime()));
        }
        blogreqDTO.setTag(blog.getTag());
        return blogreqDTO;
    }


}
