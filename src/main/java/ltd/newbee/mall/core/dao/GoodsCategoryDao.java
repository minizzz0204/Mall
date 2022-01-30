package ltd.newbee.mall.core.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import ltd.newbee.mall.core.entity.GoodsCategory;

public interface GoodsCategoryDao extends BaseMapper<GoodsCategory> {

    IPage<GoodsCategory> selectListPage(Page page, GoodsCategory goodsCategory);
}
