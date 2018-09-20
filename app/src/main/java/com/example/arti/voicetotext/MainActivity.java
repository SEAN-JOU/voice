package com.example.arti.voicetotext;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.AsyncTask;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;


public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    private TextView textInput,second;
    private final int REQ_CODE_SPEECH_INPUT = 100;
    private final int MY_DATA_CHECK_CODE = 150;
    private static final int REQ_TTS_STATUS_CHECK = 1;
    MyAsyncTask task;
    private TextToSpeech mTts;
    HashMap<String,ArrayList> hashMap =new HashMap<>();


    ArrayList<String>arrayList=new ArrayList<>();
    ArrayList<String>arrayList1=new ArrayList<>();
    ArrayList<String>arrayList2=new ArrayList<>();
    ArrayList<String>arrayList3=new ArrayList<>();
    ArrayList<String>arrayList4=new ArrayList<>();
    ArrayList<String>arrayList5=new ArrayList<>();
    ArrayList<String>arrayList6=new ArrayList<>();
    ArrayList<String>arrayList7=new ArrayList<>();
    ArrayList<String>arrayList8=new ArrayList<>();
    ArrayList<String>arrayList9=new ArrayList<>();
    ArrayList<String>arrayList10=new ArrayList<>();
    ArrayList<String>arrayList11=new ArrayList<>();
    ArrayList<String>arrayList12=new ArrayList<>();
    ArrayList<String>arrayList13=new ArrayList<>();
    ArrayList<String>arrayList14=new ArrayList<>();
    ArrayList<String>arrayList15=new ArrayList<>();
    ArrayList<String>arrayList16=new ArrayList<>();
    ArrayList<String>arrayList17=new ArrayList<>();
    ArrayList<String>arrayList18=new ArrayList<>();
    ArrayList<String>arrayList19=new ArrayList<>();
    ArrayList<String>arrayList20=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTts = new TextToSpeech(this, this);
        textInput = (TextView) findViewById(R.id.txtSpeechInput);
        second = (TextView) findViewById(R.id.second);

        arrayList.add("周資翔");
        arrayList.add("你呀");
        hashMap.put("帥",arrayList);

        arrayList1.add("新垣結依");
        arrayList1.add("你呀");
        hashMap.put("美",arrayList1);

        arrayList2.add("哈囉");
        arrayList2.add("幹嘛");
        hashMap.put("哈囉",arrayList2);

        arrayList3.add("屁孩 不要亂罵髒話");
        arrayList3.add("幹甚麼");
        hashMap.put("幹",arrayList3);

        arrayList4.add("悟空 你又頑皮了 怎麼能這樣跟觀音姐姐說話呢");
        arrayList4.add("靠甚麼");
        hashMap.put("靠",arrayList4);

        arrayList5.add("翁立友 能辦我取西經");
        arrayList5.add("翁立友 別怪師傅滴咕");
        hashMap.put("歌",arrayList5);

        arrayList6.add("五歲");
        arrayList6.add("一百歲");
        hashMap.put("歲",arrayList6);

        arrayList7.add("我是個賣菜的");
        arrayList7.add("被人研究");
        hashMap.put("你在做",arrayList7);

        arrayList8.add("外太空");
        arrayList8.add("行天宮");
        hashMap.put("住",arrayList8);

        arrayList9.add("憑你的智慧 我很難跟你解釋");
        arrayList9.add("所以說做妖就象做人一樣 要有仁慈的心 有了仁慈的心 就不再是妖 是人妖");
        hashMap.put("請問",arrayList9);

        arrayList10.add("小心啊！打雷嘍！下雨收衣服啊");
        arrayList10.add("小心啊！打雷嘍！下雨收衣服啊");
        hashMap.put("下雨",arrayList10);

        arrayList11.add("你媽貴姓");
        arrayList11.add("幹嘛");
        hashMap.put("媽",arrayList11);

        arrayList12.add("你爸貴姓");
        arrayList12.add("幹嘛");
        hashMap.put("爸",arrayList12);

        arrayList13.add("你想下我是下不倒地，我什麼都怕就不怕鬼");
        arrayList13.add("幹甚麼");
        hashMap.put("鬼",arrayList13);

        arrayList14.add("快點回火星吧，地球是很危險地");
        arrayList14.add("快點回火星吧，地球是很危險地");
        hashMap.put("拜拜",arrayList14);

        arrayList15.add("垃圾 我不是針對你呀 我是說在座的各位都是 垃圾");
        arrayList15.add("是你嗎");
        hashMap.put("垃圾",arrayList15);

        arrayList16.add("我對你的敬仰有如滔滔江水，聯綿不絕，有如黃河絕堤一發不可收拾");
        arrayList16.add("能不能有點專業精神");
        hashMap.put("淫",arrayList16);

        arrayList17.add("悟空 你又頑皮了 怎麼能這樣跟觀音姐姐說話呢");
        arrayList17.add("恩 你很棒");
        hashMap.put("雞",arrayList17);

        arrayList18.add("小強，你不能死啊");
        arrayList18.add("如今白髮人送黑髮人");
        hashMap.put("死",arrayList18);

        arrayList19.add("我一秒鐘幾十萬上下，我沒空陪你去踢球");
        arrayList19.add("你是空虛寂寞覺得冷嗎?");
        hashMap.put("陪我",arrayList19);

        arrayList20.add("你就是一個");
        arrayList20.add("不要聽，你會怕");
        hashMap.put("笑話",arrayList20);

    }
    @Override
    public void onInit(int status) {
        if(status==TextToSpeech.SUCCESS){
            int result=mTts.setLanguage(Locale.CHINESE);
            if(result==TextToSpeech.LANG_NOT_SUPPORTED||result==TextToSpeech.LANG_MISSING_DATA)
            {}else{}}
    }
    private void promptSpeechInput() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.CHINESE);
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, R.string.speech_prompt);
        try {
            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getApplicationContext(),
                    R.string.speech_not_supported,
                    Toast.LENGTH_SHORT).show();}}



    public void onResume(){
        super.onResume();

        task=new MyAsyncTask();
        task.execute(3);
        new Thread(new Runnable() {
            @Override
            public void run() {


            }}).start();


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case REQ_CODE_SPEECH_INPUT: {
                if (resultCode == RESULT_OK && data != null) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    textInput.setText(String.valueOf(result.get(0)).replaceAll("\\s",""));

                    if(result.get(0)!=""||result.get(0).trim()!=""){
                        mTts.speak(Answer.getIntence().sentence(String.valueOf(result.get(0)),hashMap), TextToSpeech.QUEUE_ADD,null);
                    }
                }
            }
            break;
            case MY_DATA_CHECK_CODE: {
                if (resultCode != TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
                    Intent installIntent = new Intent();
                    installIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
                    Log.v("Main", "need intallation");
                    startActivity(installIntent);
                }

            }
            case REQ_TTS_STATUS_CHECK: {
                switch (resultCode) {
                    case TextToSpeech.Engine.CHECK_VOICE_DATA_PASS:

                        break;
                    case TextToSpeech.Engine.CHECK_VOICE_DATA_BAD_DATA:
                        //文件已经损坏
                    case TextToSpeech.Engine.CHECK_VOICE_DATA_MISSING_VOLUME:
                        //缺少发音文件
                    case TextToSpeech.Engine.CHECK_VOICE_DATA_MISSING_DATA:
                        //数据文件丢失

                        //从新更新TTS数据文件
                        Intent mUpdateData=new Intent();
                        mUpdateData.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
                        startActivity(mUpdateData);

                        break;

                    case TextToSpeech.Engine.CHECK_VOICE_DATA_FAIL:
                        //检测失败应该重新检测
                        break;
                    default:
                        break;
                }}}}
    public class MyAsyncTask extends AsyncTask<Integer, Integer, String>
    {
        @Override
        protected String doInBackground(Integer... integers) {

            int n = integers[0];
            int i;
            for(i=n;i>=0;i--)
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                final int finalI = i;
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        second.setText(String.valueOf(finalI));
                    }});
            }
            return "OK";
        }
        @Override
        protected void onProgressUpdate(Integer... values){
            super.onProgressUpdate(values);
        }
        @Override
        protected void onPostExecute(String s){
            super.onPostExecute(s);
           promptSpeechInput();
        }
        @Override
        protected void onCancelled(String s) {
            super.onCancelled(s);
        }
        @Override
        protected void onCancelled() {
            super.onCancelled();
        }}

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        if(mTts!=null){
//            mTts.shutdown();
//        }
        this.finish();
    }

    @Override
    protected void onStop() {
        super.onStop();
//        if(mTts!=null){
//            mTts.shutdown();
//        }
        this.finish();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();

        this.finish();
    }
}
