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
 * Add method by imguang 2017/2/3.
 */

@Service
public class BlogServices {

    @Resource
    private BlogMapper blogMapper;
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /*
    * 取出所有的blog
    * by imguang
    * */
    public List<BlogRspDTO> selectAllBlogs() {
        List<BlogRspDTO> blogRspDTOList = new ArrayList<BlogRspDTO>();
        List<Blog> blogs = blogMapper.selectAllBlogs();
        for (Blog blog : blogs) {
            BlogRspDTO blogRspDTO = blog2DTO(blog);
            blogRspDTOList.add(blogRspDTO);
        }
        return blogRspDTOList;
    }
    public BlogRspDTO selectById(int id){
        BlogRspDTO blogRspDTO = blog2DTO(blogMapper.selectByPrimaryKey(id));
        return blogRspDTO;
    }

    public int delById(int id){
        return blogMapper.deleteByPrimaryKey(id);
    }

    /*
    * 把pojo转换为DTO
    * @TODO 用反射实现
    * by imguang
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
        //缩略文字为64个字
        int length = blog.getContent().length();
        if(length >= 128){
            blogrspDTO.setAbstractContent(blog.getContent().substring(0,64)+"...");
        } else {
            blogrspDTO.setAbstractContent(blog.getContent());
        }
        //对标签进行分割
        if(blog.getTag() != null) {
            blogrspDTO.setTag(blog.getTag().split(";"));
        }
        blogrspDTO.setHits(blog.getHits());
        return blogrspDTO;
    }


}
