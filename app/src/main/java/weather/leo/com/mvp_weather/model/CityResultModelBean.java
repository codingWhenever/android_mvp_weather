package weather.leo.com.mvp_weather.model;

import java.util.ArrayList;

/**
 * Created by lulei on 2016/4/19.
 */
public class CityResultModelBean {

    /**
     * resultcode : 200
     * reason : successed!
     * result : {"sk":{"temp":"21","wind_direction":"东北风","wind_strength":"2级","humidity":"77%","time":"09:39"},"today":{"temperature":"21℃~24℃","weather":"阴","weather_id":{"fa":"02","fb":"02"},"wind":"东风4-5 级","week":"星期二","city":"深圳","date_y":"2016年04月19日","dressing_index":"较舒适","dressing_advice":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。","uv_index":"最弱","comfort_index":"","wash_index":"较不宜","travel_index":"较适宜","exercise_index":"较适宜","drying_index":""},"future":{"day_20160419":{"temperature":"21℃~24℃","weather":"阴","weather_id":{"fa":"02","fb":"02"},"wind":"东风4-5 级","week":"星期二","date":"20160419"},"day_20160420":{"temperature":"22℃~25℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"微风","week":"星期三","date":"20160420"},"day_20160421":{"temperature":"23℃~27℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"微风","week":"星期四","date":"20160421"},"day_20160422":{"temperature":"23℃~28℃","weather":"阵雨","weather_id":{"fa":"03","fb":"03"},"wind":"微风","week":"星期五","date":"20160422"},"day_20160423":{"temperature":"23℃~26℃","weather":"阵雨转雷阵雨","weather_id":{"fa":"03","fb":"04"},"wind":"微风","week":"星期六","date":"20160423"},"day_20160424":{"temperature":"23℃~28℃","weather":"阵雨","weather_id":{"fa":"03","fb":"03"},"wind":"微风","week":"星期日","date":"20160424"},"day_20160425":{"temperature":"23℃~28℃","weather":"阵雨","weather_id":{"fa":"03","fb":"03"},"wind":"微风","week":"星期一","date":"20160425"}}}
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private ResultBean result;
    private int error_code;

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getResultcode() {
        return resultcode;
    }

    public String getReason() {
        return reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public int getError_code() {
        return error_code;
    }

    public static class ResultBean {
        /**
         * sk : {"temp":"21","wind_direction":"东北风","wind_strength":"2级","humidity":"77%","time":"09:39"}
         * today : {"temperature":"21℃~24℃","weather":"阴","weather_id":{"fa":"02","fb":"02"},"wind":"东风4-5 级","week":"星期二","city":"深圳","date_y":"2016年04月19日","dressing_index":"较舒适","dressing_advice":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。","uv_index":"最弱","comfort_index":"","wash_index":"较不宜","travel_index":"较适宜","exercise_index":"较适宜","drying_index":""}
         * future : {"day_20160419":{"temperature":"21℃~24℃","weather":"阴","weather_id":{"fa":"02","fb":"02"},"wind":"东风4-5 级","week":"星期二","date":"20160419"},"day_20160420":{"temperature":"22℃~25℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"微风","week":"星期三","date":"20160420"},"day_20160421":{"temperature":"23℃~27℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"微风","week":"星期四","date":"20160421"},"day_20160422":{"temperature":"23℃~28℃","weather":"阵雨","weather_id":{"fa":"03","fb":"03"},"wind":"微风","week":"星期五","date":"20160422"},"day_20160423":{"temperature":"23℃~26℃","weather":"阵雨转雷阵雨","weather_id":{"fa":"03","fb":"04"},"wind":"微风","week":"星期六","date":"20160423"},"day_20160424":{"temperature":"23℃~28℃","weather":"阵雨","weather_id":{"fa":"03","fb":"03"},"wind":"微风","week":"星期日","date":"20160424"},"day_20160425":{"temperature":"23℃~28℃","weather":"阵雨","weather_id":{"fa":"03","fb":"03"},"wind":"微风","week":"星期一","date":"20160425"}}
         */

        private SkBean sk;
        private TodayBean today;
        private FutureBean future;

        public void setSk(SkBean sk) {
            this.sk = sk;
        }

        public void setToday(TodayBean today) {
            this.today = today;
        }

        public void setFuture(FutureBean future) {
            this.future = future;
        }

        public SkBean getSk() {
            return sk;
        }

        public TodayBean getToday() {
            return today;
        }

        public FutureBean getFuture() {
            return future;
        }

        public static class SkBean {
            /**
             * temp : 21
             * wind_direction : 东北风
             * wind_strength : 2级
             * humidity : 77%
             * time : 09:39
             */

