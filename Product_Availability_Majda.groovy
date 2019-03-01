package commonscottcore.impex.system

import com.scottsports.pim.model.ColorSizeVariantModel
import de.hybris.platform.ordersplitting.model.StockLevelModel
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult
import de.hybris.platform.variants.jalo.VariantProduct;

import java.text.MessageFormat;



FlexibleSearchService flexibleSearchService=(FlexibleSearchService)spring.getBean("flexibleSearchService");
ModelService modelService=(ModelService)spring.getBean("modelService");

queryString="Select {stock.pk} from {stocklevel as stock} where \n" +
        "{stock.productCode} = '2454395159006' and {stock.warehouse} = '8796093056981' or \n" +
        "{stock.productCode} = '2454390240007' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2454390240009' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2454390240008' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2454390240005' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2454395159005' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2454395159007' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2454390240006' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2454395159009' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2454395166007' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2454395159008' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2454395166009' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2454395166005' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2454395166006' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2454395166008' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2542029992167' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2542029992177' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2542029992157' and {stock.warehouse} = '8796093056981' or\n" +
        
        "{stock.productCode} = '2518801172004' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801172005' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801172006' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801172007' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801172008' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801172009' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801172010' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801172011' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801172012' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801172013' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801172014' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801172015' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801172016' and {stock.warehouse} = '8796093056981' or\n" +
        
        "{stock.productCode} = '2518801454004' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801454005' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801454006' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801454007' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801454008' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801454009' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801454010' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801454011' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801454012' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801454013' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801454014' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801454015' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801454016' and {stock.warehouse} = '8796093056981' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '8796093056981' or\n" +
        
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800001004' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800001005' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800001006' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800001007' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800001008' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800001009' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800001010' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800001011' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800001012' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800001013' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800001014' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800001015' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800001016' or\n" +
        
         "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800003004' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800003005' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800003006' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800003007' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800003008' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800003009' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800003010' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800003011' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800003012' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800003013' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800003014' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800003015' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800003016' or\n" +
        "{stock.productCode} = '2518801454017' and {stock.warehouse} = '2518800003017' or\n" +
    
        
        "{stock.productCode} = '2542029992184' and {stock.warehouse} = '8796093056981' ";

FlexibleSearchQuery query=new FlexibleSearchQuery(queryString);

SearchResult result=flexibleSearchService.search(query);


List<StockLevelModel> levelModelsList = result.getResult();


for (StockLevelModel stock:levelModelsList){
    stock.setAvailable(15000)
    modelService.save(stock);

}



println MessageFormat.format("Number of stocklevel modified: {0}", levelModelsList.size());




