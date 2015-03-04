package com.twocloo.com.cn.activitys; class EditAgeActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/EditAgeActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "EditAgeActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final constellationArr:[Ljava/lang/String;
a=0;// 
a=0;// .field private static final dayArr:[I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private Constellation:Landroid/widget/TextView;
a=0;// 
a=0;// .field private age:I
a=0;// 
a=0;// .field private ageTextView:Landroid/widget/TextView;
a=0;// 
a=0;// .field private btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;// .field protected constellation:Ljava/lang/String;
a=0;// 
a=0;// .field private date:Ljava/lang/String;
a=0;// 
a=0;// .field private dateFormat:Ljava/text/DateFormat;
a=0;// 
a=0;// .field private dayBirth:I
a=0;// 
a=0;// .field private editView:Landroid/widget/TextView;
a=0;// 
a=0;// .field private line1:Landroid/view/View;
a=0;// 
a=0;// .field private line2:Landroid/view/View;
a=0;// 
a=0;// .field private mainLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private monthBirth:I
a=0;// 
a=0;// .field private topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field wheelMain:Lcom/twocloo/com/cn/beans/WheelMain;
a=0;// 
a=0;// .field private yearBirth:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0xc
a=0;// 
a=0;//     .line 54
a=0;//     #v3=(PosByte);
a=0;//     new-array v0, v3, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->dayArr:[I
a=0;// 
a=0;//     .line 55
a=0;//     const/16 v0, 0xd
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v2, "\u6469\u7faf\u5ea7"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-string v2, "\u6c34\u74f6\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-string v2, "\u53cc\u9c7c\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     const-string v2, "\u767d\u7f8a\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     const-string v2, "\u91d1\u725b\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     const-string v2, "\u53cc\u5b50\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     const-string v2, "\u5de8\u87f9\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x7
a=0;// 
a=0;//     const-string v2, "\u72ee\u5b50\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     const-string v2, "\u5904\u5973\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     const-string v2, "\u5929\u79e4\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     const-string v2, "\u5929\u874e\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     .line 56
a=0;//     const-string v2, "\u5c04\u624b\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const-string v1, "\u6469\u7faf\u5ea7"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     aput-object v1, v0, v3
a=0;// 
a=0;//     .line 55
a=0;//     sput-object v0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->constellationArr:[Ljava/lang/String;
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// 
a=0;//     .line 54
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x14
a=0;//         0x13
a=0;//         0x15
a=0;//         0x14
a=0;//         0x15
a=0;//         0x16
a=0;//         0x17
a=0;//         0x17
a=0;//         0x17
a=0;//         0x18
a=0;//         0x17
a=0;//         0x16
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/EditAgeActivity;);
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v1, "yyyy-MM-dd"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->dateFormat:Ljava/text/DateFormat;
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/EditAgeActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->date:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/EditAgeActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->date:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/twocloo/com/cn/activitys/EditAgeActivity;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->age:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$11(Lcom/twocloo/com/cn/activitys/EditAgeActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->Constellation:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/EditAgeActivity;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->yearBirth:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/activitys/EditAgeActivity;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->monthBirth:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/activitys/EditAgeActivity;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->dayBirth:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/activitys/EditAgeActivity;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->yearBirth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/activitys/EditAgeActivity;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->monthBirth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/com/cn/activitys/EditAgeActivity;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->dayBirth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/twocloo/com/cn/activitys/EditAgeActivity;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->age:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/twocloo/com/cn/activitys/EditAgeActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->ageTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getConstellation(II)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "month"    # I
a=0;//     .param p1, "day"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     sget-object v0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->dayArr:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     add-int/lit8 v1, p0, -0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge p1, v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->constellationArr:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     add-int/lit8 v1, p0, -0x1
a=0;// 
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->constellationArr:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     aget-object v0, v0, p0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getcalculationAge(IIIIII)I
a=0;//     .locals 1
a=0;//     .param p0, "yearNow"    # I
a=0;//     .param p1, "yearBirth"    # I
a=0;//     .param p2, "monthNow"    # I
a=0;//     .param p3, "monthBirth"    # I
a=0;//     .param p4, "dayOfMonthNow"    # I
a=0;//     .param p5, "dayOfMonthBirth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     sub-int v0, p0, p1
a=0;// 
a=0;//     .line 139
a=0;//     .local v0, "age":I
a=0;//     #v0=(Integer);
a=0;//     if-gt p2, p3, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     if-ne p2, p3, :cond_1
a=0;// 
a=0;//     .line 142
a=0;//     if-ge p4, p5, :cond_0
a=0;// 
a=0;//     .line 143
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     .line 149
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 146
a=0;//     :cond_1
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private initView()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     .line 96
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     .line 97
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->main_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->mainLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 98
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 99
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->text_xingzuo:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->Constellation:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 100
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->text_age:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->ageTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 101
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 102
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->edit:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->editView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->editView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 106
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setDayOrNightMode()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 260
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->mainLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 261
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 265
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public dialog()V
a=0;//     .locals 15
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 182
a=0;//     .local v4, "inflater":Landroid/view/LayoutInflater;
a=0;//     #v4=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v12, Lcom/twocloo/com/cn/R$layout;->timepicker:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     invoke-virtual {v4, v12, v13}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 183
a=0;//     .local v9, "timepickerview":Landroid/view/View;
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/beans/ScreenInfo;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/beans/ScreenInfo;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/beans/ScreenInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 184
a=0;//     .local v7, "screenInfo":Lcom/twocloo/com/cn/beans/ScreenInfo;
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/ScreenInfo;);
a=0;//     new-instance v12, Lcom/twocloo/com/cn/beans/WheelMain;
a=0;// 
a=0;//     #v12=(UninitRef,Lcom/twocloo/com/cn/beans/WheelMain;);
a=0;//     invoke-direct {v12, v9}, Lcom/twocloo/com/cn/beans/WheelMain;-><init>(Landroid/view/View;)V
a=0;// 
a=0;//     #v12=(Reference,Lcom/twocloo/com/cn/beans/WheelMain;);
a=0;//     iput-object v12, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->wheelMain:Lcom/twocloo/com/cn/beans/WheelMain;
a=0;// 
a=0;//     .line 185
a=0;//     iget-object v12, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->wheelMain:Lcom/twocloo/com/cn/beans/WheelMain;
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/ScreenInfo;->getHeight()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     iput v13, v12, Lcom/twocloo/com/cn/beans/WheelMain;->screenheight:I
a=0;// 
a=0;//     .line 186
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 187
a=0;//     .local v0, "calendar":Ljava/util/Calendar;
a=0;//     #v0=(Reference,Ljava/util/Calendar;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     invoke-virtual {v0, v13}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "-"
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     const/4 v13, 0x2
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     invoke-virtual {v0, v13}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     add-int/lit8 v13, v13, 0x1
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     const-string v13, "-"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     const/4 v13, 0x5
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     invoke-virtual {v0, v13}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 188
a=0;//     .local v8, "time":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v12, "yyyy-MM-dd"
a=0;// 
a=0;//     invoke-static {v8, v12}, Lcom/twocloo/com/cn/beans/JudgeDate;->isDate(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_0
a=0;// 
a=0;//     .line 190
a=0;//     :try_start_0
a=0;//     iget-object v12, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->dateFormat:Ljava/text/DateFormat;
a=0;// 
a=0;//     #v12=(Reference,Ljava/text/DateFormat;);
a=0;//     invoke-virtual {v12, v8}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 196
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v12=(Conflicted);
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     invoke-virtual {v0, v12}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 197
a=0;//     .local v10, "year":I
a=0;//     #v10=(Integer);
a=0;//     const/4 v12, 0x2
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     invoke-virtual {v0, v12}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 198
a=0;//     .local v5, "month":I
a=0;//     #v5=(Integer);
a=0;//     const/4 v12, 0x5
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 199
a=0;//     .local v1, "day":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Landroid/content/Intent;);
a=0;//     const-string v13, "year"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13, v10}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 200
a=0;//     .local v11, "year_birth":I
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     const-string v13, "month"
a=0;// 
a=0;//     invoke-virtual {v12, v13, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 201
a=0;//     .local v6, "month_birth":I
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     const-string v13, "day"
a=0;// 
a=0;//     invoke-virtual {v12, v13, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 202
a=0;//     .local v2, "day_birth":I
a=0;//     #v2=(Integer);
a=0;//     if-eqz v11, :cond_1
a=0;// 
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 203
a=0;//     iget-object v12, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->wheelMain:Lcom/twocloo/com/cn/beans/WheelMain;
a=0;// 
a=0;//     invoke-virtual {v12, v11, v6, v2}, Lcom/twocloo/com/cn/beans/WheelMain;->initDateTimePicker(III)V
a=0;// 
a=0;//     .line 207
a=0;//     :goto_1
a=0;//     new-instance v12, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v12=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v12, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v12=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     const-string v13, "\u9009\u62e9\u65f6\u95f4"
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12, v9}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     sget v13, Lcom/twocloo/com/cn/R$drawable;->rili:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     invoke-virtual {v12, v13}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 208
a=0;//     const-string v13, "\u786e\u5b9a"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     new-instance v14, Lcom/twocloo/com/cn/activitys/EditAgeActivity$1;
a=0;// 
a=0;//     #v14=(UninitRef,Lcom/twocloo/com/cn/activitys/EditAgeActivity$1;);
a=0;//     invoke-direct {v14, p0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/EditAgeActivity;)V
a=0;// 
a=0;//     #v14=(Reference,Lcom/twocloo/com/cn/activitys/EditAgeActivity$1;);
a=0;//     invoke-virtual {v12, v13, v14}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 234
a=0;//     const-string v13, "\u53d6\u6d88"
a=0;// 
a=0;//     new-instance v14, Lcom/twocloo/com/cn/activitys/EditAgeActivity$2;
a=0;// 
a=0;//     #v14=(UninitRef,Lcom/twocloo/com/cn/activitys/EditAgeActivity$2;);
a=0;//     invoke-direct {v14, p0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/EditAgeActivity;)V
a=0;// 
a=0;//     #v14=(Reference,Lcom/twocloo/com/cn/activitys/EditAgeActivity$2;);
a=0;//     invoke-virtual {v12, v13, v14}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 251
a=0;//     invoke-virtual {v12}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
a=0;// 
a=0;//     .line 252
a=0;//     return-void
a=0;// 
a=0;//     .line 191
a=0;//     .end local v1    # "day":I
a=0;//     .end local v2    # "day_birth":I
a=0;//     .end local v5    # "month":I
a=0;//     .end local v6    # "month_birth":I
a=0;//     .end local v10    # "year":I
a=0;//     .end local v11    # "year_birth":I
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Conflicted);v13=(Integer);v14=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 193
a=0;//     .local v3, "e":Ljava/text/ParseException;
a=0;//     #v3=(Reference,Ljava/text/ParseException;);
a=0;//     invoke-virtual {v3}, Ljava/text/ParseException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 205
a=0;//     .end local v3    # "e":Ljava/text/ParseException;
a=0;//     .restart local v1    # "day":I
a=0;//     .restart local v2    # "day_birth":I
a=0;//     .restart local v5    # "month":I
a=0;//     .restart local v6    # "month_birth":I
a=0;//     .restart local v10    # "year":I
a=0;//     .restart local v11    # "year_birth":I
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(Integer);v3=(Conflicted);v5=(Integer);v6=(Integer);v10=(Integer);v11=(Integer);v12=(Reference,Landroid/content/Intent;);v13=(Reference,Ljava/lang/String;);
a=0;//     iget-object v12, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->wheelMain:Lcom/twocloo/com/cn/beans/WheelMain;
a=0;// 
a=0;//     invoke-virtual {v12, v10, v5, v1}, Lcom/twocloo/com/cn/beans/WheelMain;->initDateTimePicker(III)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     if-ne p1, v1, :cond_1
a=0;// 
a=0;//     .line 111
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 112
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "age"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->age:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 113
a=0;//     const-string v1, "year"
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->yearBirth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 114
a=0;//     const-string v1, "month"
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->monthBirth:I
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 115
a=0;//     const-string v1, "day"
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->dayBirth:I
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 116
a=0;//     const-string v1, "constellation"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->constellation:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 117
a=0;//     const/16 v1, 0x3ea
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->setResult(ILandroid/content/Intent;)V
a=0;// 
a=0;//     .line 118
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->finish()V
a=0;// 
a=0;//     .line 123
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 119
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Reference,Landroid/widget/ImageView;);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->editView:Landroid/widget/TextView;
a=0;// 
a=0;//     if-ne p1, v1, :cond_0
a=0;// 
a=0;//     .line 120
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->dialog()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 10
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     .line 70
a=0;//     #v9=(One);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 71
a=0;//     invoke-virtual {p0, v9}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->requestWindowFeature(I)Z
a=0;// 
a=0;//     .line 72
a=0;//     sget v7, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sget v8, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p0, v7, v8}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 74
a=0;//     sget v7, Lcom/twocloo/com/cn/R$layout;->edit_age_avtiity:I
a=0;// 
a=0;//     invoke-virtual {p0, v7}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 75
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 76
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->initView()V
a=0;// 
a=0;//     .line 77
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 78
a=0;//     .local v6, "calendar":Ljava/util/Calendar;
a=0;//     #v6=(Reference,Ljava/util/Calendar;);
a=0;//     invoke-virtual {v6, v9}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 79
a=0;//     .local v0, "yearNow":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v6, v7}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 80
a=0;//     .local v2, "monthNow":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v7, 0x5
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 81
a=0;//     .local v4, "dayNow":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Intent;);
a=0;//     const-string v8, "year"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 82
a=0;//     .local v1, "year_birth":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "month"
a=0;// 
a=0;//     invoke-virtual {v7, v8, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 83
a=0;//     .local v3, "month_birth":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "day"
a=0;// 
a=0;//     invoke-virtual {v7, v8, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 84
a=0;//     .local v5, "day_birth":I
a=0;//     #v5=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 85
a=0;//     invoke-static/range {v0 .. v5}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->getcalculationAge(IIIIII)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iput v7, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->age:I
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->ageTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v9, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->age:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 87
a=0;//     invoke-static {v3, v5}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->getConstellation(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iput-object v7, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->constellation:Ljava/lang/String;
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->Constellation:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->constellation:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 90
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->dialog()V
a=0;// 
a=0;//     .line 92
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 278
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 279
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 281
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 4
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne p1, v1, :cond_0
a=0;// 
a=0;//     .line 167
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 168
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "age"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->age:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 169
a=0;//     const-string v1, "year"
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->yearBirth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 170
a=0;//     const-string v1, "month"
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->monthBirth:I
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 171
a=0;//     const-string v1, "day"
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->dayBirth:I
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 172
a=0;//     const-string v1, "constellation"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->constellation:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 173
a=0;//     const/16 v1, 0x3ea
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->setResult(ILandroid/content/Intent;)V
a=0;// 
a=0;//     .line 174
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->finish()V
a=0;// 
a=0;//     .line 176
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 269
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->setTopLayout()V
a=0;// 
a=0;//     .line 271
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->setDayOrNightMode()V
a=0;// 
a=0;//     .line 273
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTopLayout()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 255
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getTopBackgroundColor(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 256
a=0;//     .local v0, "color":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/EditAgeActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 257
a=0;//     return-void
a=0;// .end method
}}