            private String temp;
            private String wind_direction;
            private String wind_strength;
            private String humidity;
            private String time;

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public void setWind_strength(String wind_strength) {
                this.wind_strength = wind_strength;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getTemp() {
                return temp;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public String getWind_strength() {
                return wind_strength;
            }

            public String getHumidity() {
                return humidity;
            }

            public String getTime() {
                return time;
            }
        }

        public static class TodayBean {
            /**
             * temperature : 21℃~24℃
             * weather : 阴
             * weather_id : {"fa":"02","fb":"02"}
             * wind : 东风4-5 级
             * week : 星期二
             * city : 深圳
             * date_y : 2016年04月19日
             * dressing_index : 较舒适
             * dressing_advice : 建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。
             * uv_index : 最弱
             * comfort_index :
             * wash_index : 较不宜
             * travel_index : 较适宜
             * exercise_index : 较适宜
             * drying_index :
             */

            private String temperature;
            private String weather;
            private WeatherIdBean weather_id;
            private String wind;
            private String week;
            private String city;
            private String date_y;
            private String dressing_index;
            private String dressing_advice;
            private String uv_index;
            private String comfort_index;
            private String wash_index;
            private String travel_index;
            private String exercise_index;
            private String drying_index;

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public void setWeather_id(WeatherIdBean weather_id) {
                this.weather_id = weather_id;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public void setDate_y(String date_y) {
                this.date_y = date_y;
            }

            public void setDressing_index(String dressing_index) {
                this.dressing_index = dressing_index;
            }

            public void setDressing_advice(String dressing_advice) {
                this.dressing_advice = dressing_advice;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public void setComfort_index(String comfort_index) {
                this.comfort_index = comfort_index;
            }

            public void setWash_index(String wash_index) {
                this.wash_index = wash_index;
            }

            public void setTravel_index(String travel_index) {
                this.travel_index = travel_index;
            }

            public void setExercise_index(String exercise_index) {
                this.exercise_index = exercise_index;
            }

            public void setDrying_index(String drying_index) {
                this.drying_index = drying_index;
            }

            public String getTemperature() {
                return temperature;
            }

            public String getWeather() {
                return weather;
            }

            public WeatherIdBean getWeather_id() {
                return weather_id;
            }

            public String getWind() {
                return wind;
            }

            public String getWeek() {
                return week;
            }

            public String getCity() {
                return city;
            }

            public String getDate_y() {
                return date_y;
            }

            public String getDressing_index() {
                return dressing_index;
            }

            public String getDressing_advice() {
                return dressing_advice;
            }

            public String getUv_index() {
                return uv_index;
            }

            public String getComfort_index() {
                return comfort_index;
            }

            public String getWash_index() {
                return wash_index;
            }

            public String getTravel_index() {
                return travel_index;
            }

            public String getExercise_index() {
                return exercise_index;
            }

            public String getDrying_index() {
                return drying_index;
            }

            public static class WeatherIdBean {
                /**
                 * fa : 02
                 * fb : 02
                 */

                private String fa;
                private String fb;

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }

                public String getFa() {
                    return fa;
                }

                public String getFb() {
                    return fb;
                }
            }
        }

        public static class FutureBean {
            /**
             * day_20160419 : {"temperature":"21℃~24℃","weather":"阴","weather_id":{"fa":"02","fb":"02"},"wind":"东风4-5 级","week":"星期二","date":"20160419"}
             * day_20160420 : {"temperature":"22℃~25℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"微风","week":"星期三","date":"20160420"}
             * day_20160421 : {"temperature":"23℃~27℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"微风","week":"星期四","date":"20160421"}
             * day_20160422 : {"temperature":"23℃~28℃","weather":"阵雨","weather_id":{"fa":"03","fb":"03"},"wind":"微风","week":"星期五","date":"20160422"}
             * day_20160423 : {"temperature":"23℃~26℃","weather":"阵雨转雷阵雨","weather_id":{"fa":"03","fb":"04"},"wind":"微风","week":"星期六","date":"20160423"}
             * day_20160424 : {"temperature":"23℃~28℃","weather":"阵雨","weather_id":{"fa":"03","fb":"03"},"wind":"微风","week":"星期日","date":"20160424"}
             * day_20160425 : {"temperature":"23℃~28℃","weather":"阵雨","weather_id":{"fa":"03","fb":"03"},"wind":"微风","week":"星期一","date":"20160425"}
             */

            private ArrayList<DayBean> list;

            public ArrayList<DayBean> getList() {
                return list;
            }

            public void setList(ArrayList<DayBean> list) {
                this.list = list;
            }





            public static class DayBean {
                /**
                 * temperature : 21℃~24℃
                 * weather : 阴
                 * weather_id : {"fa":"02","fb":"02"}
                 * wind : 东风4-5 级
                 * week : 星期二
                 * date : 20160419
                 */
                private String dayId;
                private String temperature;
                private String weather;
                private WeatherIdBean weather_id;
                private String wind;
                private String week;
                private String date;

                public String getDayId() {
                    return dayId;
                }

                public void setDayId(String dayId) {
                    this.dayId = dayId;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getTemperature() {
                    return temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public String getWeek() {
                    return week;
                }

                public String getDate() {
                    return date;
                }

                public static class WeatherIdBean {
                    /**
                     * fa : 02
                     * fb : 02
                     */

                    private String fa;
                    private String fb;

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }

                    public String getFa() {
                        return fa;
                    }

                    public String getFb() {
                        return fb;
                    }
                }
            }


        }
    }



}
