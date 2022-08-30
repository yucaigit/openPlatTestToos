package commonProperty;
/*
 * @Author LeiYc
 * @Date 2022/8/30 16:07
 * 用来存放共同的属性 通过单例模式来访问这些共同属性设置
 **/
public class CommonProperty {
    //存放生成密钥页面的属性
    private Boolean rsa_2 =false;
    private Boolean rsa = false;
    private Boolean stateSecret = false;


    public Boolean getRsa_2() {
        return rsa_2;
    }

    public void setRsa_2(Boolean rsa_2) {
        this.rsa_2 = rsa_2;
    }

    public Boolean getRsa() {
        return rsa;
    }

    public void setRsa(Boolean rsa) {
        this.rsa = rsa;
    }

    public Boolean getStateSecret() {
        return stateSecret;
    }

    public void setStateSecret(Boolean stateSecret) {
        this.stateSecret = stateSecret;
    }

    private static CommonProperty instance;
    public CommonProperty() {

    }
    public static CommonProperty getInstance(){
        if (instance == null){
            instance = new CommonProperty();
        }
        return instance;
    }

}
