package com.mystic.service;

import com.mystic.dao.BlogMapper;
import com.mystic.dto.BlogRspDTO;
import com.mystic.pojo.Blog;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
        List<Blog> blogs = blogMapper.selectAllBlogs();
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
        BlogRspDTO blogrspDTO = new BlogRspDTO();
        blogrspDTO.setId(blog.getId());
        blogrspDTO.setCreateTime(sdf.format(blog.getCreateTime()));
        blogrspDTO.setContent(blog.getContent());
        blogrspDTO.setTitle(blog.getTitle());
        if (blog.getUpdateTime() != null) {
            blogrspDTO.setUpdateTime(sdf.format(blog.getUpdateTime()));
        }
        blogrspDTO.setTag(blog.getTag());
        blogrspDTO.setHits(blog.getHits());
        return blogrspDTO;
    }


}
