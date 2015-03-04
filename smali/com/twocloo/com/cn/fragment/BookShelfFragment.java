package com.twocloo.com.cn.fragment; class BookShelfFragment { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// .super Landroid/support/v4/app/Fragment;
a=0;// .source "BookShelfFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$onItemClickListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static isSychronized:Z
a=0;// 
a=0;// .field public static list:Ljava/util/Vector;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field public static uid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private adapt:Landroid/widget/BaseAdapter;
a=0;// 
a=0;// .field private aid:Ljava/lang/String;
a=0;// 
a=0;// .field private bbxxth:Lcom/twocloo/com/cn/threads/BanbenxinThread;
a=0;// 
a=0;// .field public bf_lastRead:Landroid/widget/TextView;
a=0;// 
a=0;// .field private clear_btn:Landroid/widget/ImageView;
a=0;// 
a=0;// .field count:I
a=0;// 
a=0;// .field private curpop:Landroid/widget/PopupWindow;
a=0;// 
a=0;// .field private dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;// .field private finish:Z
a=0;// 
a=0;// .field private footer:Landroid/view/View;
a=0;// 
a=0;// .field private gobookcityBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private help:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private isAdd:Z
a=0;// 
a=0;// .field private isBook:Z
a=0;// 
a=0;// .field private isVip:Z
a=0;// 
a=0;// .field private isvip:I
a=0;// 
a=0;// .field private listview:Lcom/twocloo/com/cn/view/PullRefreshListView;
a=0;// 
a=0;// .field private final mPageName:Ljava/lang/String;
a=0;// 
a=0;// .field private mWaitDg1:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private mainLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private maxCount:I
a=0;// 
a=0;// .field private netTypedialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field private noticeAinimationIn:Landroid/view/animation/Animation;
a=0;// 
a=0;// .field private noticeAnimationOut:Landroid/view/animation/Animation;
a=0;// 
a=0;// .field private noticeTv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private popview:Landroid/view/View;
a=0;// 
a=0;// .field private popwebview:Landroid/webkit/WebView;
a=0;// 
a=0;// .field private popwin:Landroid/widget/PopupWindow;
a=0;// 
a=0;// .field private rl:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private rl_top:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private start:I
a=0;// 
a=0;// .field style:Z
a=0;// 
a=0;// .field private tb:Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;// .field private top_bar_button_right_more:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field private topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field totalCount:I
a=0;// 
a=0;// .field private tv1:Landroid/widget/TextView;
a=0;// 
a=0;// .field private tv2:Landroid/widget/TextView;
a=0;// 
a=0;// .field private up:Lcom/twocloo/com/cn/threads/UpdateBookThread;
a=0;// 
a=0;// .field private upP:I
a=0;// 
a=0;// .field updatelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     new-instance v0, Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Vector;);
a=0;//     invoke-direct {v0}, Ljava/util/Vector;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     .line 645
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->isSychronized:Z
a=0;// 
a=0;//     .line 1061
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->uid:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 85
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V
a=0;// 
a=0;//     .line 94
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->curpop:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     .line 104
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->isBook:Z
a=0;// 
a=0;//     .line 105
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->isVip:Z
a=0;// 
a=0;//     .line 117
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->netTypedialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 119
a=0;//     const-string v0, "BookShelfFragment"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->mPageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 123
a=0;//     new-instance v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 506
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->style:Z
a=0;// 
a=0;//     .line 511
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->isAdd:Z
a=0;// 
a=0;//     .line 512
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->start:I
a=0;// 
a=0;//     const/16 v0, 0x14
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->maxCount:I
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static BatchSubscription(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p0, "activity"    # Landroid/app/Activity;
a=0;//     .param p1, "articleid"    # Ljava/lang/String;
a=0;//     .param p2, "source"    # Ljava/lang/String;
a=0;//     .param p3, "ordertype"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1071
a=0;//     #v2=(Null);
a=0;//     invoke-static {p0}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v1, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1072
a=0;//     sget v0, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Toast;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 1214
a=0;//     :goto_0
a=0;//     #v2=(Reference,Landroid/app/Activity;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1076
a=0;//     :cond_0
a=0;//     #v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
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
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1077
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 1088
a=0;//     const-string v0, "\u52a0\u8f7d\u4e2d\uff0c\u8bf7\u7a0d\u5019..."
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1090
a=0;//     .local v5, "pd":Landroid/app/ProgressDialog;
a=0;//     #v5=(Reference,Landroid/app/ProgressDialog;);
a=0;//     new-instance v7, Ljava/lang/Thread;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v2, p0
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;-><init>(Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroid/app/ProgressDialog;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;);
a=0;//     invoke-direct {v7, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 1213
a=0;//     #v7=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v7}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1079
a=0;//     .end local v5    # "pd":Landroid/app/ProgressDialog;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);
a=0;//     const-string v0, "\u8bf7\u5148\u767b\u5f55~"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 1080
a=0;//     new-instance v6, Landroid/content/Intent;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v0, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;
a=0;// 
a=0;//     invoke-direct {v6, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 1081
a=0;//     .local v6, "i":Landroid/content/Intent;
a=0;//     #v6=(Reference,Landroid/content/Intent;);
a=0;//     const-string v0, "Tag"
a=0;// 
a=0;//     const-string v1, "Readbook"
a=0;// 
a=0;//     invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1082
a=0;//     invoke-virtual {p0, v6}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/db/LastReadTable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->tb:Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/fragment/BookShelfFragment;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->upP:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/view/PullRefreshListView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->listview:Lcom/twocloo/com/cn/view/PullRefreshListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/PullRefreshListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$11(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Landroid/widget/PopupWindow;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->curpop:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$12(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/app/Dialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->netTypedialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$13(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Landroid/app/Dialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->netTypedialog:Landroid/app/Dialog;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$14(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$15(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/threads/BanbenxinThread;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->bbxxth:Lcom/twocloo/com/cn/threads/BanbenxinThread;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/BanbenxinThread;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$16(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$17(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Ljava/util/Vector;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 465
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->checkShelfDatas(Ljava/util/Vector;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$18(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Lcom/twocloo/com/cn/beans/BFBook;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 491
a=0;//     invoke-direct {p0, p1, p2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->insertShelfBookInfoToDB(Lcom/twocloo/com/cn/beans/BFBook;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$19(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 116
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->rl_top:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$20(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/ImageButton;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 507
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->top_bar_button_right_more:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageButton;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$21(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 512
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->maxCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$22(Lcom/twocloo/com/cn/fragment/BookShelfFragment;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 512
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->start:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$23(Lcom/twocloo/com/cn/fragment/BookShelfFragment;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 512
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->maxCount:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$24(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 511
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->isAdd:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$25(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 511
a=0;//     iput-boolean p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->isAdd:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$26(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 512
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->start:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$27(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Landroid/app/ProgressDialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$28(Landroid/app/ProgressDialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1217
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->dismissProgressDialog(Landroid/app/ProgressDialog;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Lcom/twocloo/com/cn/threads/UpdateBookThread;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->up:Lcom/twocloo/com/cn/threads/UpdateBookThread;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/threads/UpdateBookThread;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->up:Lcom/twocloo/com/cn/threads/UpdateBookThread;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/UpdateBookThread;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->mWaitDg1:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->upP:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/BaseAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->adapt:Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/BaseAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->gobookcityBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->rl:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private checkShelfDatas(Ljava/util/Vector;)V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 466
a=0;//     .local p1, "list":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/twocloo/com/cn/beans/BFBook;>;"
a=0;//     sget-boolean v2, Lcom/twocloo/com/cn/common/Constants;->isCheckBFBook:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 467
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     sput-boolean v2, Lcom/twocloo/com/cn/common/Constants;->isCheckBFBook:Z
a=0;// 
a=0;//     .line 468
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p1}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v1, v2, :cond_1
a=0;// 
a=0;//     .line 484
a=0;//     .end local v1    # "i":I
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 469
a=0;//     .restart local v1    # "i":I
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 470
a=0;//     .local v0, "bfb":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/BFBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/BFBook;->getAuthor()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/BFBook;->getImgFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 471
a=0;//     :cond_2
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 472
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/http/ThreadPoolManager;->getInstance()Lcom/twocloo/com/cn/http/ThreadPoolManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Lcom/twocloo/com/cn/fragment/BookShelfFragment$2;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$2;);
a=0;//     invoke-direct {v3, p0, v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$2;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Lcom/twocloo/com/cn/beans/BFBook;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$2;);
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/http/ThreadPoolManager;->addTask(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 468
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static dismissProgressDialog(Landroid/app/ProgressDialog;)V
a=0;//     .locals 0
a=0;//     .param p0, "pd"    # Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1218
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 1219
a=0;//     invoke-virtual {p0}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 1220
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private downBook(I)V
a=0;//     .locals 2
a=0;//     .param p1, "p"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1238
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 1239
a=0;//     .local v0, "msg":Landroid/os/Message;
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iput p1, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 1240
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 1241
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 1242
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private insertShelfBookInfoToDB(Lcom/twocloo/com/cn/beans/BFBook;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "bf"    # Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .param p2, "aid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 492
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-virtual {v0, p1, p2, v1}, Lcom/twocloo/com/cn/db/DBAdapter;->updateBF(Lcom/twocloo/com/cn/beans/BFBook;Ljava/lang/String;Landroid/app/Activity;)J
a=0;// 
a=0;//     .line 493
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private notice(Landroid/widget/TextView;)V
a=0;//     .locals 13
a=0;//     .param p1, "tv"    # Landroid/widget/TextView;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v12, 0x4
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     .line 728
a=0;//     #v8=(PosByte);
a=0;//     new-instance v5, Ljava/util/Random;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/Random;);
a=0;//     invoke-direct {v5}, Ljava/util/Random;-><init>()V
a=0;// 
a=0;//     .line 729
a=0;//     .local v5, "random":Ljava/util/Random;
a=0;//     #v5=(Reference,Ljava/util/Random;);
a=0;//     invoke-virtual {v5, v8}, Ljava/util/Random;->nextInt(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 730
a=0;//     .local v1, "index":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v6, 0x6
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v0, v6, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     aput v9, v0, v9
a=0;// 
a=0;//     aput v10, v0, v10
a=0;// 
a=0;//     aput v11, v0, v11
a=0;// 
a=0;//     aput v12, v0, v12
a=0;// 
a=0;//     aput v8, v0, v8
a=0;// 
a=0;//     .line 731
a=0;//     .local v0, "i":[I
a=0;//     const/4 v6, 0x6
a=0;// 
a=0;//     new-array v3, v6, [Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const-string v7, "\u6b22\u8fce\u6765\u5230\u4e8c\u5c42\u697c\u4e66\u9662\uff0c\u7b7e\u5230\u83b7\u53d6\u4e66\u5238\uff01"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     aput-object v7, v3, v6
a=0;// 
a=0;//     const-string v6, "\u5e74\u7ec8\u5de8\u60e0\uff0c\u4f18\u60e0\u5305\u6708\u7545\u8bfb\uff0c\u5feb\u6765\u5305\u6708\u5427\uff01"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     aput-object v6, v3, v9
a=0;// 
a=0;//     const-string v6, "\u6b22\u8fce\u6765\u5230\u4e8c\u5c42\u697c\u4e66\u9662\uff0c\u7b7e\u5230\u83b7\u53d6\u4e66\u5238\uff01"
a=0;// 
a=0;//     aput-object v6, v3, v10
a=0;// 
a=0;//     const-string v6, "\u5e74\u7ec8\u5de8\u60e0\uff0c\u4f18\u60e0\u5305\u6708\u7545\u8bfb\uff0c\u5feb\u6765\u5305\u6708\u5427\uff01"
a=0;// 
a=0;//     aput-object v6, v3, v11
a=0;// 
a=0;//     const-string v6, "\u6b22\u8fce\u6765\u5230\u4e8c\u5c42\u697c\u4e66\u9662\uff0c\u7b7e\u5230\u83b7\u53d6\u4e66\u5238\uff01"
a=0;// 
a=0;//     aput-object v6, v3, v12
a=0;// 
a=0;//     .line 732
a=0;//     const-string v6, "\u5e74\u7ec8\u5de8\u60e0\uff0c\u4f18\u60e0\u5305\u6708\u7545\u8bfb\uff0c\u5feb\u6765\u5305\u6708\u5427\uff01"
a=0;// 
a=0;//     aput-object v6, v3, v8
a=0;// 
a=0;//     .line 733
a=0;//     .local v3, "noticeArray":[Ljava/lang/String;
a=0;//     aget-object v4, v3, v1
a=0;// 
a=0;//     .line 734
a=0;//     .local v4, "noticetv":Ljava/lang/String;
a=0;//     #v4=(Null);
a=0;//     aget v2, v0, v1
a=0;// 
a=0;//     .line 735
a=0;//     .local v2, "j":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 738
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->rl_top:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     new-instance v7, Lcom/twocloo/com/cn/fragment/BookShelfFragment$7;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$7;);
a=0;//     invoke-direct {v7, p0, v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$7;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;I)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$7;);
a=0;//     invoke-virtual {v6, v7}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 748
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private sychronizeBook()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 648
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/common/LocalStore;->getUnSychronizedBooks(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 649
a=0;//     .local v2, "bookids":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 650
a=0;//     .local v1, "bookIdlist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 664
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 653
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Boolean);v6=(Uninit);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     sput-boolean v5, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->isSychronized:Z
a=0;// 
a=0;//     .line 654
a=0;//     const-string v5, ","
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 655
a=0;//     const-string v5, ","
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 656
a=0;//     .local v0, "bookArr":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_1
a=0;//     #v3=(Integer);
a=0;//     array-length v5, v0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v3, v5, :cond_1
a=0;// 
a=0;//     .line 662
a=0;//     .end local v0    # "bookArr":[Ljava/lang/String;
a=0;//     .end local v3    # "i":I
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/task/DelArrangeBookTask;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/task/DelArrangeBookTask;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-direct {v4, v5, v1, v6}, Lcom/twocloo/com/cn/task/DelArrangeBookTask;-><init>(Landroid/app/Activity;Ljava/util/List;Lcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;// 
a=0;//     .line 663
a=0;//     .local v4, "task":Lcom/twocloo/com/cn/task/DelArrangeBookTask;
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/task/DelArrangeBookTask;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     new-array v5, v5, [Ljava/lang/Void;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v4, v5}, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 657
a=0;//     .end local v4    # "task":Lcom/twocloo/com/cn/task/DelArrangeBookTask;
a=0;//     .restart local v0    # "bookArr":[Ljava/lang/String;
a=0;//     .restart local v3    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Reference,[Ljava/lang/String;);v3=(Integer);v4=(Uninit);v5=(Integer);v6=(Uninit);
a=0;//     aget-object v5, v0, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 656
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 660
a=0;//     .end local v0    # "bookArr":[Ljava/lang/String;
a=0;//     .end local v3    # "i":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v3=(Uninit);v5=(Boolean);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private updatebook(I)V
a=0;//     .locals 2
a=0;//     .param p1, "p"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1251
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 1252
a=0;//     .local v0, "msg":Landroid/os/Message;
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iput p1, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 1253
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 1254
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 1255
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public doUpdata()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 904
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/BanbenxinThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/BanbenxinThread;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/twocloo/com/cn/threads/BanbenxinThread;-><init>(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/BanbenxinThread;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->bbxxth:Lcom/twocloo/com/cn/threads/BanbenxinThread;
a=0;// 
a=0;//     .line 905
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->bbxxth:Lcom/twocloo/com/cn/threads/BanbenxinThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/threads/BanbenxinThread;->start()V
a=0;// 
a=0;//     .line 906
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getNowTime(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setUptime(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 907
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public flushLastReadHistory()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 777
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getAdapt()Landroid/widget/BaseAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 934
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->adapt:Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/BaseAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getCurpop()Landroid/widget/PopupWindow;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 938
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->curpop:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDbAdapter()Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 954
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFooter()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1258
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->footer:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getGobookcityBtn()Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 986
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->gobookcityBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getHandler()Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 978
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getIsvip()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 926
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->isvip:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getList()Ljava/util/Vector;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 970
a=0;//     sget-object v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getListView()Landroid/widget/ListView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 922
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->listview:Lcom/twocloo/com/cn/view/PullRefreshListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/PullRefreshListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getMaxCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 531
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->maxCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getNowTime(I)I
a=0;//     .locals 6
a=0;//     .param p1, "flag"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 911
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 912
a=0;//     .local v0, "c":Ljava/util/Calendar;
a=0;//     #v0=(Reference,Ljava/util/Calendar;);
a=0;//     invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 913
a=0;//     .local v1, "time":J
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-ne p1, v3, :cond_1
a=0;// 
a=0;//     .line 914
a=0;//     const-wide/32 v3, 0x5265c00
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long/2addr v1, v3
a=0;// 
a=0;//     .line 918
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v3, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v4, "yyyyMMddHH"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/Locale;);
a=0;//     invoke-direct {v3, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     return v3
a=0;// 
a=0;//     .line 915
a=0;//     :cond_1
a=0;//     #v3=(One);v4=(Uninit);v5=(Uninit);
a=0;//     const/4 v3, 0x7
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne p1, v3, :cond_0
a=0;// 
a=0;//     .line 916
a=0;//     const-wide/32 v3, 0x240c8400
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long/2addr v1, v3
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getPopwebview()Landroid/webkit/WebView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1223
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->popwebview:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getStart()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 523
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->start:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getTb()Lcom/twocloo/com/cn/db/LastReadTable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 962
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->tb:Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTotalCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 515
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->totalCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public initBookPop(Ljava/lang/String;)Landroid/widget/PopupWindow;
a=0;//     .locals 11
a=0;//     .param p1, "str"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, -0x2
a=0;// 
a=0;//     .line 790
a=0;//     #v10=(Byte);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 791
a=0;//     .local v2, "pi":Ljava/lang/Integer;
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$layout;->book_pop:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {v6, v7, v8, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 792
a=0;//     .local v3, "popview":Landroid/view/View;
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     new-instance v4, Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/widget/PopupWindow;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-direct {v4, v3, v10, v10, v6}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V
a=0;// 
a=0;//     .line 793
a=0;//     .local v4, "popwin":Landroid/widget/PopupWindow;
a=0;//     #v4=(Reference,Landroid/widget/PopupWindow;);
a=0;//     sget-object v6, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 794
a=0;//     .local v0, "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iput-object v6, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 795
a=0;//     sget v6, Lcom/twocloo/com/cn/R$id;->updatelayout:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     check-cast v6, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v6, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->updatelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 796
a=0;//     sget v6, Lcom/twocloo/com/cn/R$id;->book_pop:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     .line 798
a=0;//     .local v1, "btn1":Landroid/widget/Button;
a=0;//     sget v6, Lcom/twocloo/com/cn/R$id;->updatebtn:I
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 800
a=0;//     .local v5, "update":Landroid/widget/ImageView;
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/BFBook;->getBookDrawable()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 801
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/BFBook;->getBookDrawable()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 806
a=0;//     :goto_0
a=0;//     #v6=(Conflicted);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/fragment/BookShelfFragment$8;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$8;);
a=0;//     invoke-direct {v6, p0, v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$8;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Ljava/lang/Integer;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$8;);
a=0;//     invoke-virtual {v1, v6}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 815
a=0;//     new-instance v6, Lcom/twocloo/com/cn/fragment/BookShelfFragment$9;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$9;);
a=0;//     invoke-direct {v6, p0, v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$9;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Ljava/lang/Integer;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$9;);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 823
a=0;//     new-instance v6, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     invoke-direct {v6}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     invoke-virtual {v4, v6}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 824
a=0;//     return-object v4
a=0;// 
a=0;//     .line 803
a=0;//     :cond_0
a=0;//     sget v6, Lcom/twocloo/com/cn/R$drawable;->default_cover:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v1, v6}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public initMorePop()Landroid/widget/PopupWindow;
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, -0x2
a=0;// 
a=0;//     .line 833
a=0;//     #v9=(Byte);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget v6, Lcom/twocloo/com/cn/R$layout;->book_shelf_more_pop:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v5, v6, v7, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 834
a=0;//     .local v2, "popview":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     new-instance v3, Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/PopupWindow;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-direct {v3, v2, v9, v9, v5}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V
a=0;// 
a=0;//     .line 836
a=0;//     .local v3, "popwin":Landroid/widget/PopupWindow;
a=0;//     #v3=(Reference,Landroid/widget/PopupWindow;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->btn_arrange:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 837
a=0;//     .local v0, "arrange_btn":Landroid/widget/TextView;
a=0;//     new-instance v5, Lcom/twocloo/com/cn/fragment/BookShelfFragment$10;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$10;);
a=0;//     invoke-direct {v5, p0, v3}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$10;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Landroid/widget/PopupWindow;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$10;);
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 848
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->btn_dingyue:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 849
a=0;//     .local v1, "myOrderBtn":Landroid/widget/TextView;
a=0;//     new-instance v5, Lcom/twocloo/com/cn/fragment/BookShelfFragment$11;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$11;);
a=0;//     invoke-direct {v5, p0, v3}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$11;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Landroid/widget/PopupWindow;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$11;);
a=0;//     invoke-virtual {v1, v5}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 864
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->btn_tongbu:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     check-cast v4, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 865
a=0;//     .local v4, "sychronizedBookShelfBtn":Landroid/widget/TextView;
a=0;//     new-instance v5, Lcom/twocloo/com/cn/fragment/BookShelfFragment$12;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$12;);
a=0;//     invoke-direct {v5, p0, v3}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$12;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Landroid/widget/PopupWindow;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$12;);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 883
a=0;//     new-instance v5, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     invoke-direct {v5}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     invoke-virtual {v3, v5}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 884
a=0;//     return-object v3
a=0;// .end method
a=0;// 
a=0;// .method public isFinish()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 946
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->finish:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected loadData()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 690
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 691
a=0;//     new-instance v1, Lcom/twocloo/com/cn/task/BookShelfInitTask;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/task/BookShelfInitTask;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/task/BookShelfInitTask;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/task/BookShelfInitTask;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Void;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/task/BookShelfInitTask;->execute([Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 696
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 693
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 694
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onActivityCreated(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 540
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 549
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     sput-object v1, Lcom/twocloo/com/cn/http/DownFile;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 550
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->top_bar:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 551
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->bf_main:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->mainLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 552
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 553
a=0;//     .local v0, "title":Landroid/widget/TextView;
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->bookshelf_title:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 554
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$color;->white:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 555
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->rl_top:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->rl_top:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 556
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->bookshell_notice_tv:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->noticeTv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 557
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->clear_btn:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->clear_btn:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 558
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->clear_btn:Landroid/widget/ImageView;
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/fragment/BookShelfFragment$3;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$3;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$3;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$3;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 573
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->gobookcity:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->gobookcityBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 574
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->gobookcityBtn:Landroid/widget/Button;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 575
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->gobookcityBtn:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/fragment/BookShelfFragment$4;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$4;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$4;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$4;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 585
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->top_bar_button_right_more:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->top_bar_button_right_more:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 586
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->top_bar_button_right_more:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 588
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->top_bar_button_right_more:Landroid/widget/ImageButton;
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/fragment/BookShelfFragment$5;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$5;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$5;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$5;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 595
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->listview:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/view/PullRefreshListView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->listview:Lcom/twocloo/com/cn/view/PullRefreshListView;
a=0;// 
a=0;//     .line 596
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->bf_yy:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->rl:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 597
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->loadData()V
a=0;// 
a=0;//     .line 599
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getBookShelfStyle(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->style:Z
a=0;// 
a=0;//     .line 622
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->listview:Lcom/twocloo/com/cn/view/PullRefreshListView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/PullRefreshListView;);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/fragment/BookShelfFragment$6;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$6;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$6;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$6;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/view/PullRefreshListView;->setonLoadmoreListener(Lcom/twocloo/com/cn/view/PullRefreshListView$OnLoadmoreListener;)V
a=0;// 
a=0;//     .line 640
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;I)V
a=0;//     .locals 0
a=0;//     .param p1, "buttonview"    # Landroid/view/View;
a=0;//     .param p2, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1059
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;//     .locals 2
a=0;//     .param p1, "inflater"    # Landroid/view/LayoutInflater;
a=0;//     .param p2, "container"    # Landroid/view/ViewGroup;
a=0;//     .param p3, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->gallerylist:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 891
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V
a=0;// 
a=0;//     .line 892
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 893
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     .line 894
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDestroyView()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 502
a=0;//     sget-object v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->clear()V
a=0;// 
a=0;//     .line 503
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V
a=0;// 
a=0;//     .line 504
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onNothingSelected(Landroid/widget/AdapterView;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/widget/AdapterView",
a=0;//             "<*>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 888
a=0;//     .local p1, "parent":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPause()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 897
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V
a=0;// 
a=0;//     .line 898
a=0;//     const-string v0, "BookShelfFragment"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 899
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->finish:Z
a=0;// 
a=0;//     .line 900
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onResume()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 705
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V
a=0;// 
a=0;//     .line 706
a=0;//     const-string v0, "BookShelfFragment"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 708
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->mainLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->setBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 709
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMainTopBackGrundLayout(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 710
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 711
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->rl_top:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$color;->night_mode_bg:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 715
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->noticeTv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->notice(Landroid/widget/TextView;)V
a=0;// 
a=0;//     .line 716
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->sychronizeBook()V
a=0;// 
a=0;//     .line 717
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->adapt:Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 718
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 720
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 713
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(One);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->rl_top:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$color;->notice_mode_bg:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onStart()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 700
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V
a=0;// 
a=0;//     .line 702
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 667
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 669
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->gobookcityBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 670
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getListView()Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V
a=0;// 
a=0;//     .line 676
a=0;//     :goto_0
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->style:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 682
a=0;//     new-instance v0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/adapters/ListViewAdapt;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getHandler()Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Vector;);
a=0;//     invoke-direct {v0, v1, p0, v2}, Lcom/twocloo/com/cn/adapters/ListViewAdapt;-><init>(Landroid/os/Handler;Lcom/twocloo/com/cn/fragment/BookShelfFragment;Ljava/util/Vector;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->adapt:Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     .line 685
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getListView()Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->adapt:Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/BaseAdapter;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 686
a=0;//     return-void
a=0;// 
a=0;//     .line 673
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->gobookcityBtn:Landroid/widget/Button;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 674
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getListView()Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ListView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setCurpop(Landroid/widget/PopupWindow;)V
a=0;//     .locals 0
a=0;//     .param p1, "curpop"    # Landroid/widget/PopupWindow;
a=0;// 
a=0;//     .prologue
a=0;//     .line 942
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->curpop:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     .line 943
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDbAdapter(Lcom/twocloo/com/cn/db/DBAdapter;)V
a=0;//     .locals 0
a=0;//     .param p1, "dbAdapter"    # Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 958
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     .line 959
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFinish(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "finish"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 950
a=0;//     iput-boolean p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->finish:Z
a=0;// 
a=0;//     .line 951
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFooter(Landroid/view/View;)V
a=0;//     .locals 0
a=0;//     .param p1, "footer"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1262
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->footer:Landroid/view/View;
a=0;// 
a=0;//     .line 1263
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setGobookcityBtn(Landroid/widget/Button;)V
a=0;//     .locals 0
a=0;//     .param p1, "gobookcityBtn"    # Landroid/widget/Button;
a=0;// 
a=0;//     .prologue
a=0;//     .line 990
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->gobookcityBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 991
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setHandler(Landroid/os/Handler;)V
a=0;//     .locals 0
a=0;//     .param p1, "handler"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 982
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 983
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setIsvip(I)V
a=0;//     .locals 0
a=0;//     .param p1, "isvip"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 930
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->isvip:I
a=0;// 
a=0;//     .line 931
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setList(Ljava/util/Vector;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 974
a=0;//     .local p1, "list":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/twocloo/com/cn/beans/BFBook;>;"
a=0;//     sput-object p1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     .line 975
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setMaxCount(I)V
a=0;//     .locals 0
a=0;//     .param p1, "maxCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 535
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->maxCount:I
a=0;// 
a=0;//     .line 536
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPopwebview(Landroid/webkit/WebView;)V
a=0;//     .locals 0
a=0;//     .param p1, "popwebview"    # Landroid/webkit/WebView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1227
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->popwebview:Landroid/webkit/WebView;
a=0;// 
a=0;//     .line 1228
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setStart(I)V
a=0;//     .locals 0
a=0;//     .param p1, "start"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 527
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->start:I
a=0;// 
a=0;//     .line 528
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTb(Lcom/twocloo/com/cn/db/LastReadTable;)V
a=0;//     .locals 0
a=0;//     .param p1, "tb"    # Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 966
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->tb:Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     .line 967
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTotalCount(I)V
a=0;//     .locals 0
a=0;//     .param p1, "totalCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 519
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->totalCount:I
a=0;// 
a=0;//     .line 520
a=0;//     return-void
a=0;// .end method
}}
