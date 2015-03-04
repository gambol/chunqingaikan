package com.twocloo.com.cn.activitys; class BfMLActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "BfMLActivity.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private aboutBook:Landroid/widget/RadioButton;
a=0;// 
a=0;// .field private adapter:Lcom/twocloo/com/cn/adapters/BfMLAdapter;
a=0;// 
a=0;// .field private aid:Ljava/lang/String;
a=0;// 
a=0;// .field private authorTextView:Landroid/widget/TextView;
a=0;// 
a=0;// .field private backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field private bmadapter:Lcom/twocloo/com/cn/adapters/BMDAdapter;
a=0;// 
a=0;// .field private bmlist:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BookMark;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private bmlistview:Landroid/widget/ListView;
a=0;// 
a=0;// .field private bookNameTextView:Landroid/widget/TextView;
a=0;// 
a=0;// .field private bookmark:Landroid/widget/RadioButton;
a=0;// 
a=0;// .field private bookmarkLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private buttomlLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private cancle:Landroid/widget/Button;
a=0;// 
a=0;// .field private ci:Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;// 
a=0;// .field private curtxid:Ljava/lang/String;
a=0;// 
a=0;// .field handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private info:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/Chapterinfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private isFromBaseReadbook:Z
a=0;// 
a=0;// .field private isFromWeb:Ljava/lang/String;
a=0;// 
a=0;// .field private listView:Landroid/widget/ListView;
a=0;// 
a=0;// .field private mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private mulu:Landroid/widget/RadioButton;
a=0;// 
a=0;// .field private mululistlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private noBookmarkImageView:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private noBookmarkTextView:Landroid/widget/TextView;
a=0;// 
a=0;// .field private nowClickId:I
a=0;// 
a=0;// .field private orderedChapterIdSet:Ljava/util/HashSet;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashSet",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private radioGroup:Landroid/widget/RadioGroup;
a=0;// 
a=0;// .field private shubenmulu:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;// .field private statusTextView:Landroid/widget/TextView;
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// .field private topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field uid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 50
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     const-string v0, "BfMLActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 73
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->orderedChapterIdSet:Ljava/util/HashSet;
a=0;// 
a=0;//     .line 78
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->isFromBaseReadbook:Z
a=0;// 
a=0;//     .line 79
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/BfMLActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/BfMLActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 287
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 49
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/util/HashSet;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->orderedChapterIdSet:Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->ci:Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/twocloo/com/cn/activitys/BfMLActivity;Lcom/twocloo/com/cn/adapters/BfMLAdapter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->adapter:Lcom/twocloo/com/cn/adapters/BfMLAdapter;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$11(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->bookNameTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$12(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->authorTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$13(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->statusTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$14(Lcom/twocloo/com/cn/activitys/BfMLActivity;Lcom/twocloo/com/cn/beans/Shubenmulu;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->shubenmulu:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$15(Lcom/twocloo/com/cn/activitys/BfMLActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 388
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->goback()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$16(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/RadioButton;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->mulu:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$17(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/RadioButton;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->bookmark:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$18(Lcom/twocloo/com/cn/activitys/BfMLActivity;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->nowClickId:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$19(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/LinearLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->mululistlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/adapters/BfMLAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->adapter:Lcom/twocloo/com/cn/adapters/BfMLAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/BfMLAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$20(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->bookmarkLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$21(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/ListView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->bmlistview:Landroid/widget/ListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$22(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->noBookmarkTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$23(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$24(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->isFromWeb:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->shubenmulu:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/activitys/BfMLActivity;Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->info:Ljava/util/ArrayList;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->info:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->curtxid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->isFromBaseReadbook:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private goback()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 389
a=0;//     const-string v1, "single"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 390
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 391
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->main_bookshelf:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 392
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 394
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->finish()V
a=0;// 
a=0;//     .line 395
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initviews()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->rl2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->buttomlLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 194
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 195
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->mululayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 196
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 197
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->bookNameTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 198
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->novel_sbxxy_mulu_author:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->authorTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 199
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->novel_sbxxy_mulu_status:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->statusTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 200
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->novel_sbxxy_mulu_lv:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ListView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     .line 202
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bookmark_cancle:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->cancle:Landroid/widget/Button;
a=0;// 
a=0;//     .line 204
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->novel_mulu:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RadioButton;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->mulu:Landroid/widget/RadioButton;
a=0;// 
a=0;//     .line 205
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->novel_shuqian:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RadioButton;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->bookmark:Landroid/widget/RadioButton;
a=0;// 
a=0;//     .line 206
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->mulu_group:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RadioGroup;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->radioGroup:Landroid/widget/RadioGroup;
a=0;// 
a=0;//     .line 208
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->mulu_list:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->mululistlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 209
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->show2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->bookmarkLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 210
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bmtx:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->noBookmarkTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 212
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bookmark_list:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ListView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->bmlistview:Landroid/widget/ListView;
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/BfMLActivity$3;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/BfMLActivity$3;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity$3;-><init>(Lcom/twocloo/com/cn/activitys/BfMLActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity$3;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->radioGroup:Landroid/widget/RadioGroup;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/BfMLActivity$4;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;-><init>(Lcom/twocloo/com/cn/activitys/BfMLActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity$4;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V
a=0;// 
a=0;//     .line 258
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getListView()Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setFastScrollEnabled(Z)V
a=0;// 
a=0;//     .line 261
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->cancle:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/BfMLActivity$5;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/BfMLActivity$5;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity$5;-><init>(Lcom/twocloo/com/cn/activitys/BfMLActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity$5;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 284
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->setListViewLs()V
a=0;// 
a=0;//     .line 285
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setListViewLs()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 290
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getListView()Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/BfMLActivity$6;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;-><init>(Lcom/twocloo/com/cn/activitys/BfMLActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity$6;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 338
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getListView()Landroid/widget/ListView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 378
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 7
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 137
a=0;//     #v2=(Null);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 138
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 140
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->bf_mulu:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 141
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 143
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "aid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 144
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "nowtxid"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->curtxid:Ljava/lang/String;
a=0;// 
a=0;//     .line 145
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "isFromBaseReadbook"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->isFromBaseReadbook:Z
a=0;// 
a=0;//     .line 147
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 148
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 149
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 153
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-direct {v6, p0}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 154
a=0;//     .local v6, "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 156
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "WEB"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->isFromWeb:Ljava/lang/String;
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v0, v2, p0}, Lcom/twocloo/com/cn/db/DBAdapter;->queryAllBookMark(Ljava/lang/String;ILandroid/app/Activity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->bmlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 159
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     .line 160
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->initviews()V
a=0;// 
a=0;//     .line 162
a=0;//     invoke-static {p0}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/Util;->read(Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->shubenmulu:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->shubenmulu:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 165
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/BfMLActivity$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/BfMLActivity$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/BfMLActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity$2;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 175
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 179
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->mulu:Landroid/widget/RadioButton;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/RadioButton;->setChecked(Z)V
a=0;// 
a=0;//     .line 181
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->bmlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->bmlistview:Landroid/widget/ListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ListView;->setVisibility(I)V
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->noBookmarkTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 185
a=0;//     new-instance v0, Lcom/twocloo/com/cn/adapters/BMDAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/adapters/BMDAdapter;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->bmlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     invoke-direct {v0, p0, v1, v2}, Lcom/twocloo/com/cn/adapters/BMDAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/BMDAdapter;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->bmadapter:Lcom/twocloo/com/cn/adapters/BMDAdapter;
a=0;// 
a=0;//     .line 186
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->bmlistview:Landroid/widget/ListView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->bmadapter:Lcom/twocloo/com/cn/adapters/BMDAdapter;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 188
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->token:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->ci:Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;// 
a=0;//     .line 189
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->ci:Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->start()V
a=0;// 
a=0;//     .line 190
a=0;//     return-void
a=0;// 
a=0;//     .line 177
a=0;//     :cond_2
a=0;//     #v2=(Null);v3=(One);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/16 v1, 0x7b
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 371
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 374
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->remove(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 375
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 383
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->goback()V
a=0;// 
a=0;//     .line 384
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 363
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 364
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 365
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 367
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 368
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 342
a=0;//     sput-object p0, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 343
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 345
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 346
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->buttomlLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 347
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 348
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->xuxian_black:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 349
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->bookmark:Landroid/widget/RadioButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_button_black_selector:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 350
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->mulu:Landroid/widget/RadioButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_button_black_selector:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 357
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 358
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 359
a=0;//     return-void
a=0;// 
a=0;//     .line 352
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(One);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->xuxian:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 353
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->bookmark:Landroid/widget/RadioButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_button_selector:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 354
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->mulu:Landroid/widget/RadioButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_button_selector:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setTopLayout()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 398
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getTopBackgroundColor(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 399
a=0;//     .local v0, "color":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 400
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->buttomlLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 401
a=0;//     return-void
a=0;// .end method
}}
