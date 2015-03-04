package com.twocloo.com.cn.activitys; class MuLuActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/MuLuActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "MuLuActivity.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private articleId:Ljava/lang/String;
a=0;// 
a=0;// .field private btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private btn_top:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private ci:Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;// 
a=0;// .field private curtxid:Ljava/lang/String;
a=0;// 
a=0;// .field private downmuluTask:Lcom/twocloo/com/cn/task/DownMuluTask;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private isShowDialog:Z
a=0;// 
a=0;// .field private listView:Landroid/widget/ListView;
a=0;// 
a=0;// .field private muluAdapter:Lcom/twocloo/com/cn/adapters/AdapterForMulu;
a=0;// 
a=0;// .field private muluInfo:Ljava/util/ArrayList;
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
a=0;// .field private naLayout:Landroid/widget/RelativeLayout;
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
a=0;// .field private pb:Landroid/widget/ProgressBar;
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// .field private topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 38
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 43
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/MuLuActivity;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->downmuluTask:Lcom/twocloo/com/cn/task/DownMuluTask;
a=0;// 
a=0;//     .line 46
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->isShowDialog:Z
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->orderedChapterIdSet:Ljava/util/HashSet;
a=0;// 
a=0;//     .line 51
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->pb:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 52
a=0;//     const-string v0, "MuLuActivity"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 53
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/MuLuActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/MuLuActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/MuLuActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/MuLuActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/MuLuActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 38
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/MuLuActivity;)Ljava/util/HashSet;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->orderedChapterIdSet:Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/MuLuActivity;)Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->ci:Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/twocloo/com/cn/activitys/MuLuActivity;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$11(Lcom/twocloo/com/cn/activitys/MuLuActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$12(Lcom/twocloo/com/cn/activitys/MuLuActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$13(Lcom/twocloo/com/cn/activitys/MuLuActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->token:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$14(Lcom/twocloo/com/cn/activitys/MuLuActivity;Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->ci:Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$15(Lcom/twocloo/com/cn/activitys/MuLuActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/MuLuActivity;Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->muluInfo:Ljava/util/ArrayList;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/activitys/MuLuActivity;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->muluInfo:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/activitys/MuLuActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->curtxid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/activitys/MuLuActivity;Lcom/twocloo/com/cn/adapters/AdapterForMulu;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->muluAdapter:Lcom/twocloo/com/cn/adapters/AdapterForMulu;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/activitys/MuLuActivity;)Landroid/widget/ListView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/com/cn/activitys/MuLuActivity;)Lcom/twocloo/com/cn/adapters/AdapterForMulu;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->muluAdapter:Lcom/twocloo/com/cn/adapters/AdapterForMulu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/AdapterForMulu;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/twocloo/com/cn/activitys/MuLuActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/twocloo/com/cn/activitys/MuLuActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->token:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 6
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 83
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/MuLuActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 84
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->activity_mu_lu:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/MuLuActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 85
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/MuLuActivity;->setTopLayout()V
a=0;// 
a=0;//     .line 86
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/MuLuActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "articleId"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     .line 87
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->isShowDialog:Z
a=0;// 
a=0;//     .line 88
a=0;//     new-instance v0, Lcom/twocloo/com/cn/task/DownMuluTask;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/task/DownMuluTask;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Handler;);
a=0;//     iget-boolean v4, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->isShowDialog:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/com/cn/task/DownMuluTask;-><init>(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Handler;ZLandroid/widget/ProgressBar;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/DownMuluTask;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->downmuluTask:Lcom/twocloo/com/cn/task/DownMuluTask;
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->downmuluTask:Lcom/twocloo/com/cn/task/DownMuluTask;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Void;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/task/DownMuluTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/MuLuActivity$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/MuLuActivity$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/MuLuActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/MuLuActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/MuLuActivity$2;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->btn_top:Landroid/widget/ImageView;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/MuLuActivity$3;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/MuLuActivity$3;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/MuLuActivity$3;-><init>(Lcom/twocloo/com/cn/activitys/MuLuActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/MuLuActivity$3;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/MuLuActivity$4;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/MuLuActivity$4;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/MuLuActivity$4;-><init>(Lcom/twocloo/com/cn/activitys/MuLuActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/MuLuActivity$4;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 161
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 187
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/MuLuActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 188
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onRestart()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onRestart()V
a=0;// 
a=0;//     .line 180
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/MuLuActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 181
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onStop()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onStop()V
a=0;// 
a=0;//     .line 194
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/MuLuActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 196
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTopLayout()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/MuLuActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 166
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/MuLuActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 167
a=0;//     .local v0, "title":Landroid/widget/TextView;
a=0;//     const-string v1, "\u76ee\u5f55"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 168
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->mulu_listview:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/MuLuActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ListView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     .line 169
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->btn_back:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/MuLuActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 170
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->back_top:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/MuLuActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->btn_top:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 171
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/MuLuActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->naLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/MuLuActivity;->naLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->setBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 174
a=0;//     return-void
a=0;// .end method
}}
