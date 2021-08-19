package org.vanguardhealth.healthyresponse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.vanguardhealth.healthyresponse.models.*;
import org.vanguardhealth.healthyresponse.repositories.*;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {
    @Resource
    private UserRepo userRepo;
    @Resource
    private MoodRepo moodRepo;
    @Resource
    private TriggerRepo triggerRepo;
    @Resource
    private CopingMechanismRepo copingMechanismRepo;
    @Resource
    private ConsequenceRepo consequenceRepo;
    @Resource
    private ResultRepo resultRepo;
    @Resource
    private ResponseRepo responseRepo;
    @Resource
    private AlternativesRepo alternativesRepo;
    @Resource
    private ActivityRepo activityRepo;
    @Resource
    private WorksheetRepo worksheetRepo;
    @Resource
    private IntakeProfileRepository profileRepo;
    @Resource
    private MessageRepository messageRepo;
    @Resource
    private ReplyRepository replyRepo;

    @Override
    public void run(String... args) throws Exception {

        Consequence jail = new Consequence("Jail","no bueno");
        consequenceRepo.save(jail);

        Mood afraid = new Mood("Afraid", "https://i.ibb.co/wcg76Dp/Afraid.jpg", "Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.\n","<a href=https://www.verywellmind.com/the-psychology-of-fear-2671696 target=_blank>What is Fear?</a>", "<a href=https://psychcentral.com/quizzes/anxiety-quiz#1 target=_blank>PsychCentral: Anxiety Screening Test</a>",
                "<a href=https://www.verywellmind.com/healthy-ways-to-face-your-fears-4165487 target=_blank>How to Face Your Fears</a>", "<a href=tel:800-950-6264>National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>"
                , "<a href=tel:800-273-8255>National Suicide Prevention Lifeline: 1-800-273-TALK (8255)</a>", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/O-6f5wQXSu8\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood anxious = new Mood("Anxious","https://i.ibb.co/ZcdsPNB/Anxious.jpg", "Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.\n", "<a href=https://www.verywellhealth.com/anxiety-symptoms-5086955 target=_blank>Anxiety Symptoms</a>", "<a href=https://psychcentral.com/quizzes/anxiety-quiz#1 target=_blank>PsychCentral: Anxiety Screening Test</a>", "<a href=https://www.verywellmind.com/9-things-to-do-if-you-feel-anxious-5087875 target=_blank>9 Things To Do If You Feel Anxious</a>", "<a href=tel:800-950-6264>National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>", "<a href=tel:800-273-8255>National Suicide Prevention Lifeline: 1-800-273-TALK (8255)</a>", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/O-6f5wQXSu8\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood sad = new Mood("Sad", "https://i.ibb.co/ZWc6p9H/Sad.jpg", "Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.\n", "<a href=https://www.verywellmind.com/sadness-is-not-depression-2330492 target=_blank>What is Sadness?</a>", "<a href=https://psychcentral.com/quizzes/depression-quiz target=_blank>PsychCentral: Do You Have Depression?</a>",
                "<a href=https://www.gundersenhealth.org/health-wellness/live-happy/healthy-ways-to-deal-with-sadness/ target=_blank>Healthy Ways To Deal With Sadness</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>", "<a href=tel:800-784-2433> National Hopeline Network: 1-800-SUICIDE (784-2433</a>", "<a href=tel:800-273-8255>National Suicide Prevention Lifeline: 1-800-273-TALK (8255)</a>",  "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/j7d5Plai03g\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood lonely = new Mood("Lonely", "https://i.ibb.co/DkPKB17/Lonely.jpg", "Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.\n", "<a href=https://www.verywellmind.com/loneliness-causes-effects-and-treatments-2795749 target=_blank>Loneliness: Causes and Health Consequences</a>", "<a href=https://psychcentral.com/quizzes/loneliness-quiz target=_blank>PsychCentral: The Loneliness Quiz</a>", "<a href=https://www.verywellmind.com/how-to-cope-with-loneliness-3144939 target=_blank>9 Ways to Cope With Loneliness</a>", "<a href=tel:741741>Crisis Text Line: Text “home” to 741741</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>", "<a href=tel:800-950-6264>National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)</a>", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/itZMM5gCboo\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood depressed = new Mood("Depressed", "https://i.ibb.co/3SfxPdm/Depressed.jpg", "Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.\n",
                "<a href=https://www.verywellmind.com/depression-4157261 target=_blank>Depression</a>", "<a href=https://psychcentral.com/quizzes/depression-quiz target=_blank>PsychCentral: Do You Have Depression?</a>", "<a href=https://www.verywellmind.com/how-do-i-tell-a-doctor-im-depressed-1067387 target=_blank>How to Tell Your Doctor You're Depressed</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>", "<a href=tel:800-784-2433>National Hopeline Network: 1-800-SUICIDE (784-2433)</a>", "<a href=tel:800-273-8255>National Suicide Prevention Lifeline: 1-800-273-TALK (8255)</a>", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/j7d5Plai03g\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>" );
        Mood hopeless = new Mood("Hopeless", "https://i.ibb.co/LNDqPDH/Hopeless.jpg", "Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.\n", "<a href=https://psychcentral.com/blog/the-9-types-of-hopelessness-and-how-to-overcome-them target=_blank>9 Types of Hopelessness and How to Overcome Them</a>", "<a href=https://psychcentral.com/quizzes/depression-quiz target=_blank>PsychCentral: Do You Have Depression?</a>", "<a href=https://www.verywellmind.com/9-things-to-do-if-you-feel-hopeless-5081877 target=_blank>9 Things to Do If You Feel Hopeless</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>", "<a href=tel:800-784-2433>National Hopeline Network: 1-800-SUICIDE (784-2433)</a>", "<a href=tel:800-273-8255>National Suicide Prevention Lifeline: 1-800-273-TALK (8255)</a>", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/xRxT9cOKiM8\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood suicidal = new Mood("Suicidal", "https://i.ibb.co/j3KHsM6/National-Suicide-Prevention-Hotline-1-800-273-8255.jpg", "If you are feeling suicidal, thinking about hurting yourself, or are concerned that someone you know may be in danger of hurting himself or herself, call the National Suicide Prevention Lifeline at 1-800-273-TALK (1-800-273-8255). It is available 24 hours a day, 7 days a week and is staffed by certified crisis response professionals.", "<a href=https://www.verywellmind.com/suicide-4157253 target=_blank>Understanding Suicide</a>", "",
                "<a href=https://www.mentalhelp.net/suicide/about-asking-for-help/ target=_blank>Suicide: What will happen to you when you ask for help?</a>", "<a href=tel:800-273-8255>National Suicide Prevention Lifeline: 1-800-273-TALK (8255)</a>", "<a href=tel:>Dial 911</a>", "", "");
        Mood homicidal = new Mood("Violent", "https://i.ibb.co/stzKxDz/Homicidal.jpg", "Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.\n", "<a href=https://www.verywellmind.com/what-is-anger-5120208 target=_blank>What Is Anger?</a>", "<a href=https://www.psychologytoday.com/us/tests/personality/anger-management-test-abridged target=_blank>PsychCentral: Anger Management Test</a>", "<a href=https://www.mentalhelp.net/anger/management/deciding-to-do-something/ target=_blank>Deciding To Manage Anger</a>", "<a href=tel:741741>Crisis Text Line: Text “home” to 741741</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>",
                "<a href=tel:800-950-6264>National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)</a>", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/wkse4PPxkk4\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood exhausted = new Mood("Exhausted", "https://i.ibb.co/d5NLbdW/Exhausted.jpg", "Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.\n", "<a href=https://www.verywellhealth.com/fatigue-symptoms-causes-diagnosis-and-treatment-4768481 target=_blank>What Is Fatigue?</a>", "<a href=https://psychcentral.com/quizzes/stress-test target=_blank>PsychCentral: How Stressed Are You?</a>", "<a href=https://www.mentalhelp.net/blogs/give-yourself-a-break target=_blank>Give Yourself A Break</a>", "<a href=tel:741741>Crisis Text Line: Text “home” to 741741</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>", "<a href=tel:800-950-6264>National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)</a>", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/z6X5oEIg6Ak\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        
        Mood happy = new Mood("Happy","","Filled with good feelings","","","","","","","");
        Mood satisfied = new Mood("Satisfied","","Content with the present circumstances","","","","","","","");
        Mood calm = new Mood("Calm","","At peace with oneself and surroundings","","","","","","","");
        Mood forgiving = new Mood("Forgiving","","","","","","","","","");
        Mood proud = new Mood("Proud","","","","","","","","","");
        
        moodRepo.save(afraid);
        moodRepo.save(anxious);
        moodRepo.save(depressed);
        moodRepo.save(exhausted);
        moodRepo.save(homicidal);
        moodRepo.save(hopeless);
        moodRepo.save(lonely);
        moodRepo.save(sad);
        moodRepo.save(suicidal);
        moodRepo.save(proud);
        moodRepo.save(forgiving);
        moodRepo.save(happy);
        moodRepo.save(satisfied);
        moodRepo.save(calm);



        User user1 = new User("user1", "user1");
        User admin1 = new User("admin1", "admin1");

        String activityTitle1 = "Reframing Critical Self Talk";
        String worksheetTitle1 = "ReframingCriticalSelfTalk";
        String activityTitle2 = "Strengths Spotting by Exception Finding";
        String worksheetTitle2 = "StrengthsSpottingByExceptionFinding";

        Worksheet worksheet1 = new Worksheet(worksheetTitle1, false);
        Worksheet worksheet2 = new Worksheet(worksheetTitle2, true);

        String activityDescription1 = "Self-criticism can be regarded as the opposite of self-compassion. Whereas self-compassion involves a positive and accepting relationship with the self, self-criticism can be construed as negative and punishing thoughts directed toward one‘s personal characteristics. Self-criticism typically concerns judgment and self-blame regarding shortcomings, such as the inability to accomplish personal goals or meet other people’s expectations.The goal of this exercise is to increase awareness of inner criticism and promote a more self-compassionate stance towards the self.";
        String activityDescription2 = "A key technique in Positive CBT is borrowed from solution-focused therapy, namely first identifying and then analyzing times when a problem did not exist. Consider what was different when the problem was absent (Molnar and de Shazer, 1987). Rather than focusing on the who, what, when, and where of problems, exception finding about focusing on the who, what, when, and where of exception times. Consequently, this increases awareness of strengths relative to goals, rather than deficiencies relative to problems.";

        Activity activity1 = new Activity(activityTitle1, activityDescription1, worksheet1);
        Activity activity2 = new Activity(activityTitle2, activityDescription2, worksheet2);

        worksheetRepo.save(worksheet1);
        worksheetRepo.save(worksheet2);

        activityRepo.save(activity1);
        activityRepo.save(activity2);

//        user1.addWorksheet(worksheet1);
//        user1.addWorksheet(worksheet2);

        userRepo.save(user1);
        userRepo.save(admin1);

//        user1.addWorksheet(worksheet1);
//        user1.addWorksheet(worksheet2);

        IntakeProfile profile = new IntakeProfile("John", "Doe", "Asian", "Columbus", "OH", "status", "About Me" );
        profileRepo.save(profile);

        Trigger finances = new Trigger("Financial Issues", "Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.","https://i.ibb.co/r2S5ZhK/Financial-Issues.jpg", "<a href=https://www.apa.org/topics/stress/holiday-money target=_blank>Dealing with financial stress</a>", "<a href=https://www.verywellmind.com/understanding-and-preventing-financial-stress-3144546 target=_blank>Coping With Financial Stress in Your Life</a>", "<a href=https://www.verywellmind.com/how-to-handle-the-stress-of-a-financial-crisis-3144545 target=_blank>Dealing With the Stress of a Financial Crisis</a>", "<a href=tel:741741>Crisis Text Line: Text “home” to 741741</a>","","");
        Trigger domestic = new Trigger("Relationship Issues","Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.", "https://i.ibb.co/v4GMTdn/Relationship-Issues.jpg", "<a href=https://www.mentalhelp.net/articles/relationship-problems/ target=_blank>Relationship Problems</a>", "<a href=https://www.verywellmind.com/the-toll-of-conflict-in-relationships-3144952 target=_blank>Effects of Conflict and Stress on Relationships</a>", "<a href=https://www.verywellmind.com/all-about-healthy-relationship-4774802 target=_blank>How to Know If You Are In a Healthy Relationship</a>", "<a href=tel:800-799-7233>National Domestic Violence Hotline: 1-800-799-SAFE</a>", "<a href=tel:866-331-9474>Love Is Respect: 1-866-331-9474</a>", "");
        Trigger occupation = new Trigger("Occupational Stress","Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.", "https://i.ibb.co/LgZ8csD/Occupational-Stress.jpg", "<a href=https://www.chihealth.com/en/services/eap/stress-at-work.html target=_blank>How to Manage Stress at Work</a>", "<a href=https://www.mayoclinic.org/healthy-lifestyle/stress-management/in-depth/coping-with-stress/art-20048369 target=_blank>Coping with stress: Workplace tips</a>", "<a href=https://www.verywellmind.com/how-to-deal-with-stress-at-work-3145273 target=_blank>9 Simple Ways to Deal With Stress at Work</a>", "<a href=tel:741741>Crisis Text Line: Text “home” to 741741</a>", "<a href=tel:800-932-4616>CONTACT Helpline: 1-800-932-4616</a>", "");
        Trigger parental = new Trigger("Parental Stress","Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.","https://i.ibb.co/wp123Rv/Parental-Stress.jpg", "<a href=https://www.psychologytoday.com/us/blog/the-race-good-health/201306/4-tips-managing-parenting-stress target=_blank>4 Tips for Managing Parenting Stress</a>", "<a href=https://health.clevelandclinic.org/ready-snap-tips-for-stressed-out-parents/ target=_blank>Ready to Snap? Tips for Stressed-Out Parents</a>", "<a href=https://parentingscience.com/parenting-stress-evidence-based-tips/ target=_blank>Parenting stress: 12 evidence-based tips for making life better</a>", "<a href=tel:800-632-8188>Parental Stress Line: (800) 632-8188</a>", "<a href=tel:741741>Crisis Text Line: Text “home” to 741741</a>", "<a href=tel:800-932-4616>CONTACT Helpline: 1-800-932-4616</a>");
        Trigger gunViolence = new Trigger("Gun Violence","Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.", "https://i.ibb.co/X7Rt5Tj/Gun-Violence.jpg", "<a href=https://www.verywellmind.com/shooting-ptsd-from-a-shooting-2797200 target=_blank>Coping With PTSD Symptoms Following a Shooting</a>", "<a href=https://www.counseling.org/knowledge-center/coping-in-the-aftermath-of-a-shooting target=_blank>Coping In The Aftermath Of A Shooting</a>", "<a href=https://www.apa.org/topics/gun-violence-crime/mass-shooting target=_blank>Managing your distress in the aftermath of a shooting</a>", "<a href=tel:800-394-2255>National Center for Victims of Crime: (800) 394-2255</a>", "<a href=tel:800-985-5990>Disaster Distress Helpline: (800) 985-5990</a>", "<a href=tel:410-825-8888>Sidran Institute: (410)-825-8888</a>");
        Trigger domesticViolence = new Trigger("Domestic Violence","Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.","https://i.ibb.co/FHPKJh8/Domestic-Violence.jpg", "<a href=https://www.verywellmind.com/different-types-of-domestic-violence-5119884 target=_blank>What Are The Types of Domestic Violence?</a>", "<a href=https://www.verywellmind.com/domestic-violence-danger-assessment-quiz-66532 target=_blank>Domestic Violence Danger Assessment Quiz</a>", "<a href=https://www.verywellmind.com/signs-that-a-relationship-could-turn-violent-4100203 target=_blank>Signs That Indicate a Relationship Could Turn Violent</a>", "<a href=tel:800-799-7233>National Domestic Violence Hotline: 1-800-799-SAFE</a>", "<a href=tel:567-742-8837>Take the Night Foundation Hotline: 567-742-8837</a>", "<a href=tel:800-656-4673>Victim Contact Resource Center: 800-656-4673</a>");
        Trigger bullying = new Trigger("Bullying","Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.", "https://i.ibb.co/0yxpnS3/Bullyinhg.jpg", "<a href=https://www.stompoutbullying.org/bullying-prevention-tip-sheet target=_blank>Bullying Prevention - Tip Sheet</a>", "<a href=https://www.verywellfamily.com/how-building-selfesteem-can-prevent-bullying-460679 target=_blank>13 Ways to Build Self-Esteem and Prevent Bullying</a>", "<a href=https://www.verywellfamily.com/how-bullying-hotlines-work-4589992 target=_blank>How Do Bullying Hotlines Work?</a>", "<a href=tel:866-488-7386>NoBully.org Help Hotline: 1-866-488-7386</a>", "<a href=tel:741741>Crisis Text Line: Text “home” to 741741</a>", "<a href=tel:844-878-2274>Cyber Civil Rights Initiative Crisis Helpline: 1-844-878-2274</a>");
        triggerRepo.save(bullying);
        triggerRepo.save(domesticViolence);
        triggerRepo.save(gunViolence);
        triggerRepo.save(parental);
        triggerRepo.save(domestic);
        triggerRepo.save(finances);
        triggerRepo.save(occupation);
      
       
        CopingMechanism doDrugs = new CopingMechanism("Abuse Drugs","Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.", "https://i.ibb.co/0q57ZTJ/Abuse-Drugs.jpg", "<a href=https://www.verywellmind.com/substance-use-4014640 target=_blank>Substance Use Overview</a>", "<a href=https://drugabuse.com/drug-addiction-quiz/ target=_blank>Drug Addiction Quiz</a>", "", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>", "<a href=tel:818-773-9999>Narcotics Anonymous: (818) 773-9999</a>", "<a href=tel:800-950-6264>National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)</a>");
        CopingMechanism drinkAlcohol = new CopingMechanism("Consume Alcohol","Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.", "https://i.ibb.co/ChZF8Sy/Consume-Alcohol.jpg", "<a href=https://www.verywellmind.com/alcohol-is-a-dangerous-drug-66528 target=_blank>Alcohol Is a Dangerous Drug</a>", "<a href=https://www.verywellmind.com/could-you-have-an-alcohol-abuse-problem-3894213 target=_blank>Could You Have an Alcohol Abuse Problem?</a>", "<a href=https://www.verywellmind.com/frequently-asked-questions-about-alcohol-problems-3865910 target=_blank>Frequently Asked Questions About Alcohol Problems</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>","<a href=tel:212-870-3400>Alcoholics Anonymous:(212) 870-3400</a>","<a href=tel:800-950-6264>National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)</a>");
        CopingMechanism violence = new CopingMechanism("Commit Violence","Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.","https://i.ibb.co/d2fYwtZ/Commit-Violence.jpg", "<a href=https://www.mentalhelp.net/abuse/are-you-the-abuser/ target=_blank>If You Are An Abuser…</a>", "<a href=https://www.psychologistworld.com/stress/anger-test target=_blank>Anger Test</a>", "<a href=https://www.mayoclinic.org/healthy-lifestyle/adult-health/in-depth/anger-management/art-20045434 target=_blank>Anger management: 10 tips to tame your temper</a>", "<a href=tel:800-621=4673>Safe Horizon: 1-800-621-HOPE(4673)</a>", "<a href=tel:741741>Crisis Text Line: Text “home” to 741741</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>");
        CopingMechanism suicide = new CopingMechanism("Self-Harm","Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.", "https://i.ibb.co/FzPtGHM/Self-Harm.jpg", "<a href=https://www.verywellmind.com/self-injury-and-cutting-1065420 target=_blank>An Overview of Self-Injury and Cutting</a>", "<a href=https://www.mentalhelp.net/suicide/6-reasons-why-people-self-injure/ target=_blank>6 Reasons Why People Self-Injure</a>", "<a href=https://www.mentalhelp.net/blogs/what-to-do-in-a-mental-health-emergency/ target=_blank>What to Do In a Mental Health Emergency</a>", "<a href=tel:741741>Crisis Text Line: Text “home” to 741741</a>", "<a href=tel:800-273-8255>National Suicide Prevention Lifeline: 1-800-273-TALK (8255)</a>", "<a href=tel:800-784-2433>National Hopeline Network: 1-800-SUICIDE (784-2433)</a>");
        CopingMechanism isolate = new CopingMechanism("Isolate","Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.", "https://i.ibb.co/GsJ1NjR/Isolate.jpg", "<a href=https://www.webmd.com/mental-health/social-isolation-mental-health target=_blank>Social Isolation and Mental Health</a>", "<a href=https://psychcentral.com/quizzes/loneliness-quiz target=_blank>PsychCentral: The Loneliness Quiz</a>", "<a href=https://www.medicalnewstoday.com/articles/isolation-and-mental-health target=_blank>How does isolation affect mental health?</a>", "<a href=tel:741741>Crisis Text Line: Text “home” to 741741</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>", "<a href=tel:800-950-6264>National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)</a>");
        CopingMechanism eatStarve = new CopingMechanism("Eat/Starve","Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.", "https://i.ibb.co/ZKc5Ztw/Eat-Starve.jpg", "<a href=https://www.verywellmind.com/eating-disorders-4157252 target=_blank>What Are Eating Disorders?</a>", "<a href=https://psychcentral.com/quizzes/eating-disorders-quiz target=_blank>PsychCentral: Do You Have An Eating Disorder?</a>", "<a href=https://www.verywellmind.com/difference-between-disordered-eating-and-eating-disorders-5184548 target=_blank>Difference Between Disordered Eating and Eating Disorders</a>", "<a href=tel:630-577-1330>National Association of Anorexia Nervosa and Eating Disorders Helpline:(630) 577-1330</a>", "<a href=tel:800-931-2237>National Eating Disorders Association:(800) 931-2237</a>", "<a href=tel:741741>Crisis Text Line: Text “home” to 741741</a>");
        CopingMechanism divorce = new CopingMechanism("File for Divorce","Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.", "https://i.ibb.co/TvhVNt0/Divorce.jpg", "<a href=https://psychcentral.com/lib/reduce-the-stress-of-a-divorce target=_blank>Reduce the Stress of a Divorce</a>", "<a href=https://www.verywellmind.com/post-divorce-trauma-4583824 target=_blank>Post-Divorce Trauma and PTSD</a>", "<a href=https://www.mentalhelp.net/articles/divorce/ target=_blank>Divorce – Support Resources for Coping and Moving on After Divorce</a>", "<a href=tel:741741>Crisis Text Line: Text “home” to 741741</a>", "<a href=tel:800-950-6264>National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)</a>","<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>");
        CopingMechanism positiveSelfTalk = new CopingMechanism("Positive Self-Talk","Saying good things to and about yourself has proven to boost self-esteem, and drive one to live a happier healthier lifestyle!");
        CopingMechanism reflection = new CopingMechanism("Reflection","Reflecting upon people, places, and things outside of your immediate control such as: children, grandchildren, favorite vacation memories, anniversaries, weddings etc, has the power to change ones overall stress levels, and can leave a lasting calming effect.");
        CopingMechanism excercise = new CopingMechanism("Exercise","Physically working out is proven to reduce stressors and chemicals into the brain to promote a healthy mental state");
        CopingMechanism friends = new CopingMechanism("Positive Friends","When going through a difficult time, a good group of friends who are willing to remain encouraging and positive are all it takes sometimes!");
        CopingMechanism spirituality = new CopingMechanism("Engage in Spirituality","Reconnecting or leaning more on your faith in spirituality in rough times has the power to bring you back to your feet!");
        CopingMechanism cleanOrganize = new CopingMechanism("Clean/Organize","Having a cluttered or messy environment only adds to stress! Solving this one problem by taking your angst out by cleaning and organizing your environment, will do wonders. This includes getting rid of all toxic energy and items associated with your mental health!");
        CopingMechanism setBoundaries = new CopingMechanism("Set Boundaries","Setting boundaries to not allow the ones who cause you stress and anxiety, by simply saying no, is a major key in your mental recovery! Its alright to say no.");
        CopingMechanism gratitudeList = new CopingMechanism("Gratitude List","Physically writing out the things we are thankful for, has proven to be really helpful to some. This method is designed to bring you face to face with the joys of your life, and give them the attention they deserve.");
        CopingMechanism prioritizeTasks = new CopingMechanism("Prioritize Tasks","There are only 24 hours in the day, and things become stressful when we cant get all we want to get done. However, this is a fact of nature we must accept. We acept this by prioritizing important tasks, and becoming content with the fact that we are in control of our days and decisions.");

      
        copingMechanismRepo.save(isolate);
        copingMechanismRepo.save(eatStarve);
        copingMechanismRepo.save(divorce);
        copingMechanismRepo.save(suicide);
        copingMechanismRepo.save(violence);
        copingMechanismRepo.save(doDrugs);
        copingMechanismRepo.save(drinkAlcohol);
        copingMechanismRepo.save(positiveSelfTalk);
        copingMechanismRepo.save(reflection);
        copingMechanismRepo.save(excercise);
        copingMechanismRepo.save(friends);
        copingMechanismRepo.save(spirituality);
        copingMechanismRepo.save(cleanOrganize);
        copingMechanismRepo.save(setBoundaries);
        copingMechanismRepo.save(gratitudeList);
        copingMechanismRepo.save(prioritizeTasks);

        Message testMessage = new Message("testtitle","testsbbject","testcontent");
        messageRepo.save(testMessage);
        Reply testReply = new Reply ("TEST REPLY CONTENT", "TEST REPLY TITLE","TEST REPLY CONTENT");
        replyRepo.save(testReply);

    }
}
