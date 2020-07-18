package com.example.tales;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class folk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folk);
        final ImageView hand = findViewById(R.id.imageView8);


        hand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomain2 = new Intent(folk.this,MainActivity2.class);
                startActivity(gotomain2);
            }
        });

        ArrayList<folktitle> myfolk = new ArrayList<>();
        folktitle folk1 = new folktitle("◈ لماذا يطارد الثعلب الديك؟ ","في قديم الزمان كان الثعلب يهرب كلما رأى ديكا لاعتقاده ان عرفه الأحمر من ماده نارية وذلك لتشابه لون عرف الديك بالنار .\n" +
                "عرف الديك كلما لاح ولى الثعلب هاربا\n" +
                "الديك تملكته الدهشة وسأل نفسه :\n" +
                "لماذا يفر الثعلب  عند رؤيتي؟\n" +
                "سأل الديك الثعلب ذات يوم :\n" +
                "لماذا تهرب مني؟ ما انا إلا حيوان مثلك.\n" +
                "قال الثعلب وهو يرتجف وعيناه محدقتان  بعرف الديك: إني أخاف النار التي فوق رأسك.\n" +
                "فقال الديك : كلا هذه ليست نارا . أأنت مجنون كيف استطيع ان احمل نارا فوق رأسي وانا من لحم ودم ؟\n" +
                "اطمأن الثعلب وقال :حسنا...الان عرف ذلك.\n" +
                "فرد الديك ساخرا : هيا أيها الثعلب المس عرفي هو ليس نارا...لن يحرقك.\n" +
                "لمس الثعلب عرف الديك آمنا .ووجده ناعما .\n" +
                "فكر الثعلب وقال لنفسة : صحيح إن هذا العرف الناعم ليس نارا .. أليس هذا العرف لذيذ الطعم ..عند أكله. حاول الثعلب ذات مره فوجده كذلك. ومنذ ذلك الوقت والثعلب يطارد الديك ليصطاد عرفه الأحمر.   ","أسطورة من أنجولا :");
        folktitle folk2 = new folktitle("◈ السلحفاة والدب. ","جمعت الصداقة بين سلحفاة ودب .. كانت الصداقة حميمة بينهما . كانت السلحفاة والدب متعودين على تناول طعامهما سويا . كانت السلحفاة تهيئ الطعام وتدعو الدب لتناوله معها وفي اليوم التالي يهيء الدب الطعام ويدعو السلحفاة لتناوله معه .. وهكذا يدعو احدهما الآخر \n" +
                "\n" +
                "أراد الدب في أحد الأيام أن يتناول طعامه لوحده فلف نفسه حول إناء الطعام .. ولما جاءت السلحفاة لتناول الطعام معه فوجئت به وهو يلف نفسه حول إناء الطعام . \n" +
                "\n" +
                "دارت السلحفاة حوله مرات ومرات فلم تستطع لمس الإناء . \n" +
                "\n" +
                "مدت السلحفاة يدها إلى الإناء فنهرها الدب غاضبا : \n" +
                "\n" +
                "لماذا تدوسين على ذيلي ؟ \n" +
                "\n" +
                "انزعجت السلحفاة من الدب وذهبت إلى بيتها وقد خاب أملها في الدب في اليوم التالي أعدت السلحفاة الغداء وكانت قد ربطت حبلا في ذيلها ولفته حول إناء الطعام . \n" +
                "\n" +
                "جاء الدب ليتناول الطعام معها ولما أراد أن يمد يده نهرته وصاحت غاضبة : \n" +
                "\n" +
                "لماذا تدوس على ذيلي هكذا ؟ \n" +
                "\n" +
                "سأل الدب السلحفاة : متي أصبحت كبيرة بهذا الحجم ؟ \n" +
                "\n" +
                "فأجابته السلحفاة بتحد : الرجل يعلم الرجل أن يكون طويلا وقصيرا. \n","أسطورة من الكاميرون :");
        folktitle folk3 = new folktitle("◈ فأر المدينة وفأر القرية . ","بينما كان فارالمدينة يسير في أحد شوارع القرية ذات يوم لاحظ \n" +
                "\n" +
                "أن فارالقرية كان يأكل طعاما عفنا وجوزا قذرا . \n" +
                "\n" +
                "فأر المدينة : مرحبا أيها الصديق \n" +
                "\n" +
                "فأر القرية : مرحبا بك \n" +
                "\n" +
                "فأر المدينة : إنني في حيرة منك \n" +
                "\n" +
                "فأر القرية : وما سبب حيرتك ؟ \n" +
                "\n" +
                "فأر المدينة : كيف يمكنك أن تأكل الطعام القذر هذا ؟ \n" +
                "\n" +
                "فأر القرية : وماذا تأكل أنت ؟ \n" +
                "\n" +
                "فأر المدينة : أنا آكل طعاما دسما في أي وقت أشاء وبأي مقدار أريد \n" +
                "\n" +
                "عجب فأر القرية من كلام فأر المدينة وقال له : أهذا معقول ؟ \n" +
                "\n" +
                "فقال فأر المدينة : طبعا ... تعال معي وسترى بأم عينك .. وثق أنك سوف لن تعود إلى هذا المكان مرة ثانية \n" +
                "\n" +
                "سار فأر القرية خلف فأر المدينة ... وعندما وصلا إلى المدينة وجدا طعاما دسما وفيرا في المطبخ الذي قاده إليه صديقه فأر المدينة . لم تمض دقيقة من بدء أكلهما حتى سمعا وقع أقدام \n" +
                "\n" +
                "صاح فأر المدينة : اجر .. اجر لتنقذ حياتك . ، هرب الفاران معا ... \n" +
                "\n" +
                "وبعد أن خرج فأر القرية لاهثا قال : سأعود إلى الحقل لأكل طعامي القذر \n" +
                "\n" +
                "بدون خوف لأني أفضل أن أكون فقيرا وسعيدا من أن أكون غنيا وتعسا .. \n","أسطورة من السنغال :");
        folktitle folk4 = new folktitle("◈ لماذا اوراق شجر الارز والتنوب والصنوبر لاتذبل؟","\n" +
                "حدثت هذه القصة في قديم الزمان ، عندما كانت اوراق شجر الارز والتنوب والصنوبر تصفر وتذبل وتتساقط في فصل الخريف ، وقبل ان تصبح مخضره ومزهرة طوال فصل الشتاء . \n" +
                "\n" +
                "بدات هذه القصة عندما خرج صياد في يوم من الايام الى الغابة للصيد . راح هذه الصياد داخل الغابه وابتعد حتى وصل الي مكان لم يستطيع احد الصيادين الوصول له . هناك وجد الصياد مستنقعا طويلا وكبير بحيث لايمكن لاي حيوان عبورة او حتى طائر يطير من فوقه . فقال الصياد لنفسه : اذا كانت الحيوانات والطيور لا يستطيعون اجتياز هذه المستنقع فاي من الحيوانات والوحش يعيش على تلك الارض !؟ ... وكلما زاد تفكير الصياد بتلك الارض زاد فضوله فقال : علي معرفة مافي تلك الارض . علي عبور المستنقع مهما كلف الامر . تراجع الصياد لوراء قليلا ثم انطلق يجري بسرعه ليقفز عاليا فوق المستنقع . نجح الصياد في العبور فبدا ينظر حوله كانت الارض والاشجار نفسها فقال : ياللسخف لم تكن هناك حاجة للقفز ... فجاء خرجت سبعه ارانب يمتطيها سبع رجال صغار كانوا يشبهون البشر كثيرا ولاكنهم اصغر حجما . سألهم الصياد : من انتم!؟ فقالوا : نحن الرجال الخالدون نحن من اغتسلوا بماء الحياة ... ولكن من انت؟ فاجاب : انا صياد فصفقوا الرجال الصغار من شده الفرحة تقدم اكبرهم وقال للصياد : لقد اتى الى ارضنا وحش مرعب قام بمهاجمة احد افراد قبيلتنا وقتله ، نحن رجال خالدون لانموت الا اذا هاجمنا وحش ، انت صياد فهل تستطيع مساعدتنا ؟ فاجابة الصياد : لم لا؟ انا موافق . لاكنه قال لنفسه : هل ساكون قادر على مواجهه هذه الوحش؟ . انطلق الصياد باحثا عن الوحش لاكنه لم يجد سوى اثار اقدام الارانب ولاكن لاحظ الصياد وجود اثار السمور . وجدا الصياد السمور فقتلة ثم قام بسلخ جلدة واخذه معه لعله يستفيد منه .تابع الصياد البحث عن الوحش ولاكنه لم يجد اي دليل فعاد الى الاقزام وقال لهم : لم اجد وحشكم المرعب الذي تحدثتوا عنه كل ما وجدته كان ههذ السمور . صاح الرجال الصغار وقالوا : هذه هو الوحش الذي قتل صاحبنا ! قال كبيرهم للصياد : لقد انقذتنا من هذه الوحش لذلك سنجازيك على احسانك فقد انتظرنا. في يوم من الايام سوف نزورك ونحضر معنا ماء الحياة لك لكي تغتسل به وتصبح خالد مثلنا . ودع الصياد الرجال الصغار وعاد الى منزله حيث جلس ينتظر قدوم ضيوف مضت الايام ولم ياتي الضيوف ونسي الصياد امرهم ووعدهم له . وعندما حل الشتاء وتجمد كل شي خرج نساء القرية الى الغابه لجمع الحطب فجاء شاهدت النساء ارانب يمتطيها رجال صغار يحملون بايديهم جره فيها ماء الحياة .انفجرن النساء من الضحك عليهم فغضب الرجال الصغار من هذه السخرية فالتفت كبيرهم للخلف وامرهم بسكب ماء الحياة على الارض وعادوا من حيث اتوا .. فبذالك لم يحصل الصياد على ماء الحياة ولاكن بالمقابل حصلت شجرة الارز والصنوبر والتنوب عليه. ومن ذالك الحين وهذه الاشجار خضراء زاهيه لا تصفر اوراقها ولا تتساقط طوال العام \n" +
                "\n","أسطورة من روسيا :");
        folktitle folk5 = new folktitle("◈ الإخلاص والخيانه. ","يحكى أن برهميا أنقذ نمرا وقردا وأفعي وإنسانا من نبع ماء فنفحه القرد بعض الفاكهة كان قد جمعها من حديقة قصر المهراجا . \n" +
                "\n" +
                "وأهداه النمر سلسلة ذهبية كان قد سلبها من ابن أحد الملوك الذي كان قد وقع في أسره . \n" +
                "\n" +
                "قدم البرهمي السلسلة إلى الإنسان الذي كان قد أنقذه كذلك وكان هذا صائغ ذهب على أن صائغ الذهب هذا أدرك أنه قد سبق له أن صاغ هذه السلسلة لابن الملك فأعلن أن البرهمي هو قاتل ابن الملك . \n" +
                "\n" +
                "زج بالبرهمي في السجن وعندئذ طلب البرهمي من الحية مساعدة فلدغت الحية الملكة وتركت سمومها تسرى في جسدها . \n" +
                "\n" +
                "ولم يكن في وسع أحد أن يشفى الملكة سوى البرهمي وهكذا حدث أن كشف الشر الذي دبره صائغ الذهب فقتل ، أما البرهمي فقد كوفي بسخاء \n" +
                "\n","أسطورة من الهند :");
        folktitle folk6 = new folktitle("◈ اوراشيما تارو. ","في أحد الأيام شاهد أحد الصيادين يدعى أوراشيما تارو سلحفاة صغيرة كادت أن تموت بفعل بعض الأطفال. فقام تارو بإنقاذ السلحفاة وأعادها للمياه. وفي اليوم التالي عندما خرج تارو بالقارب للصيد همست السلحفاة الصغيرة لتارو وقالت بانها تريد شكره على انقاذها بالامس وسوف تاخذه الى قصر التنين فاخبرته ان يصعد على ظهرها \n" +
                "\n" +
                "فقال لها : من المستحيل الركوب عليه فهو صغير فاجابته : حاول الركوب ثم قرر اذا كان مستحيل ام لا . فعندما اعاد تارو ينظر لظهر السلحفاة وجده قد نما بسرعة فجلس على ظهرها وغاصت بعمق المحيط وعندما وصلوا الى قصر التنين اخبرت السلحفاة الصغيره تارو بانها ابنه امبراطور البحر وقالت له انه يستطيع العيش هنا في ارض الشباب الابدي حيث لايوجد حزن . فوافق تارو على العيش هناك ولكن بعد بضعه ايام تذكر تارو والديه وقرر العود حتى يرعاهما فاستأذن من السلحفاة الصغيرة فقالت السلحفاة له انها تتمنى ان يقضي معهم وقت اطول ومع ذالك فهي تتمنى له حياه سعيدة فوافقت لطلب تارو واعطته صندوق واخبرته ان ما بداخل الصندوق شيء ثمين وعلية الا يفتحة ابدا مهما كان السبب وان يحتفظ به . ثم ودعها تارو وجلس على ظهر سلحفاة وعادة الى قريته \n" +
                "\n" +
                "ولكن عند عودته للقرية فوجئ بتغير كل شي. فقد اختفى أصحابه وأبوية وبيته وكل من عرفهم. لم يتعرف على أهل القرية. فسألهم إذا كانوا يعرفوا شخص يدعى أوراشيما تارو فأخبروه أنهم سمعوا عن هذا الشخص وأنه قد أختفى في البحر منذ زمن بعيد. علم تارو بعد سؤال اهل القرية أنه مضى 300 سنه منذ أن ترك القرية ونزل إلى البحر. \n" +
                "\n" +
                "لم يفهم تارو ماذا حدث فقرر فتح الصندوق ظنا بان الصندوق قد يحتوي على دليل لطريق العوده الى السلحفاة الصغيرة وعلى رغم من تحذير السلحفاة الصغيره له الا انه فتحة فرأى دخان أبيض كثيف يخرج من الصندوق وفجأه انحنى ظهره وتقدم في العمر سنين ونبتت لحيته البيضاء وأصبحت طويلة. وجاءه صوت السلحفاة الصغيرة الحزين من البحر تقول له ألم أخبرك ألا تفتح الصندوق؟! إنه عمرك الطويل... \n" +
                "\n" +
                "\n" +
                "لذلك يجدر بنا طاعه من هم اكثر حكمة منا وعدم عصيانهم . فالعصيان كان بداية كل -البؤس و- الاحزان في الحياة \n","أسطورة من اليابان :");
        folktitle folk7 = new folktitle("◈ الرجل و التنين. ","زعموا أن رجلا تبعه فيل هائج فنجا من خوفه إلى بئر فتدلى فيه وتعلق بغصنين كانا على سمائها فوقعت رجلاه على شيء في طي البئر فإذا حيات أربع قد أخرجن رؤوسهن من أجحارهن . \n" +
                "\n" +
                "ثم نظر فإذا في قاع البئر تنين فاتح فاه منتظرة له ليقع فيأخذه ، فرفع بصره إلى الغصنين فإذا في أصلهما جرذان : أسود وأبيض وهما يقرضان الغصنين دائبين لا يفتران . \n" +
                "\n" +
                "فبينما هو في النظر لأمره والاهتمام لنفسه إذ أبصر قريبا منه كوارة فيها عسل نحل فذاق العسل فشغلته حلاوته وألهته لذته عن الفكرة في شيء من أمره وأن يلتمس الخلاص لنفسه ولم يذكر أن رجليه على حيات أربع لا يدري متى يقع عليهن ولم يذكر أن الجرذين دائبان في قطع الغصن ومتى انقطعا وقع على التنين \n" +
                "\n" +
                ". فلم يزل هذا الرجل لاهيا غافلا مشغوفا بتلك الحلاوة حتى سقط في فم التنين فهلك . \n" +
                "\n","من أساطير كليله ودمنة :");
        folktitle folk8 = new folktitle("◈ لماذا لايخرج الخفاش إلا ليلا ؟ ",
                "اندلعت حرب بين الطيور والحيوانات في يوم من أيام الزمان . \n" +
                "\n" +
                "الخفاش لم يكن مع الطيور ضد الحيوانات .. ولم يكن مع الحيوانات ضد الطيور .. الخفاش ظل على الحياد .. \n" +
                "\n" +
                "رأی الخفاش أن النصر والغلبة ستكون للطيور فطار وطلب الانضمام إليهم \n" +
                "\n" +
                "سأله أحد الطيور : لماذا جئت إلى معسكرنا ؟ \n" +
                "\n" +
                "اجابة الخفاش : إنني واحد منكم . أنا من الطيور . انظر إلى جناحي . الطيور قبلته في معسكرها . \n" +
                "\n" +
                "الحيوانات أعادت ترتيب وضعها الحربي .. وضعت خطة وشنت الحرب على الطيور وانتزعت النصر منهم . \n" +
                "\n" +
                "طار الخفاش إلى معسكر الحيوانات فسأله أحدهم : لماذا جئت إلى معسكرنا ؟ \n" +
                "\n" +
                "قال الخفاش : أنا واحد منكم ألا تستطيع رؤية شكلي .. أسناني الصغيرة . \n" +
                "\n" +
                "قال الحيوان : أنت جاسوس لأني رأيتك في معسكر الطيور \n" +
                "\n" +
                "الحيوانات رفضت قبول الخفاش في معسكرها \n" +
                "\n" +
                "الطيور رفضت قبول الخفاش بين مجموعتها . \n" +
                "\n" +
                "ومنذ ذلك الوقت والخفاش منبوذ من الطرفين ، وازدادت عزلته حتى أصبح لا يخرج من وكره إلا ليلا خوفا على حياته من الطيور والحيوانات إذا رأته . \n" +
                "\n","أسطورة أوغندية :");
        folktitle folk9 = new folktitle("◈ جاك والفاصولية . ",
                "كان يمكان في قديم الزمان طفل يدعى جاك ، يعيش مع والدته ، وكانوا لا يملكون إلا بقرة وحيدة نحيفة لا تدر الكثير من اللبن ، فطلبت الأم من جاك ، أن يصطحب البقرة إلى السوق ليبيعها ، لأنهم لا يملكون المال الكافي لإطعامها ، فتوجه جاك إلى السوق ، وفي الطريق قابله رجل وسأله :أين تذهب بتلك البقرة ، أجابه جاك : أنني ذاهب إلى السوق لأبيعها كما طلبت أمي . \n" +
                "\n" +
                "فقال له الرجل : أنا سأشتريها منك ، مقابل تلك الحبوب السحرية ، وأعطاه الرجل مجموعة من حبوب الفاصوليا وأخبره أنها حبوب سحرية ، وعندما عاد جاك الى والدته سألته ، هل بعت البقرة ، أجاباها : نعم بعتها ، فسألته الأم عن المال الذي باع به البقرة فأخبرها بما حدث ، وأعطاها حبوب الفاصوليا . \n" +
                "\n" +
                "\n" +
                "فغضبت الأم وثارت ، وقامت بإلقاء الحبوب من النافذة ، فسقطت في حديقة المنزل ، وحزن جاك جدًا لأنه أغضب والدته وأضاع بقرتهم الوحيدة في مقابل بعض الفاصوليا ، توجه جاك إلى فراشة دون أن يتناول عشاؤه ، وظل يبكي حتى غلبه النعاس . \n" +
                "\n" +
                "في الصباح عندما استيقظ جاك ، لاحظ وجود شيء غريب بجوار نافذة حجرته ، فذهب ينظر من النافذة ، فوجد حبة فاصوليا عملاقة قد نبتت في حديقة منزلهم ، فتعجب جاك وقام بتسلق النبتة ، وأخذ يصعد حتى وجد أمامه شيء عجيب ، لقد وجد قصرًا عملاقًا فوق نبتة الفاصوليا ، دخل جاك القصر ليرى ما بداخله ، فوجد مجموعة من الهياكل العظمية تقوم بحراسة وحشًا عملاقًا ، وكان الوحش نائمًا حين دخل جاك . \n" +
                "\n" +
                "\n" +
                "ولكن الهياكل العظمية حين رأت جاك قامت بإصدار بعض الأصوات لتنبه العملاق فاستيقظ من نومه ، فهرب جاك على الفور واختبأ خلف أحد الكراسي ، وأخذ العملاق يبحث في القصر فلم يجد جاك ، فتوجه إلى المطبخ وتناول الكثير من اللحم ، ثم أخرج من جيبه كيس من النقود الذهبية ، ووضعها فوق الطاولة ، ثم عاد ودخل في نوم عميق . \n" +
                "\n" +
                "خرج جاك مسرعًا وتناول كيس النقود ، ونزل مسرعًا عائدًا إلى بيته ، ثم أعطى لوالدته كيس النقود الذهبية ، تعجبت الأم وسألت جاك : من أين أحضرت تلك النقود ؟، فحكى لها عما حدث ، تعجبت الأم ولكنها فرحت بالنقود . \n" +
                "\n" +
                "وفرح جاك لأنه أحضر النقود ، وفي اليوم التالي عاد وتسلق النبتة من جديد ودخل في هدوء ، فوجد العملاق نائمًا ، ولكن حين دخل جاك ، أصدرت الهياكل العظمية بعض الأصوات فأيقظت العملاق ، وأخذ يبحث في القصر لكنه أيضًا لم يجد شيئًا ، فذهب إلى المطبخ وتناول اللحم ، ثم عاد فأحضر دجاجة ووضعها على المنضدة ، وقال لها :  هيا بيضي بيضة ذهبية ، فباضت الدجاجة بيضة ذهبية ، فتناولها ووضعها في سلة البيض الذهبي . \n" +
                "\n" +
                "\n" +
                "انتظر جاك حتى نام العملاق ، وأخذ الدجاجة ونزل مسرعًا إلى منزله ، وأعطاها لوالدته ، ففرحت بها جدًا ، لذلك قرر جاك أن يذهب إلى منزل العملاق مجددًا ، وفي اليوم التالي تسلق جاك النبتة ، لكنه هذه المرة وجد العملاق مستيقظًا ويقوم بالعزف على قيثارة ، أعجب جاك بصوت القيثارة ، فاختبأ حتى نام العملاق ، وحاول الإمساك بالقيثارة ، ولكنها كانت قيثارة سحرية ، فصرخت بصوت عال ، أنقذني يا سيدي إنه يحاول سرقتي . \n" +
                "\n" +
                "فأستيقظ العملاق وأخذ يطارد جاك ، فتسلق جاك النبتة ونزل عائدًا إلى بيته ، فتبعه العملاق ، أسرع جاك بالتقاط فأس ، وقام بقطع نبتة الفاصوليا ، فسقط العملاق ومات ، بعد ذالك انتقل جاك ووالدته إلى منزل جديد وقاموا بشراء مزرعة ، وبها الكثير من الأبقار ، وعاشوا سعداء. \n","أسطورة من امريكا :");
        folktitle folk10 = new folktitle("◈ لماذا البحر مالح ؟ ",
                "منذ زمن بعيد كانت مياه البحر حلوة المذاق كمثيلاتها من مياه الأنهار والبحيرات، ولم يكن ممكنا الحصول على الملح بمجرد فصله عن مياه البحر، لذا كان الملح ثمينا جدا، أثمن من الذهب والمجوهرات.\n" +
                "\n" +
                " في ذلك الوقت كان يعيش لارس وأخوه هانس في إحدى وديان النرويج، وكان لارس الأخ الأكبر غنيا جدا، بل أغنى تجار الوادي وكان تاجرا يعمل في تجارة الملح الذي يستورده من جزر الجنوب، وكان أخوه هانس فقيرا جدا ويعيش قرب الشاطئ مع عائلته الكبيرة. \n" +
                "\n" +
                "لم يكن صيد ذلك العام وفيرا ولم تجد عائلة هانس ما تقتات به، فاضطر هانس طلب المساعدة من أخيه لارس الغني جدا، فأجابه أخوه: \n" +
                "\n" +
                "\"عليك ببقايا الطعام، وهذه آخر مرة أساعدك فيها وستلقى معاملة مختلفة إذا فكرة بطلب المساعدة مني في المرة القادمة، والأجدر بك يا من لا تصلح لشيء أن تذهب إلى الهاوية، هيا أغرب عن وجهي\". \n" +
                "\n" +
                "كان هانس ساذجا جدا ومطيعا فقرر الذهاب والبحث عن الهاوية كما نصحه أخوه، وبدأ يسأل الناس عن طريق الهاوية، فقال له عجوز وهو يسخر منه : \n" +
                "\n" +
                "\"الهاوية في نهاية هذا الطريق\" \n" +
                "\n" +
                "صدق هانس المسكين كلام العجوز ومشى في ذلك الطريق مسافة طويلة حتى بلغ الغابة، وقد كان التعب قد نال منه فجلس تحت شجرة ليرتاح، ولكنه سقط في حفرة عميقة ، سمع صوت غناء فزحف داخل الحفرة في اتجاه ذلك الصوة حتى وصل إلى مكان غريب في داخله الأشرار يرقصون ويغنون. \n" +
                "\n" +
                "سأل هانس أحد الأشرار: \n" +
                "\n" +
                "\"معذرة لأني قاطعتكم أثناء الرقص، ولكن هل هذه هي الهاوية؟\" \n" +
                "\n" +
                "تفاجأ الأشرار من وجود هانس في مخبئهم وسألوه: \n" +
                "\n" +
                "\"من أنت وكيف وصلت إلى هنا، أخبرنا\". \n" +
                "\n" +
                "\"أنا إسمي هانس يا سيدي\" \n" +
                "\n" +
                "\"هانس؟ لم أسمع بهذا الاسم من قبل، هل لديه حجز مسبق؟\" \n" +
                "\n" +
                "فأجابه شرير آخر: \n" +
                "\n" +
                "\"سأتأكد من ذلك..... ليس لديه حجز مسبق\" \n" +
                "\n" +
                "\"يا لك من غبي ! ما الذي تريده من تجوالك هنا من دون حجز مسبق؟ أين تظن نفسك؟ لا يسمح بالدخول هنا من دون حجز مسبق\" \n" +
                "\n" +
                "\"أنا آسف يا سيدي لم أكن أعلم بذلك\" رد هانس وهم بالرجوع من حيث جاء، وعندها سأله أحد الأشرار: \n" +
                "\n" +
                "\"ما الذي تحمله في هذا الكيس يا هانس؟\" \n" +
                "\n" +
                "\"بعض بقايا اللحوم يا سيدي\" \n" +
                "\n" +
                "\"ماذا لحوم؟ ما رأيك أن تبدلنا اللحوم ببعض من كنوزنا؟\" \n" +
                "\n" +
                "كان الأشرار يحبون اللحوم كثيرا لذلك عرضوا على هانس أن يبدلهم بقايا اللحوم بطاحونة سحرية بإمكانها إعطاء هانس كل ما يتمناه منها. \n" +
                "\n" +
                "\"عندما تكتفي اهمس للطاحونة بهذه الكلمات الثلاثة...\" \n" +
                "\n" +
                "وأخبر الشرير هانس بالكلمات التي توقف الطاحونة عن العمل \n" +
                "\n" +
                "بعد ذلك لم يشعر هانس بشيء ولما استعاد وعيه وجد نفسه عند بيته وفي يده الطاحونة السحرية، دخل البيت فأخذت زوجته تأنبه لعدم جلب طعام للأطفال، وعندها وضع هانس الطاحونة على الأرض وأمرها بكل ما كان يشتهي من الطعام وأثاث فاخر للبيت، فلبت الطاحونة ذلك ودهشت زوجته من ذلك كثيرا، وأكلت العائلة حتى شبعت وكانت تلك أسعد ليلة تمر عليهم. \n" +
                "\n" +
                "ومنذ ذلك اليوم أصبح هانس أغنى رجل في المدينة بفضل الطاحونة السحرية، ولما سمع أخوه لارس بأمر الطاحونة فكر أنها ستغنيه عن استيراد الملح من الجنوب، وسيكون بإمكانه إنتاج ما يريده من الملح ويصبح أغنى رجل في العالم، لذلك قرر الحصول عليها بأي وسيلة... \n" +
                "\n" +
                "فكر لارس في طريقة للحصول على الطاحونة، وفي ليلة ممن الليالي تسلل إلى قصر أخيه هانس وتمكن من سرقة الطاحونة، قرر السفر إلى بلاد بعيدة ليبيع الملح الذي ستعطيه الطاحونة فركب سفينته وابحر في الحال... \n" +
                "\n" +
                "وفي عرض البحر قرر لارس تجريب الطاحونة فأمرها بإنتاج ملح أبيض، وبالفعل بدأ الملح يتدفق من الطاحونة وفرح لارس كثيرا، ملئ الملح السفينة وعندها حاول لارس إيقافها ولكنه لا يعلم الكلمات الثلاثة التي تتوقف بها الطاحونة فبدأ الملح بالتدفق إلى البحر من دون توقف... \n" +
                "\n" +
                "غرقت السفينة واستقرت الطاحونة في قاع البحر وهي إلى اليوم تنتج الملح ولهذا السبب ماء البحر مالح... ","أسطورة من النرويج :");
        myfolk.add(folk1);
        myfolk.add(folk2);
        myfolk.add(folk3);
        myfolk.add(folk4);
        myfolk.add(folk5);
        myfolk.add(folk6);
        myfolk.add(folk7);
        myfolk.add(folk8);
        myfolk.add(folk9);
        myfolk.add(folk10);


        RecyclerView rvfolk = findViewById(R.id.RV3);

        rvfolk.setHasFixedSize(true);
        RecyclerView.LayoutManager lmfolk = new LinearLayoutManager(this);
        rvfolk.setLayoutManager(lmfolk);

        adapterfolk adapterF = new adapterfolk(myfolk,this);
        rvfolk.setAdapter(adapterF);


        ///
    }
}