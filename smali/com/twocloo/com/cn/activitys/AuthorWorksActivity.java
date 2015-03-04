package com.twocloo.com.cn.activitys; class AuthorWorksActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "AuthorWorksActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private adapter:Lcom/twocloo/com/cn/adapters/AuthorWorkAdapter;
a=0;// 
a=0;// .field private authorid:Ljava/lang/String;
a=0;// 
a=0;// .field private btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private list:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/NewBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private listView:Landroid/widget/ListView;
a=0;// 
a=0;// .field private mainLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private title:Landroid/widget/TextView;
a=0;// 
a=0;// .field private topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 37
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 28
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;Lcom/twocloo/com/cn/adapters/AuthorWorkAdapter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->adapter:Lcom/twocloo/com/cn/adapters/AuthorWorkAdapter;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;)Landroid/widget/ListView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;)Lcom/twocloo/com/cn/adapters/AuthorWorkAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->adapter:Lcom/twocloo/com/cn/adapters/AuthorWorkAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/AuthorWorkAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private initview()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->top_bar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 83
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 84
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 85
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "title"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u7684\u4f5c\u54c1"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 87
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 88
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->author_listview:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ListView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     .line 89
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->detailedlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->mainLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->mainLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 91
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->finish()V
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 58
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->authorworks_activity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 59
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->initview()V
a=0;// 
a=0;//     .line 60
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$string;->loading_text:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 61
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "authorid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->authorid:Ljava/lang/String;
a=0;// 
a=0;//     .line 62
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 63
a=0;//     new-instance v0, Lcom/twocloo/com/cn/task/GetAuthorWorkThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/task/GetAuthorWorkThread;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->authorid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Handler;);
a=0;//     invoke-direct {v0, p0, v1, v2, v3}, Lcom/twocloo/com/cn/task/GetAuthorWorkThread;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/GetAuthorWorkThread;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/task/GetAuthorWorkThread;->start()V
a=0;// 
a=0;//     .line 66
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$2;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 79
a=0;//     return-void
a=0;// .end method
}}
