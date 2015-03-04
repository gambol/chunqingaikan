package com.twocloo.com.cn.activitys; class PinglunActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/PinglunActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "PinglunActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static s:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private adapter:Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;
a=0;// 
a=0;// .field private articleId:Ljava/lang/String;
a=0;// 
a=0;// .field private btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private editPinglun:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private listView:Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// 
a=0;// .field private loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;// .field private loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "HandlerLeak"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mainLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private nonLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private pinglunList:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/Shuping_maininfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private publishImageView:Landroid/widget/Button;
a=0;// 
a=0;// .field private qiangshafaTextView:Landroid/widget/TextView;
a=0;// 
a=0;// .field private spth:Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;// .field private title:Landroid/widget/TextView;
a=0;// 
a=0;// .field private toplaLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private view:Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput v0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->s:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 62
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/PinglunActivity;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->pinglunList:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 64
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 76
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/PinglunActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/PinglunActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/PinglunActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/PinglunActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/PinglunActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/PinglunActivity;)Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->listView:Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/PinglunActivity;)Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->spth:Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/ShupingThread;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/twocloo/com/cn/activitys/PinglunActivity;Lcom/twocloo/com/cn/threads/ShupingThread;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->spth:Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/PinglunActivity;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->pinglunList:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/activitys/PinglunActivity;)Landroid/widget/LinearLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->nonLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/activitys/PinglunActivity;)Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->adapter:Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     sget v0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->s:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/activitys/PinglunActivity;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     sput p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->s:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/twocloo/com/cn/activitys/PinglunActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/twocloo/com/cn/activitys/PinglunActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private initView()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->list_view_pinglun:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->listView:Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// 
a=0;//     .line 182
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->toplaLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 184
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->edit_pinglun:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->editPinglun:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 185
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->qiangshafa:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->qiangshafaTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 186
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->qiangshafaTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 187
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$layout;->load_more_footer:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->view:Landroid/view/View;
a=0;// 
a=0;//     .line 188
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 189
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->editPinglun:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 190
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->mainLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 191
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->mainLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 192
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->nulllayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->nonLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 193
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->publish_pinglun:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->publishImageView:Landroid/widget/Button;
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->publishImageView:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 195
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->toplaLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 196
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 225
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     if-eq p1, v1, :cond_1
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->publishImageView:Landroid/widget/Button;
a=0;// 
a=0;//     if-eq p1, v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->qiangshafaTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     if-ne p1, v1, :cond_2
a=0;// 
a=0;//     .line 228
a=0;//     :cond_0
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 229
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "articleId"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 230
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 231
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->finish()V
a=0;// 
a=0;//     .line 235
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 232
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v1, :cond_1
a=0;// 
a=0;//     .line 233
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 9
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 107
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->activity_pinglun:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 108
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->setTopbar()V
a=0;// 
a=0;//     .line 109
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->initView()V
a=0;// 
a=0;//     .line 110
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 111
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 112
a=0;//     .local v8, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->getIntent()Landroid/content/Intent;
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
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     .line 113
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 114
a=0;//     new-instance v0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->pinglunList:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v6=(Reference,Landroid/os/Handler;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->adapter:Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->listView:Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->adapter:Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 117
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/ShupingThread;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     sget v4, Lcom/twocloo/com/cn/activitys/PinglunActivity;->s:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/twocloo/com/cn/threads/ShupingThread;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;IILandroid/widget/TextView;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/ShupingThread;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->spth:Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->spth:Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/threads/ShupingThread;->start()V
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->listView:Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// 
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->setMode(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->listView:Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/PinglunActivity$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/PinglunActivity$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/PinglunActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/PinglunActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/PinglunActivity$2;);
a=0;//     invoke-virtual {v0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->setOnRefreshListener(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;)V
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->listView:Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/PinglunActivity$3;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/PinglunActivity$3;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/PinglunActivity$3;-><init>(Lcom/twocloo/com/cn/activitys/PinglunActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/PinglunActivity$3;);
a=0;//     invoke-virtual {v0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 171
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 201
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 203
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onRestart()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onRestart()V
a=0;// 
a=0;//     .line 214
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 215
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 207
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 208
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 209
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onStop()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onStop()V
a=0;// 
a=0;//     .line 220
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 221
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTopbar()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 175
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PinglunActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PinglunActivity;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, "\u5168\u90e8\u8bc4\u8bba"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 178
a=0;//     return-void
a=0;// .end method
}}
