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
        "{stock.productCode} = '2542029992184' and {stock.warehouse} = '8796093056981' ";

FlexibleSearchQuery query=new FlexibleSearchQuery(queryString);

SearchResult result=flexibleSearchService.search(query);


List<StockLevelModel> levelModelsList = result.getResult();


for (StockLevelModel stock:levelModelsList){
    stock.setAvailable(15000)
    modelService.save(stock);

}



println MessageFormat.format("Number of stocklevel modified: {0}", levelModelsList.size());




