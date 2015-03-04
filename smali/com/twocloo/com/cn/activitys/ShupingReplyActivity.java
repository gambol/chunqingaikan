package com.twocloo.com.cn.activitys; class ShupingReplyActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "ShupingReplyActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final MORE_PAGE:Ljava/lang/String; = "more"
a=0;// 
a=0;// .field public static final ONE_PAGE:Ljava/lang/String; = "one"
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "ShupingReplyActivity"
a=0;// 
a=0;// .field public static isOutway:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private aid:Ljava/lang/String;
a=0;// 
a=0;// .field private backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field private content:Landroid/widget/TextView;
a=0;// 
a=0;// .field private count:Landroid/widget/TextView;
a=0;// 
a=0;// .field dataCallBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//             "<",
a=0;//             "Ljava/lang/Boolean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private dialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field private edit:Landroid/widget/EditText;
a=0;// 
a=0;// .field private huifu:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private huifuLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private icon:Ljava/lang/String;
a=0;// 
a=0;// .field private isAdd:Z
a=0;// 
a=0;// .field private jubaoButton:Landroid/widget/Button;
a=0;// 
a=0;// .field private line1:Landroid/view/View;
a=0;// 
a=0;// .field private line2:Landroid/view/View;
a=0;// 
a=0;// .field private loadMoreTv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private loadingLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private nonelayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private pagecount:I
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private pid:I
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
a=0;// .field private pingluntime:Landroid/widget/TextView;
a=0;// 
a=0;// .field private plUsername:Landroid/widget/TextView;
a=0;// 
a=0;// .field private plcontent:Ljava/lang/String;
a=0;// 
a=0;// .field private plcount:I
a=0;// 
a=0;// .field private pltime:Ljava/lang/String;
a=0;// 
a=0;// .field private plusername:Ljava/lang/String;
a=0;// 
a=0;// .field private qingshafaTextView:Landroid/widget/TextView;
a=0;// 
a=0;// .field queryCallBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private replyAdapter:Lcom/twocloo/com/cn/adapters/ReplyAdapter;
a=0;// 
a=0;// .field private replyListView:Landroid/widget/ListView;
a=0;// 
a=0;// .field private replyTask:Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;// .field private reply_layout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private reply_topic_layout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private searchLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private sendBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private shuping_maininfo:Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;// .field private supportTv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private supportcount:I
a=0;// 
a=0;// .field private supportlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private tid:I
a=0;// 
a=0;// .field private titleTv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// .field private topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private topicIcon:Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// .field private zan:Landroid/widget/ImageView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->isOutway:Z
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
a=0;//     .line 58
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 73
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 74
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->searchLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 77
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pagecount:I
a=0;// 
a=0;//     .line 79
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pinglunList:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 80
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->replyAdapter:Lcom/twocloo/com/cn/adapters/ReplyAdapter;
a=0;// 
a=0;//     .line 81
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->replyTask:Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;//     .line 82
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->plusername:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->plcontent:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pltime:Ljava/lang/String;
a=0;// 
a=0;//     .line 83
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->tid:I
a=0;// 
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pid:I
a=0;// 
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->plcount:I
a=0;// 
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->supportcount:I
a=0;// 
a=0;//     .line 87
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->shuping_maininfo:Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     .line 95
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 331
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->dataCallBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     .line 345
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->queryCallBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     .line 428
a=0;//     iput-boolean v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->isAdd:Z
a=0;// 
a=0;//     .line 58
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->count:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->plcount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Lcom/twocloo/com/cn/task/ReplyTask;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->replyTask:Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/ReplyTask;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$11(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pinglunList:Ljava/util/ArrayList;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$12(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pinglunList:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$13(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/ListView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->replyListView:Landroid/widget/ListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$14(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/LinearLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->nonelayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$15(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/LinearLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->loadingLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$16(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$17(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->token:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$18(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$19(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;Lcom/twocloo/com/cn/adapters/ReplyAdapter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->replyAdapter:Lcom/twocloo/com/cn/adapters/ReplyAdapter;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/EditText;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->edit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/EditText;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$20(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Lcom/twocloo/com/cn/adapters/ReplyAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->replyAdapter:Lcom/twocloo/com/cn/adapters/ReplyAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ReplyAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$21(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 452
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->addLoadView()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$22(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/app/Dialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$23(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->shuping_maininfo:Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/Shuping_maininfo;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pagecount:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->tid:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pid:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pagecount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->loadMoreTv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;Lcom/twocloo/com/cn/task/ReplyTask;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->replyTask:Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private addLoadView()V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     .line 453
a=0;//     #v3=(Byte);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v1, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 454
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p0, v0, v10}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 462
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 457
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,Lcom/twocloo/base/common/NetType;);v2=(Uninit);v3=(Byte);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->loadingLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->searchLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     new-instance v2, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 458
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v2, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 457
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 459
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pagecount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pagecount:I
a=0;// 
a=0;//     .line 460
a=0;//     new-instance v0, Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/task/ReplyTask;);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->tid:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pid:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pagecount:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v6, 0xa
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->loadMoreTv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->queryCallBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/singlebook/DataCallBack;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     invoke-direct/range {v0 .. v9}, Lcom/twocloo/com/cn/task/ReplyTask;-><init>(Landroid/app/Activity;IILjava/lang/String;IILandroid/widget/TextView;ZLcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/ReplyTask;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->replyTask:Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;//     .line 461
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->replyTask:Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;//     new-array v1, v10, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/task/ReplyTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private initViews()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_jubao:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->jubaoButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 153
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 154
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbarlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 155
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->enter_pinglun:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->reply_layout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 156
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->reply_topic_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->reply_topic_layout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 157
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 158
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->titleTv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 159
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     .line 160
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     .line 161
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->qiangshafa:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->qingshafaTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->qingshafaTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 163
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->icon:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->topicIcon:Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     .line 164
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->username:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->plUsername:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 165
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->pingluntime:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pingluntime:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 166
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->content:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->content:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 167
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->huifucountTv:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->count:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 168
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->supportTv:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->supportTv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 169
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->replylist:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ListView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->replyListView:Landroid/widget/ListView;
a=0;// 
a=0;//     .line 170
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->nulllayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->nonelayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->replyListView:Landroid/widget/ListView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->showLayout()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 172
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->supportlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->supportlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 173
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bottomlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->huifuLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->supportlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->huifuLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 176
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->input_edit:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->edit:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 177
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->sendbtn:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->sendBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 179
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->support_icon:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->zan:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->zan:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 181
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->huifu_icon:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->huifu:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->huifu:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->sendBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 185
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->jubaoButton:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 187
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setTopicMessage()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->plUsername:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->plusername:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pingluntime:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pltime:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 195
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->content:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->plcontent:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->count:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->plcount:I
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
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->supportTv:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->supportcount:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->titleTv:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->plusername:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u7684\u8bc4\u8bba"
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
a=0;//     .line 200
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->titleTv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$color;->usercenter_text:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->icon:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 203
a=0;//     const-string v0, "/2cloo/imgCache/"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/base/http/LoadImgProvider;->getInstance(Ljava/lang/String;)Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->icon:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->topicIcon:Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/CircleImageView;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/twocloo/base/http/LoadImgProvider;->load(Ljava/lang/String;Landroid/widget/ImageView;Z)V
a=0;// 
a=0;//     .line 207
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 205
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(Integer);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->topicIcon:Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->usercentericon_nan:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/CircleImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 17
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 254
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 255
a=0;//     .local v15, "id":I
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v2}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v15, v2, :cond_1
a=0;// 
a=0;//     .line 256
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->finish()V
a=0;// 
a=0;//     .line 326
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v16=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 257
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v16=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->sendBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v2}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v15, v2, :cond_4
a=0;// 
a=0;//     .line 259
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 260
a=0;//     const-string v2, "\u8bf7\u5148\u767b\u5f55"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 261
a=0;//     const-string v2, "LOGINTAG"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 264
a=0;//     :cond_2
a=0;//     #v3=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->edit:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 265
a=0;//     .local v6, "contents":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 266
a=0;//     const-string v2, "\u8fd8\u6ca1\u6709\u8f93\u5165\u5185\u5bb9"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 269
a=0;//     :cond_3
a=0;//     #v2=(Boolean);v3=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUsername()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 271
a=0;//     .local v5, "username":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/task/CommentTask;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/task/CommentTask;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->token:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v8, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->tid:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v9, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pid:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 272
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v10, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->dataCallBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/singlebook/DataCallBack;);
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     .line 271
a=0;//     invoke-direct/range {v1 .. v10}, Lcom/twocloo/com/cn/task/CommentTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;// 
a=0;//     .line 273
a=0;//     .local v1, "commentTask":Lcom/twocloo/com/cn/task/CommentTask;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/task/CommentTask;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Void;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/task/CommentTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 274
a=0;//     .end local v1    # "commentTask":Lcom/twocloo/com/cn/task/CommentTask;
a=0;//     .end local v5    # "username":Ljava/lang/String;
a=0;//     .end local v6    # "contents":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->jubaoButton:Landroid/widget/Button;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Button;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v2, :cond_5
a=0;// 
a=0;//     .line 275
a=0;//     const-string v8, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "\u8fd9\u662f\u4e2a\u5783\u573e\u8bc4\u8bba\uff0c\u6211\u8981\u4e3e\u62a5\u3002"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const-string v11, "\u6211\u8981\u4e3e\u62a5"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const-string v12, "\u70b9\u9519\u4e86"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     new-instance v13, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;
a=0;// 
a=0;//     #v13=(UninitRef,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v13, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;-><init>(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)V
a=0;// 
a=0;//     .line 294
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;);
a=0;//     new-instance v14, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$5;
a=0;// 
a=0;//     #v14=(UninitRef,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$5;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v14, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$5;-><init>(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)V
a=0;// 
a=0;//     #v14=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$5;);
a=0;//     move-object/from16 v7, p0
a=0;// 
a=0;//     .line 275
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static/range {v7 .. v14}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 302
a=0;//     :cond_5
a=0;//     #v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->qingshafaTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v2, :cond_6
a=0;// 
a=0;//     .line 303
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->edit:Landroid/widget/EditText;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/twocloo/com/cn/common/Util;->showSoftKeyBoard(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 304
a=0;//     :cond_6
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->huifuLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v2, :cond_7
a=0;// 
a=0;//     .line 305
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->edit:Landroid/widget/EditText;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/twocloo/com/cn/common/Util;->showSoftKeyBoard(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 306
a=0;//     :cond_7
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->supportlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     .line 307
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/utils/MySharedPreferences;->getMySharedPreferences(Landroid/content/Context;)Lcom/twocloo/com/cn/utils/MySharedPreferences;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 308
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "supportCount"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v4, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->tid:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "0"
a=0;// 
a=0;//     .line 307
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/twocloo/com/cn/utils/MySharedPreferences;->getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 309
a=0;//     .local v16, "mySupportCountString":Ljava/lang/String;
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "1"
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     .line 310
a=0;//     const-string v2, "\u4eb2\uff0c\u4f60\u5df2\u7ecf\u8d5e\u8fc7\u6b64\u6761\u8bc4\u8bba\u3002"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 313
a=0;//     :cond_8
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v3, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 317
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->zan:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->zan1_press:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 318
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->supportTv:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v4, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->supportcount:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 320
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/utils/MySharedPreferences;->getMySharedPreferences(Landroid/content/Context;)Lcom/twocloo/com/cn/utils/MySharedPreferences;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "supportCount"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v4, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->tid:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "1"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/twocloo/com/cn/utils/MySharedPreferences;->setValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 322
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/utils/MySharedPreferences;->getMySharedPreferences(Landroid/content/Context;)Lcom/twocloo/com/cn/utils/MySharedPreferences;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "supportTotalCount"
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v4, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pid:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v7, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->supportcount:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/twocloo/com/cn/utils/MySharedPreferences;->setValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 324
a=0;//     new-instance v7, Lcom/twocloo/com/cn/threads/SupportThread;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/threads/SupportThread;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v9, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v10, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->token:Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v11, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->tid:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v12, v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pid:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-direct/range {v7 .. v12}, Lcom/twocloo/com/cn/threads/SupportThread;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;II)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/threads/SupportThread;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/threads/SupportThread;->start()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 11
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 99
a=0;//     #v8=(Null);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 100
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 101
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->pinglun_reply_layout:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 102
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Window;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V
a=0;// 
a=0;//     .line 103
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->initViews()V
a=0;// 
a=0;//     .line 104
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "replytopicinfo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 105
a=0;//     .local v10, "b":Landroid/os/Bundle;
a=0;//     #v10=(Reference,Landroid/os/Bundle;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/Shuping_maininfo;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/Shuping_maininfo;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->shuping_maininfo:Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     .line 106
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     .line 107
a=0;//     const-string v0, "aid"
a=0;// 
a=0;//     invoke-virtual {v10, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 108
a=0;//     const-string v0, "author"
a=0;// 
a=0;//     invoke-virtual {v10, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->plusername:Ljava/lang/String;
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->shuping_maininfo:Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->plusername:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setAuthor(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 110
a=0;//     const-string v0, "time"
a=0;// 
a=0;//     invoke-virtual {v10, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pltime:Ljava/lang/String;
a=0;// 
a=0;//     .line 111
a=0;//     const-string v0, "replies"
a=0;// 
a=0;//     invoke-virtual {v10, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->plcount:I
a=0;// 
a=0;//     .line 112
a=0;//     const-string v0, "content"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->plcontent:Ljava/lang/String;
a=0;// 
a=0;//     .line 113
a=0;//     const-string v0, "supportcount"
a=0;// 
a=0;//     invoke-virtual {v10, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->supportcount:I
a=0;// 
a=0;//     .line 114
a=0;//     const-string v0, "tid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->tid:I
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->shuping_maininfo:Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/Shuping_maininfo;);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->tid:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setTid(I)V
a=0;// 
a=0;//     .line 116
a=0;//     const-string v0, "pid"
a=0;// 
a=0;//     invoke-virtual {v10, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pid:I
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->shuping_maininfo:Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/Shuping_maininfo;);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pid:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setPid(I)V
a=0;// 
a=0;//     .line 118
a=0;//     const-string v0, "icon"
a=0;// 
a=0;//     invoke-virtual {v10, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->icon:Ljava/lang/String;
a=0;// 
a=0;//     .line 120
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->setTopicMessage()V
a=0;// 
a=0;//     .line 122
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 123
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 124
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 127
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->replyListView:Landroid/widget/ListView;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$3;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$3;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$3;-><init>(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$3;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
a=0;// 
a=0;//     .line 144
a=0;//     new-instance v0, Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/task/ReplyTask;);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->tid:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pid:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->pagecount:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v6, 0xa
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->loadMoreTv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->queryCallBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/singlebook/DataCallBack;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     invoke-direct/range {v0 .. v9}, Lcom/twocloo/com/cn/task/ReplyTask;-><init>(Landroid/app/Activity;IILjava/lang/String;IILandroid/widget/TextView;ZLcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/ReplyTask;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->replyTask:Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->replyTask:Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;//     new-array v1, v8, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/task/ReplyTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 147
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isJumpToReply:Z
a=0;// 
a=0;//     .line 149
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 250
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 235
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 236
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 237
a=0;//     const-string v0, "ShupingReplyActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 238
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 239
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 212
a=0;//     const-string v0, "ShupingReplyActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 213
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->replyListView:Landroid/widget/ListView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->nonelayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 217
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->reply_layout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->content:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setGrayTextColor(Landroid/app/Activity;Landroid/widget/TextView;)V
a=0;// 
a=0;//     .line 231
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onStop()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onStop()V
a=0;// 
a=0;//     .line 244
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showLayout()Landroid/view/View;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v6, 0x11
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/4 v4, -0x2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 431
a=0;//     #v3=(Null);
a=0;//     new-instance v2, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->searchLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 432
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->searchLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     .line 434
a=0;//     new-instance v0, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/ProgressBar;);
a=0;//     invoke-direct {v0, p0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 435
a=0;//     .local v0, "progressBar":Landroid/widget/ProgressBar;
a=0;//     #v0=(Reference,Landroid/widget/ProgressBar;);
a=0;//     const/16 v2, 0x14
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v3, v3, v2, v3}, Landroid/widget/ProgressBar;->setPadding(IIII)V
a=0;// 
a=0;//     .line 436
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->searchLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     new-instance v3, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 437
a=0;//     #v3=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v3, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 436
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v2, v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 439
a=0;//     new-instance v1, Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 440
a=0;//     .local v1, "textView":Landroid/widget/TextView;
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v2, "\u8f7d\u5165\u4e2d..."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 441
a=0;//     const/high16 v2, 0x41700000    # 15.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     .line 442
a=0;//     const/16 v2, 0x10
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     .line 443
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->searchLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     new-instance v3, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v3, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 444
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->searchLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Landroid/widget/LinearLayout;->setGravity(I)V
a=0;// 
a=0;//     .line 446
a=0;//     new-instance v2, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->loadingLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 447
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->loadingLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Landroid/widget/LinearLayout;->setGravity(I)V
a=0;// 
a=0;//     .line 449
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->loadingLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     return-object v2
a=0;// .end method
}}
