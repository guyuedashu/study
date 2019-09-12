package Observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * @author huyunlong
 * @version 1.0.0
 * @history<br/> <p/>
 * @since 1.0.0
 * description 观察者模式  发布事件
 */
public class ObserverModel {

    @Autowired
    ApplicationContext applicationContext;

    public void click()
    {
        applicationContext.publishEvent(new ClickEventModel("huhuhuh"));
    }
}
