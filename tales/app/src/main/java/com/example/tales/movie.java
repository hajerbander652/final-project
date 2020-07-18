package com.example.tales;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class movie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        final ImageView hand = findViewById(R.id.imageView12);


        hand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotopage2 = new Intent(movie.this,bookpage2.class);
                startActivity(gotopage2);
            }
        });


       // Picasso.get().load("https://drive.google.com/file/d/1gZ6VPqbwBSEvhbwdRf8avYTUHlr93Tbj/view?usp=sharing");

        ArrayList<recmovie> mymovie = new ArrayList<>();

        recmovie movie1 = new recmovie("https://youtu.be/VyHV0BRtdxo","Harry potter" ,R.drawable.harrypotter,"هي سلسة من 6 افلام تحكي حكاية الصبي الساحر هاري بوتر منذ اكتشافة حقيقة كونة ساحرا وحتى بلوغة سن السابعة عشرة فتكتشف ماضية وعلاقاته السحرية");
        recmovie movie2 = new recmovie("https://youtu.be/BXfxLIuNJvw","The nutcracker",R.drawable.nutcracke,"قصة الفيلم فستجري حول فتاة شابة اسمها \"كلارا\" والتي تحتاج إلى مفتاج سحري فريد جدا من أجل فتح صندوق يحتوي على هدية ثمينة. في رحلتها هذه، سيقوده البحث عن هذا المفتاح إلى عالم موازي، غريب وغامض");
        recmovie movie3 = new recmovie("https://youtu.be/pYcGFLgJ8Uo","Narnia",R.drawable.narnai,"حينما يتم إجلاء عائلة بيفنسي إلى الريف،  تكتشف لوسي؛  خزانة بها باب ينقلها إلى عالم نارنيا العجيب؛ عالم نارنيا مغطي بالثلوج،ليكتشفوا بعد عبورهم جميعا إلى عالم نارنيا أن لزاما عليهم التصدي  للساحرة الشريرة");
        recmovie movie4 = new recmovie("https://youtu.be/CNNAgBPttyA","Little mermaid",R.drawable.littlemermaid,"ابنة ملك البحار الصغيرة (أريل) عروس البحار، لا يعجبها كثيرا عالم ما تحت الماء، ومعجبة للغاية بعالم البشر، وتتوق بشدة إلى الحياة كبشرية، فتعقد صفقة سيئة مع ساحرة البحار بعقد غير قابل للتدمير، لتحويلها إلى بشرية كي تقابل الأمير الذي أحبته، وعليها عمل شروط العقد بالكامل وإلا كانت العواقب وخيمة");
        recmovie movie5 = new recmovie("https://youtu.be/HKH7_n425Ss","Mulan",R.drawable.mulan,"تدور الأحداث حول فتاة شابة تعلم أن والدها الضعيف سيتم استدعاؤه في الجيش لمحاربة الهون، تقرر إخفاء هويتها الحقيقية والتنكر في هيئة رجل والانضمام للجيش مكانه، ");
        recmovie movie6 = new recmovie("https://youtu.be/V75dMMIW2B4","The lord of the rings",R.drawable.lordofthering," تدور احداث الفيلم حول شاب صغير من الـ هوبيت يسمى \"فرودو\" الذى يحاول الوصول الى جبل الهلاك ليدمر الخاتم, لإنقاذ الارض الوسطى من حكم الظلام. ومحاولة سيد الظلام \"سورون\" الحصول على الخاتم قبل ان يتم تدميرة.");
        recmovie movie7 = new recmovie("https://youtu.be/ng9rjC8MOgU","Jack the giant slayer",R.drawable.jack,
                "  أحد المزارعين يتسبب من دون قصد في فتح بوابة بين عالم العمالقة وعالم البشر، فتسعى العمالقة المخيفين للاستيلاء على الأرض، فيضطر جاك لخوض معركة قاتلة وضارية يقاتل فيها من أجل المملكة وأهلها، ويصارع وحوش ومحاربين لم يكن يعتقد في يوم من الأيام أنه يقابلهم، إلا في الأساطير والأحلام\n");
        recmovie movie8 = new recmovie("https://youtu.be/01rxgwVmxx0","Merlin",R.drawable.merlin,"تدور احداث المسلسل حول الساحر (ميرلين)، الذي قُدر له حماية الأمير (آرثر) ابن الملك (لوثر)، حيث يجب على (ميرلين) حماية الأمير خلال رحلته في توحيد ممالك الأرض الخمسة، ولا يعلم أحد بأن (ميرلين) ساحر إلا الطبيب (جايوس)، ولكن ما هو الشيء أو الاشياء التي يجب على (ميرلين) أن يحمي (آرثر) منها؟");
        recmovie movie9 = new recmovie("https://youtu.be/xko1Mx5w4tg","Percy jackson",R.drawable.percyjakson,"في عالم آلهة اﻷولمب، تُسرق الصاعقة، ويتهم (زيوس) ابن (بوسيدون) بسرقتها، مانحًا إياه 14 يومًا ﻹعادة الصاعقة، أو ستكون هناك حرب  بين اﻵلهة، يدخل الطالب (بيرسي جاكسون) في آتون هذه اﻷحداث حينما يكتشف أنه سليل ﻷحد آلهة الأولمب، وعليه إيجاد حل لأيقاف  الحرب التي تهدد الأولمب \n");
        recmovie movie10 = new recmovie("https://youtu.be/I99bp9SOhcQ","The spiderwick",R.drawable.spiderwick,"\n" +
                "تنتقل عائلة للعيش في منزل منعزل، ويبدأ كل فرد في العائلة بالتكيف مع الإقامة في المنزل، (سيمون) كان يهتم بالدراسة، و(مالوري) تحب ممارسة المبارزة بالسيف، أما (جارد) فيلاحظ أمورًا غير عادية تحدث بالمنزل، ويكتشف وجود عالم من الكائنات المدهشة التي ستعطيهم قوى غير عادية لمن يتفهم سرها.");
        recmovie movie11 = new recmovie("https://youtu.be/ZvtspevZxpg","Hercules",R.drawable.hercailes,"يتحول (هرقليز) ابن إله اليونان (زيوس)، إلى نصف إله ونصف بشر، عن طريق الشرير (هادس) إله الجحيم، الذي يخطط لإسقاط (زيوس)، ولكي يستعيد (هرقليز) سر الخلود، يخبره (زيوس) بأن عليه أن يصبح بطل حقيقي.");
        recmovie movie12 = new recmovie("https://youtu.be/JTSoD4BBCJc","Hobbit",R.drawable.hobbit,"\n" +
                "تقع أحداث الفيلم في الأرض الوسطى قبل 60 سنة من أحداث سيد الخواتم حيث تروي قصة الهوبيت \"بيلبو باجنز\" الذي يُستأجر من قبل الساحر \"غاندالف\" لمرافقة 13 قزم في مهمة عبر الأرض الوسطى لاستعادة \"lonely mountain\" من التنين \"Smaug\".");
        recmovie movie13 = new recmovie("https://youtu.be/QZblQLhKcZQ","Gretel & Hansel",R.drawable.hanselandgretal,"في زمن بعيد، وداخل قرية مسحورة، تصطحب فتاة صغيرة شقيقها الأصغر في رحلة عبر الغابات المظلمة بحثا عن الطعام والعمل، ولكن ينتهي بهما المطاف أمام عتبة الشر.");



        mymovie.add(movie1);
        mymovie.add(movie13);
        mymovie.add(movie3);
        mymovie.add(movie4);
        mymovie.add(movie5);
        mymovie.add(movie6);
        mymovie.add(movie7);
        mymovie.add(movie8);
        mymovie.add(movie9);
        mymovie.add(movie10);
        mymovie.add(movie11);
        mymovie.add(movie12);
        mymovie.add(movie2);







        RecyclerView rvmovie = findViewById(R.id.RV2);

       rvmovie.setHasFixedSize(true);
        RecyclerView.LayoutManager lmmovie = new GridLayoutManager(this,3);
        rvmovie.setLayoutManager(lmmovie);

        adaptermovie adapterM = new adaptermovie(mymovie,this);
        rvmovie.setAdapter(adapterM);


        /////
    }}