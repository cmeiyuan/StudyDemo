import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by cmy on 2018/11/1
 */
public class ProductList {

    @SerializedName("code")
    private int code;
    @SerializedName("msg")
    private String msg;
    @SerializedName("data")
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        @SerializedName("name")
        private String name;
        @SerializedName("type")
        private int type;
        @SerializedName("foods")
        private List<FoodsBean> foods;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public List<FoodsBean> getFoods() {
            return foods;
        }

        public void setFoods(List<FoodsBean> foods) {
            this.foods = foods;
        }

        public static class FoodsBean {
            @SerializedName("id")
            private String id;
            @SerializedName("name")
            private String name;
            @SerializedName("price")
            private double price;
            @SerializedName("description")
            private String description;
            @SerializedName("icon")
            private String icon;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }

}
