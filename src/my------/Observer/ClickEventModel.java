package Observer;

import org.springframework.stereotype.Service;

/**
 * @author huyunlong
 * @version 1.0.0
 * @history<br/> <p/>
 * @since 1.0.0
 * description  点击事件模型
 */
@Service("clickEventModel")
public class ClickEventModel implements IClickEvent {

    private String name;

    public ClickEventModel(String name)
    {
        this.name = name;
    }

    @Override
    public void say(String name) {
        System.err.println("我被点击了:"+ name);
    }
}
