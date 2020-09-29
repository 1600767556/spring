package com.crm.service;

import com.bjpowernode.dao.GoodsDao;
import com.bjpowernode.dao.SaleDao;
import com.bjpowernode.domain.Goods;
import com.bjpowernode.domain.Sale;
import com.bjpowernode.excep.NotEnoughException;
import com.bjpowernode.service.BuyGoodsService;

public class CrmGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;
    @Override
    public void buy(Integer goodsid, Integer nums) {
        System.out.println("buy方法的开始");
        Sale sale = new Sale();
        sale.setGid(goodsid);
        sale.setNums(nums);
        saleDao.insertSale(sale);
        Goods goods = goodsDao.selectGoods(goodsid);
        if (goods ==null){
            throw new NullPointerException("编号是："+goodsid+",商品不存在");
        }else if (goods.getAmount() < nums){
            throw new NotEnoughException("编号是："+goodsid+",商品库存不足");
        }
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsid);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
        System.out.println("buy方法的完成");
    }





    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }




}
