package com.twocloo.com.cn.activitys; class Readbook { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// .super Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// .source "Readbook.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation build Landroid/annotation/SuppressLint;
a=0;//     value = {
a=0;//         "ParserError",
a=0;//         "WrongCall"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final readAheadLoader:Lcom/twocloo/com/cn/http/ReadAheadLoader;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private a:Ljava/lang/String;
a=0;// 
a=0;// .field private admk:I
a=0;// 
a=0;// .field private allMsg:Lcom/twocloo/com/cn/beans/OrderAllMsg;
a=0;// 
a=0;// .field private autoOrder:Z
a=0;// 
a=0;// .field private beg:I
a=0;// 
a=0;// .field private checkBox:Landroid/widget/CheckBox;
a=0;// 
a=0;// .field private count:I
a=0;// 
a=0;// .field private dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;// .field private dbHelper:Lcom/twocloo/com/cn/db/orm/OrmDBHelper;
a=0;// 
a=0;// .field private dia:Lcom/twocloo/com/cn/view/DialogView;
a=0;// 
a=0;// .field private dialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field private exist:Z
a=0;// 
a=0;// .field private fcdVip:I
a=0;// 
a=0;// .field private file:Ljava/io/File;
a=0;// 
a=0;// .field private flagFlash:I
a=0;// 
a=0;// .field private i:I
a=0;// 
a=0;// .field private imgFile:Ljava/lang/String;
a=0;// 
a=0;// .field private imgUrl:Ljava/lang/String;
a=0;// 
a=0;// .field private intenttag:Ljava/lang/String;
a=0;// 
a=0;// .field private isOnlineread:Z
a=0;// 
a=0;// .field private isV:I
a=0;// 
a=0;// .field private lastjp:I
a=0;// 
a=0;// .field private mWaitDg:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private mulist:Ljava/util/ArrayList;
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
a=0;// .field private mulu:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;// .field private netTypedialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field private p:I
a=0;// 
a=0;// .field private progress:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private r:Ljava/lang/String;
a=0;// 
a=0;// .field private rd:Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;// .field private shadowlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private sqmap:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Long;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private textid:Ljava/lang/String;
a=0;// 
a=0;// .field private textids:[Ljava/lang/String;
a=0;// 
a=0;// .field private time:I
a=0;// 
a=0;// .field private title:Ljava/lang/String;
a=0;// 
a=0;// .field private ts:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/http/ReadAheadLoader;->getInstance()Lcom/twocloo/com/cn/http/ReadAheadLoader;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/ReadAheadLoader;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/activitys/Readbook;->readAheadLoader:Lcom/twocloo/com/cn/http/ReadAheadLoader;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 82
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;-><init>()V
a=0;// 
a=0;//     .line 83
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     const-string v0, "Readbook"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 87
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->beg:I
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->isV:I
a=0;// 
a=0;//     .line 97
a=0;//     new-instance v0, Lcom/twocloo/com/cn/view/DialogView;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/view/DialogView;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/view/DialogView;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/DialogView;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dia:Lcom/twocloo/com/cn/view/DialogView;
a=0;// 
a=0;//     .line 98
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->flagFlash:I
a=0;// 
a=0;//     .line 99
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->time:I
a=0;// 
a=0;//     .line 103
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->p:I
a=0;// 
a=0;//     .line 105
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->admk:I
a=0;// 
a=0;//     .line 106
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->i:I
a=0;// 
a=0;//     .line 115
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->count:I
a=0;// 
a=0;//     .line 116
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->isOnlineread:Z
a=0;// 
a=0;//     .line 118
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->netTypedialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 82
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/Readbook;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->time:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/Readbook;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->time:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/twocloo/com/cn/activitys/Readbook;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->textid:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$11(Lcom/twocloo/com/cn/activitys/Readbook;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->autoOrder:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$12(Lcom/twocloo/com/cn/activitys/Readbook;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1234
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/activitys/Readbook;->buy(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$13(Lcom/twocloo/com/cn/activitys/Readbook;Ljava/lang/String;I)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 763
a=0;//     invoke-direct {p0, p1, p2}, Lcom/twocloo/com/cn/activitys/Readbook;->existHC(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$14(Lcom/twocloo/com/cn/activitys/Readbook;Landroid/app/ProgressDialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->mWaitDg:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$15(Lcom/twocloo/com/cn/activitys/Readbook;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->count:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$16(Lcom/twocloo/com/cn/activitys/Readbook;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->count:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$17(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->title:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$18(Lcom/twocloo/com/cn/activitys/Readbook;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1350
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->saveLastRead()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$19(Lcom/twocloo/com/cn/activitys/Readbook;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->ts:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/util/HashMap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->sqmap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$20(Lcom/twocloo/com/cn/activitys/Readbook;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->exist:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$21(Lcom/twocloo/com/cn/activitys/Readbook;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     iput-boolean p1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->ts:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$22(Lcom/twocloo/com/cn/activitys/Readbook;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->rd:Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$23(Lcom/twocloo/com/cn/activitys/Readbook;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->fcdVip:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$24(Lcom/twocloo/com/cn/activitys/Readbook;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->lastjp:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$25(Lcom/twocloo/com/cn/activitys/Readbook;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->lastjp:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$26(Lcom/twocloo/com/cn/activitys/Readbook;)Landroid/app/Dialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->netTypedialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$27(Lcom/twocloo/com/cn/activitys/Readbook;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1027
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->downbook()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$28(Lcom/twocloo/com/cn/activitys/Readbook;)Lcom/twocloo/com/cn/db/orm/OrmDBHelper;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbHelper:Lcom/twocloo/com/cn/db/orm/OrmDBHelper;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/orm/OrmDBHelper;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$29(Lcom/twocloo/com/cn/activitys/Readbook;)Landroid/app/Dialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1399
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/activitys/Readbook;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->i:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$30(Lcom/twocloo/com/cn/activitys/Readbook;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$31(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->imgUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$32(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->imgFile:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/activitys/Readbook;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->i:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->mulist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/activitys/Readbook;Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->mulist:Ljava/util/ArrayList;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->textid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/twocloo/com/cn/activitys/Readbook;Ljava/io/File;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->file:Ljava/io/File;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->file:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private addBookShelfWhenReadCountEnough()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1242
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     .line 1243
a=0;//     .local v0, "uid":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1244
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1246
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookBF1(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1247
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->showDL()V
a=0;// 
a=0;//     .line 1251
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1249
a=0;//     :cond_1
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private addMk()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1056
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/BookMark;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/BookMark;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/BookMark;-><init>()V
a=0;// 
a=0;//     .line 1057
a=0;//     .local v0, "bf":Lcom/twocloo/com/cn/beans/BookMark;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/BookMark;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1068
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1059
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getArticleId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BookMark;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1060
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BookMark;->setTextid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1061
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getTextTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BookMark;->setTexttitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1062
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/BookPageFactory;->getJJ()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BookMark;->setTextjj(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1063
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/twocloo/com/cn/beans/BookMark;->setTime(J)V
a=0;// 
a=0;//     .line 1064
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     iget v1, v1, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BookMark;->setLocation(I)V
a=0;// 
a=0;//     .line 1065
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     iget v1, v1, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BookMark;->setLength(I)V
a=0;// 
a=0;//     .line 1066
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getIsVip()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BookMark;->setIsV(I)V
a=0;// 
a=0;//     .line 1067
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/twocloo/com/cn/db/DBAdapter;->insertBookMark(Lcom/twocloo/com/cn/beans/BookMark;I)Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private buy(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "textid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1235
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1236
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private checkAutoOrder()V
a=0;//     .locals 15
a=0;// 
a=0;//     .prologue
a=0;//     .line 1074
a=0;//     new-instance v9, Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     invoke-direct {v9, p0}, Lcom/twocloo/com/cn/common/PhoneInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 1075
a=0;//     .local v9, "phone":Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/common/PhoneInfo;->getCurrentVersion()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 1076
a=0;//     .local v12, "v":I
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1077
a=0;//     .local v6, "apptype":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 1078
a=0;//     .local v7, "channel":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1079
a=0;//     .local v2, "uid":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1080
a=0;//     .local v3, "token":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v13
a=0;// 
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     invoke-virtual {v0, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/16 v13, 0xa
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     invoke-virtual {v0, v1, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1081
a=0;//     .local v4, "time":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v13, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/16 v13, 0xa
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     invoke-virtual {v0, v1, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1083
a=0;//     .local v5, "auth":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v11, Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;// 
a=0;//     #v11=(UninitRef,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     invoke-direct {v11, p0}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 1084
a=0;//     .local v11, "rht":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->open()V
a=0;// 
a=0;//     .line 1085
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1086
a=0;//     .local v8, "currentTextid":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v11, v2, v0}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->queryRecordHistroy(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 1087
a=0;//     .local v10, "result":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "0"
a=0;// 
a=0;//     iget-object v13, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v1, v13}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->queryRecordHistroy(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 1088
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->close()V
a=0;// 
a=0;//     .line 1089
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 1090
a=0;//     #v11=(Null);
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     invoke-virtual {v10, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1174
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1085
a=0;//     .end local v8    # "currentTextid":Ljava/lang/String;
a=0;//     .end local v10    # "result":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);v1=(Null);v8=(Uninit);v10=(Uninit);v11=(Reference,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);v13=(PosByte);
a=0;//     const-string v8, ""
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1094
a=0;//     .restart local v8    # "currentTextid":Ljava/lang/String;
a=0;//     .restart local v10    # "result":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v10=(Reference,Ljava/lang/String;);v11=(Null);v13=(Reference,Ljava/lang/String;);
a=0;//     new-instance v13, Ljava/lang/Thread;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/Readbook$8;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/Readbook$8;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/twocloo/com/cn/activitys/Readbook$8;-><init>(Lcom/twocloo/com/cn/activitys/Readbook;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$8;);
a=0;//     invoke-direct {v13, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 1172
a=0;//     #v13=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v13}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private closeDialog()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 421
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->mWaitDg:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->mWaitDg:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 422
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->mWaitDg:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 423
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->mWaitDg:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 425
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private closeProgress()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 411
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->progress:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->progress:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 412
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->progress:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 413
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->progress:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 415
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private doOrder()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1254
a=0;//     const-string v0, "\u6e29\u99a8\u63d0\u793a\uff0c\u6b63\u5728\u8ba2\u9605\u4e2d..."
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->progress:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 1255
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/Readbook$9;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/Readbook$9;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/Readbook$9;-><init>(Lcom/twocloo/com/cn/activitys/Readbook;)V
a=0;// 
a=0;//     .line 1308
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$9;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/Readbook$9;->start()V
a=0;// 
a=0;//     .line 1309
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private downbook()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 1028
a=0;//     #v9=(Null);
a=0;//     const-string v6, "0"
a=0;// 
a=0;//     .line 1029
a=0;//     .local v6, "uid":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 1030
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1032
a=0;//     :cond_0
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookBF1(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 1033
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->showDL()V
a=0;// 
a=0;//     .line 1053
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1035
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Boolean);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 1036
a=0;//     .local v1, "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 1037
a=0;//     const-string v7, "\u8fdb\u5165\u540e\u53f0\u4e0b\u8f7d..."
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v7, v9}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1038
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/db/DBAdapter;->queryOneBook(Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 1039
a=0;//     .local v0, "bf":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/BFBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1040
a=0;//     .local v5, "title":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "book_text_"
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, ".txt"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1041
a=0;//     .local v4, "filename":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v8, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_BOOK:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "/"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v2, v7, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1042
a=0;//     .local v2, "dir":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 1045
a=0;//     sget-object v7, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Hashtable;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 1046
a=0;//     sget-object v7, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     check-cast v7, Lcom/twocloo/com/cn/http/DownFile;
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/http/DownFile;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1048
a=0;//     :cond_3
a=0;//     new-instance v3, Lcom/twocloo/com/cn/http/DownFile;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v3, p0, v7, v5}, Lcom/twocloo/com/cn/http/DownFile;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1049
a=0;//     .local v3, "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/http/DownFile;->start()V
a=0;// 
a=0;//     .line 1050
a=0;//     sget-object v7, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private existHC(Ljava/lang/String;I)Z
a=0;//     .locals 5
a=0;//     .param p1, "bkid"    # Ljava/lang/String;
a=0;//     .param p2, "code"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 764
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/HCData;->bookMap:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-virtual {v2, p1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 765
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/HCData;->bookMap:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-virtual {v2, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     .line 766
a=0;//     .local v1, "hbk":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_CACHE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 767
a=0;//     .local v0, "cacheFile":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 768
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getArticleId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "_"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ".txt"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/Readbook;->setFile(Ljava/io/File;)V
a=0;// 
a=0;//     .line 769
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 770
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->setRd(Lcom/twocloo/com/cn/beans/RDBook;)V
a=0;// 
a=0;//     .line 771
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/Readbook;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v2, p2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 772
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 775
a=0;//     .end local v0    # "cacheFile":Ljava/io/File;
a=0;//     .end local v1    # "hbk":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private hasBookMark()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 1475
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->sqmap:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getId()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     iget v3, v3, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-long v3, v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     add-long/2addr v1, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1476
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 1477
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getAnimationin2()Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 1484
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1479
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1480
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 1481
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getAnimationout3()Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private loadData()V
a=0;//     .locals 19
a=0;// 
a=0;//     .prologue
a=0;//     .line 713
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/http/ThreadPoolManager;->getInstance()Lcom/twocloo/com/cn/http/ThreadPoolManager;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 714
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/http/ThreadPoolManager;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/threads/GetTextThread;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook;->textid:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/16 v4, 0xc
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v5, v0, Lcom/twocloo/com/cn/activitys/Readbook;->isV:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/twocloo/com/cn/activitys/Readbook;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v7=(Reference,Landroid/os/Handler;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v8, v0, Lcom/twocloo/com/cn/activitys/Readbook;->autoOrder:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v9, v0, Lcom/twocloo/com/cn/activitys/Readbook;->readBookShareListener:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/common/ReadBookShareListener;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v10, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mulist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v10=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v6, p0
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-direct/range {v1 .. v10}, Lcom/twocloo/com/cn/threads/GetTextThread;-><init>(Ljava/lang/String;Ljava/lang/String;IILcom/twocloo/com/cn/activitys/Readbook;Landroid/os/Handler;ZLcom/twocloo/com/cn/common/ReadBookShareListener;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 713
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     invoke-virtual {v11, v1}, Lcom/twocloo/com/cn/http/ThreadPoolManager;->addTask(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 715
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 716
a=0;//     .local v3, "nextid":Ljava/lang/String;
a=0;//     #v3=(Null);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     .line 717
a=0;//     .local v16, "hasFind":Z
a=0;//     #v16=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 718
a=0;//     .local v5, "next_vip":I
a=0;//     #v5=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mulist:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 741
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/lang/String;);v4=(Conflicted);v5=(Integer);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Boolean);v17=(Conflicted);v18=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 721
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);v2=(Reference,Ljava/lang/String;);v3=(Null);v4=(PosByte);v5=(Null);v9=(Reference,Lcom/twocloo/com/cn/common/ReadBookShareListener;);v10=(Reference,Ljava/util/ArrayList;);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Null);v17=(Uninit);v18=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mulist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);v16=(Boolean);v17=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     .line 732
a=0;//     :goto_1
a=0;//     #v3=(Reference,Ljava/lang/String;);v5=(Integer);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 733
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/http/ThreadPoolManager;->getInstance()Lcom/twocloo/com/cn/http/ThreadPoolManager;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/threads/GetTextThread;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/16 v4, 0xc
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v8, v0, Lcom/twocloo/com/cn/activitys/Readbook;->autoOrder:Z
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v10, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mulist:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v6, p0
a=0;// 
a=0;//     invoke-direct/range {v1 .. v10}, Lcom/twocloo/com/cn/threads/GetTextThread;-><init>(Ljava/lang/String;Ljava/lang/String;IILcom/twocloo/com/cn/activitys/Readbook;Landroid/os/Handler;ZLcom/twocloo/com/cn/common/ReadBookShareListener;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     invoke-virtual {v11, v1}, Lcom/twocloo/com/cn/http/ThreadPoolManager;->addTask(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 736
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v4=(Conflicted);v7=(Reference,Landroid/os/Handler;);v9=(Reference,Lcom/twocloo/com/cn/common/ReadBookShareListener;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->textids:[Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 737
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->textids:[Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     array-length v4, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Integer);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v18=(Conflicted);
a=0;//     if-ge v1, v4, :cond_0
a=0;// 
a=0;//     aget-object v8, v2, v1
a=0;// 
a=0;//     .line 738
a=0;//     .local v8, "i":Ljava/lang/String;
a=0;//     #v8=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/http/ThreadPoolManager;->getInstance()Lcom/twocloo/com/cn/http/ThreadPoolManager;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     #v18=(Reference,Lcom/twocloo/com/cn/http/ThreadPoolManager;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/threads/GetTextThread;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     const/16 v9, 0xc
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v13, v0, Lcom/twocloo/com/cn/activitys/Readbook;->autoOrder:Z
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mulist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     move v10, v5
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     move-object/from16 v11, p0
a=0;// 
a=0;//     invoke-direct/range {v6 .. v15}, Lcom/twocloo/com/cn/threads/GetTextThread;-><init>(Ljava/lang/String;Ljava/lang/String;IILcom/twocloo/com/cn/activitys/Readbook;Landroid/os/Handler;ZLcom/twocloo/com/cn/common/ReadBookShareListener;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Lcom/twocloo/com/cn/http/ThreadPoolManager;->addTask(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 737
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 721
a=0;//     .end local v8    # "i":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Boolean);v3=(Null);v4=(Conflicted);v5=(Null);v8=(Boolean);v9=(Reference,Lcom/twocloo/com/cn/common/ReadBookShareListener;);v10=(Reference,Ljava/util/ArrayList;);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v18=(Uninit);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v17, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 722
a=0;//     .local v17, "info":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     if-eqz v16, :cond_5
a=0;// 
a=0;//     .line 723
a=0;//     invoke-virtual/range {v17 .. v17}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 724
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v17 .. v17}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getIs_vip()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 725
a=0;//     #v5=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 727
a=0;//     :cond_5
a=0;//     #v3=(Null);v5=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->textid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v17 .. v17}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 728
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     #v16=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private saveLastRead()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 1352
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 1353
a=0;//     new-instance v4, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     invoke-direct {v4}, Lcom/twocloo/com/cn/beans/Chapterinfo;-><init>()V
a=0;// 
a=0;//     .line 1354
a=0;//     .local v4, "tempChapterinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/Chapterinfo;->setId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1355
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook;->mulu:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v4}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1356
a=0;//     .local v2, "index":I
a=0;//     #v2=(Integer);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/db/LastReadTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 1357
a=0;//     .local v1, "db":Lcom/twocloo/com/cn/db/LastReadTable;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/LastReadTable;->open()V
a=0;// 
a=0;//     .line 1358
a=0;//     new-instance v3, Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-direct {v3}, Lcom/twocloo/com/cn/beans/RDBook;-><init>()V
a=0;// 
a=0;//     .line 1359
a=0;//     .local v3, "lastBook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Lcom/twocloo/com/cn/beans/RDBook;->setTextId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1360
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Lcom/twocloo/com/cn/beans/RDBook;->setArticleId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1361
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook;->mulu:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Lcom/twocloo/com/cn/beans/RDBook;->setBookName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1362
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget v6, v6, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v3, v6}, Lcom/twocloo/com/cn/beans/RDBook;->setPosi(I)V
a=0;// 
a=0;//     .line 1363
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/activitys/Readbook;->isV:I
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Lcom/twocloo/com/cn/beans/RDBook;->setIsVip(I)V
a=0;// 
a=0;//     .line 1364
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v3, v6}, Lcom/twocloo/com/cn/beans/RDBook;->setIsOL(I)V
a=0;// 
a=0;//     .line 1365
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook;->mulu:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v6, v2
a=0;// 
a=0;//     add-int/lit8 v6, v6, -0x1
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Lcom/twocloo/com/cn/beans/RDBook;->setIndex_(I)V
a=0;// 
a=0;//     .line 1366
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/db/LastReadTable;->insertLastRead(Lcom/twocloo/com/cn/beans/RDBook;)J
a=0;// 
a=0;//     .line 1367
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/LastReadTable;->close()V
a=0;// 
a=0;//     .line 1368
a=0;//     sget-object v6, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/Vector;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     sget-object v6, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_0
a=0;// 
a=0;//     .line 1369
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/BFBook;-><init>()V
a=0;// 
a=0;//     .line 1370
a=0;//     .local v0, "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6}, Lcom/twocloo/com/cn/beans/BFBook;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1371
a=0;//     sget-object v6, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/util/Vector;->indexOf(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1372
a=0;//     .local v5, "temp_index":I
a=0;//     #v5=(Integer);
a=0;//     if-ltz v5, :cond_0
a=0;// 
a=0;//     .line 1373
a=0;//     sget-object v6, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v6, v5}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     check-cast v6, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/Readbook;->mulu:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sub-int/2addr v8, v2
a=0;// 
a=0;//     add-int/lit8 v8, v8, -0x1
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "\u7ae0\u672a\u8bfb"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setLastIndex(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1377
a=0;//     .end local v0    # "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .end local v1    # "db":Lcom/twocloo/com/cn/db/LastReadTable;
a=0;//     .end local v2    # "index":I
a=0;//     .end local v3    # "lastBook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .end local v4    # "tempChapterinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     .end local v5    # "temp_index":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private showDL()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 1404
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u559c\u6b22\u5c31\u52a0\u5165\u4e66\u67b6\u5427"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v4, "\u786e\u5b9a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "\u53d6\u6d88"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/activitys/Readbook$10;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/activitys/Readbook$10;);
a=0;//     invoke-direct {v6, p0}, Lcom/twocloo/com/cn/activitys/Readbook$10;-><init>(Lcom/twocloo/com/cn/activitys/Readbook;)V
a=0;// 
a=0;//     .line 1439
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$10;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/activitys/Readbook$11;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/activitys/Readbook$11;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/activitys/Readbook$11;-><init>(Lcom/twocloo/com/cn/activitys/Readbook;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$11;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 1404
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static/range {v0 .. v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 1448
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private vipView()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1192
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 1194
a=0;//     :cond_0
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 1195
a=0;//     .local v1, "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->open()V
a=0;// 
a=0;//     .line 1196
a=0;//     const-string v2, "0"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->queryRecordHistroy(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1197
a=0;//     .local v0, "recodeIds":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->close()V
a=0;// 
a=0;//     .line 1198
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1199
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/Readbook;->textid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 1200
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/Readbook;->textid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v2}, Lcom/twocloo/com/cn/activitys/Readbook;->buy(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1206
a=0;//     .end local v0    # "recodeIds":Ljava/lang/String;
a=0;//     .end local v1    # "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1204
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Ljava/lang/String;);v3=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->checkAutoOrder()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getFile()Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1451
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->file:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected getIntentParams(Landroid/content/Intent;)V
a=0;//     .locals 3
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 745
a=0;//     #v2=(Null);
a=0;//     const-string v0, "textid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->textid:Ljava/lang/String;
a=0;// 
a=0;//     .line 746
a=0;//     const-string v0, "textIds"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->textids:[Ljava/lang/String;
a=0;// 
a=0;//     .line 752
a=0;//     const-string v0, "Tag"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->intenttag:Ljava/lang/String;
a=0;// 
a=0;//     .line 753
a=0;//     const-string v0, "p"
a=0;// 
a=0;//     invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->p:I
a=0;// 
a=0;//     .line 754
a=0;//     const-string v0, "fcdVip"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->fcdVip:I
a=0;// 
a=0;//     .line 755
a=0;//     const-string v0, "beg"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->beg:I
a=0;// 
a=0;//     .line 756
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "isVip"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->isV:I
a=0;// 
a=0;//     .line 757
a=0;//     const-string v0, "aid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 758
a=0;//     const-string v0, "title"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->title:Ljava/lang/String;
a=0;// 
a=0;//     .line 759
a=0;//     const-string v0, "imgUrl"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->imgUrl:Ljava/lang/String;
a=0;// 
a=0;//     .line 760
a=0;//     const-string v0, "imgFile"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->imgFile:Ljava/lang/String;
a=0;// 
a=0;//     .line 761
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1459
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->rd:Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected goBfMLActivity()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1488
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 1489
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "aid"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1490
a=0;//     const-string v1, "nowtxid"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/Readbook;->textid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1491
a=0;//     const-string v1, "WEB"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/Readbook;->isFromWeb:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1492
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->p:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1493
a=0;//     const-string v1, "p"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/activitys/Readbook;->p:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/Readbook;->i:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1495
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v1, "imgFile"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/Readbook;->imgFile:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1497
a=0;//     const/16 v1, 0xde
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     .line 1498
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected handlerMessage(Landroid/os/Message;)V
a=0;//     .locals 24
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iget v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sparse-switch v1, :sswitch_data_0
a=0;// 
a=0;//     .line 408
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 125
a=0;//     :sswitch_0
a=0;//     #v0=(Reference,Landroid/os/Message;);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeDialog()V
a=0;// 
a=0;//     .line 129
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->textid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->buy(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 132
a=0;//     :sswitch_1
a=0;//     #v1=(Integer);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeDialog()V
a=0;// 
a=0;//     .line 133
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/PageWidget;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mCurPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mCurPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/twocloo/com/cn/view/PageWidget;->setBitmaps(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 134
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->readbookLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/RelativeLayout;->removeAllViews()V
a=0;// 
a=0;//     .line 135
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->readbookLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 138
a=0;//     :try_start_0
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 139
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/RDBook;->getTextTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/view/BookPageFactory;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 140
a=0;//     :cond_1
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3, v0}, Lcom/twocloo/com/cn/db/DBAdapter;->queryAllBookP(Ljava/lang/String;ILandroid/app/Activity;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->sqmap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 141
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v3, v0, Lcom/twocloo/com/cn/activitys/Readbook;->beg:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/twocloo/com/cn/view/BookPageFactory;->openbook(Ljava/io/File;I)V
a=0;// 
a=0;//     .line 142
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/BookPageFactory;->last()V
a=0;// 
a=0;//     .line 143
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->setJumpLis()V
a=0;// 
a=0;//     .line 144
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/twocloo/com/cn/db/DBAdapter;->updateSetBookLT(Ljava/lang/String;Landroid/app/Activity;)J
a=0;// 
a=0;//     .line 145
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->sqmap:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v3, v3, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 146
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 147
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getAnimationin2()Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 151
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mCurPageCanvas:Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/view/BookPageFactory;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 152
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mNextPageCanvas:Landroid/graphics/Canvas;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/view/BookPageFactory;->onDraw(Landroid/graphics/Canvas;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 157
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v15
a=0;// 
a=0;//     .line 158
a=0;//     .local v15, "e1":Ljava/io/IOException;
a=0;//     #v15=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v15}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .line 159
a=0;//     const-string v1, "\u83b7\u53d6\u7535\u5b50\u4e66\u6709\u9519"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->Toast(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 149
a=0;//     .end local v15    # "e1":Ljava/io/IOException;
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/lang/String;);v3=(Integer);v15=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 163
a=0;//     :sswitch_2
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeDialog()V
a=0;// 
a=0;//     .line 165
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/PageWidget;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mCurPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mCurPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/twocloo/com/cn/view/PageWidget;->setBitmaps(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 166
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->readbookLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/RelativeLayout;->removeAllViews()V
a=0;// 
a=0;//     .line 167
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->readbookLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 169
a=0;//     :try_start_2
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 170
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/RDBook;->getTextTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/view/BookPageFactory;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 171
a=0;//     :cond_3
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3, v0}, Lcom/twocloo/com/cn/db/DBAdapter;->queryAllBookP(Ljava/lang/String;ILandroid/app/Activity;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->sqmap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 173
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v3, v0, Lcom/twocloo/com/cn/activitys/Readbook;->beg:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/twocloo/com/cn/view/BookPageFactory;->openbook(Ljava/io/File;I)V
a=0;// 
a=0;//     .line 174
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->setJumpLis()V
a=0;// 
a=0;//     .line 175
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->beg:I
a=0;// 
a=0;//     .line 176
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/twocloo/com/cn/db/DBAdapter;->updateSetBookLT(Ljava/lang/String;Landroid/app/Activity;)J
a=0;// 
a=0;//     .line 177
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->sqmap:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v3, v3, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 178
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 179
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getAnimationin2()Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 183
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mCurPageCanvas:Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/view/BookPageFactory;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 184
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mNextPageCanvas:Landroid/graphics/Canvas;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/view/BookPageFactory;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 191
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->readBookShareListener:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/RDBook;->getTextTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/common/ReadBookShareListener;->setChapterName(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 193
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v15
a=0;// 
a=0;//     .line 194
a=0;//     .restart local v15    # "e1":Ljava/io/IOException;
a=0;//     #v15=(Reference,Ljava/io/IOException;);
a=0;//     const-string v1, "\u83b7\u53d6\u7535\u5b50\u4e66\u6709\u9519"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->Toast(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 195
a=0;//     invoke-virtual {v15}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v15}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 181
a=0;//     .end local v15    # "e1":Ljava/io/IOException;
a=0;//     :cond_4
a=0;//     :try_start_3
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/lang/String;);v3=(Integer);v15=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 199
a=0;//     :sswitch_3
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeDialog()V
a=0;// 
a=0;//     .line 200
a=0;//     const-string v1, "\u83b7\u53d6\u4e0d\u5230\u4fe1\u606f"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->Toast(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 203
a=0;//     :sswitch_4
a=0;//     #v1=(Integer);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeDialog()V
a=0;// 
a=0;//     .line 204
a=0;//     sget v1, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->Toast(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 207
a=0;//     :sswitch_5
a=0;//     #v1=(Integer);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeDialog()V
a=0;// 
a=0;//     .line 208
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->doOrder()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 212
a=0;//     :sswitch_6
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeDialog()V
a=0;// 
a=0;//     .line 213
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->readbookLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v1}, Landroid/widget/RelativeLayout;->removeAllViews()V
a=0;// 
a=0;//     .line 214
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 215
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->titleTx:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 216
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->btnBM:Landroid/widget/Button;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 217
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->titleTx:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->title:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 219
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->dia:Lcom/twocloo/com/cn/view/DialogView;
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     .line 220
a=0;//     :cond_5
a=0;//     sget v1, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->Toast(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 224
a=0;//     :cond_6
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getOrderMsg()Lcom/twocloo/com/cn/beans/OrderMsg;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/OrderMsg;->getText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     .line 225
a=0;//     .local v20, "tt":Ljava/lang/String;
a=0;//     #v20=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v20, :cond_0
a=0;// 
a=0;//     .line 227
a=0;//     :try_start_4
a=0;//     const-string v19, ""
a=0;// 
a=0;//     .line 228
a=0;//     .local v19, "title":Ljava/lang/String;
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getTextTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 229
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/RDBook;->getTextTitle()Ljava/lang/String;
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
a=0;//     const-string v2, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     .line 230
a=0;//     :cond_7
a=0;//     invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x32
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v1, v2, :cond_8
a=0;// 
a=0;//     .line 231
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/16 v3, 0x28
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u2026\u2026"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     .line 232
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\n\n\n\n\n"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     .line 233
a=0;//     new-instance v16, Ljava/io/File;
a=0;// 
a=0;//     #v16=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getCacheDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "temp"
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 234
a=0;//     .local v16, "ff":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);v16=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     .line 235
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 236
a=0;//     :cond_9
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     .line 237
a=0;//     new-instance v22, Ljava/io/DataOutputStream;
a=0;// 
a=0;//     #v22=(UninitRef,Ljava/io/DataOutputStream;);
a=0;//     new-instance v1, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/DataOutputStream;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 238
a=0;//     .local v22, "writer":Ljava/io/DataOutputStream;
a=0;//     #v0=(Reference,Ljava/io/DataOutputStream;);v22=(Reference,Ljava/io/DataOutputStream;);
a=0;//     const-string v1, "utf-8"
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->write([B)V
a=0;// 
a=0;//     .line 239
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/io/DataOutputStream;->flush()V
a=0;// 
a=0;//     .line 240
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/io/DataOutputStream;->close()V
a=0;// 
a=0;//     .line 241
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->beg:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2, v3}, Lcom/twocloo/com/cn/view/BookPageFactory;->openbook(Ljava/io/File;IZ)V
a=0;// 
a=0;//     .line 242
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->setJumpLis()V
a=0;// 
a=0;//     .line 243
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->beg:I
a=0;// 
a=0;//     .line 244
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->refresh()V
a=0;// 
a=0;//     .line 245
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->readbookLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v1}, Landroid/widget/RelativeLayout;->removeAllViews()V
a=0;// 
a=0;//     .line 246
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->readbookLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/PageWidget;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 248
a=0;//     .end local v16    # "ff":Ljava/io/File;
a=0;//     .end local v19    # "title":Ljava/lang/String;
a=0;//     .end local v22    # "writer":Ljava/io/DataOutputStream;
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v16=(Conflicted);v19=(Conflicted);v22=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 253
a=0;//     .end local v20    # "tt":Ljava/lang/String;
a=0;//     :sswitch_7
a=0;//     #v0=(Reference,Landroid/os/Message;);v1=(Integer);v2=(Uninit);v3=(Uninit);v16=(Uninit);v19=(Uninit);v20=(Uninit);v22=(Uninit);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeProgress()V
a=0;// 
a=0;//     .line 254
a=0;//     const-string v1, "\u8ba2\u9605\u51fa\u9519"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->Toast(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 257
a=0;//     :sswitch_8
a=0;//     #v1=(Integer);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeDialog()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 260
a=0;//     :sswitch_9
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->showly3:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 262
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeProgress()V
a=0;// 
a=0;//     .line 264
a=0;//     const-string v1, "\u8ba2\u9605\u6210\u529f"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->Toast(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 266
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/common/LocalStore;->getFirstConsume(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_b
a=0;// 
a=0;//     .line 268
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/common/LocalStore;->getLastLoginType(Landroid/content/Context;)Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 269
a=0;//     .local v17, "loginType":Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;//     #v17=(Reference,Lcom/twocloo/com/cn/common/Constants$LoginType;);
a=0;//     sget-object v1, Lcom/twocloo/com/cn/common/Constants$LoginType;->def:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/common/Constants$LoginType;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/twocloo/com/cn/common/Constants$LoginType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_b
a=0;// 
a=0;//     .line 271
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .line 272
a=0;//     .local v13, "bookName":Ljava/lang/String;
a=0;//     #v13=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mulu:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     if-eqz v1, :cond_11
a=0;// 
a=0;//     .line 273
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mulu:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 280
a=0;//     :cond_a
a=0;//     :goto_3
a=0;//     #v2=(Conflicted);v12=(Conflicted);v13=(Reference,Ljava/lang/String;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$string;->book_vip_share_content:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v13, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 287
a=0;//     .local v18, "shareContent":Ljava/lang/String;
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setFirstConsume(Landroid/content/Context;Z)V
a=0;// 
a=0;//     .line 290
a=0;//     .end local v13    # "bookName":Ljava/lang/String;
a=0;//     .end local v17    # "loginType":Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;//     .end local v18    # "shareContent":Ljava/lang/String;
a=0;//     :cond_b
a=0;//     #v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v13=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->checkBox:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/CheckBox;);
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->checkBox:Landroid/widget/CheckBox;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     .line 291
a=0;//     new-instance v10, Lcom/twocloo/com/cn/db/AutoOrderTable;
a=0;// 
a=0;//     #v10=(UninitRef,Lcom/twocloo/com/cn/db/AutoOrderTable;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v10, v0}, Lcom/twocloo/com/cn/db/AutoOrderTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 292
a=0;//     .local v10, "autoOrderTable":Lcom/twocloo/com/cn/db/AutoOrderTable;
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/db/AutoOrderTable;);
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/db/AutoOrderTable;->open()V
a=0;// 
a=0;//     .line 293
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v1}, Lcom/twocloo/com/cn/db/AutoOrderTable;->insertAutoOrder(Ljava/lang/String;)J
a=0;// 
a=0;//     .line 294
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/db/AutoOrderTable;->close()V
a=0;// 
a=0;//     .line 295
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->autoOrder:Z
a=0;// 
a=0;//     .line 297
a=0;//     .end local v10    # "autoOrderTable":Lcom/twocloo/com/cn/db/AutoOrderTable;
a=0;//     :cond_c
a=0;//     #v1=(Conflicted);v10=(Conflicted);
a=0;//     const-string v21, "0"
a=0;// 
a=0;//     .line 298
a=0;//     .local v21, "uidd":Ljava/lang/String;
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v1, :cond_d
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_d
a=0;// 
a=0;//     .line 299
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     .line 302
a=0;//     :cond_d
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookBF1(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_e
a=0;// 
a=0;//     .line 303
a=0;//     new-instance v11, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v11=(UninitRef,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-direct {v11}, Lcom/twocloo/com/cn/beans/BFBook;-><init>()V
a=0;// 
a=0;//     .line 304
a=0;//     .local v11, "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->imgUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_12
a=0;// 
a=0;//     .line 306
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->imgUrl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v11, v1}, Lcom/twocloo/com/cn/beans/BFBook;->setImgFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 310
a=0;//     :goto_4
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v11, v0}, Lcom/twocloo/com/cn/beans/BFBook;->setUid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 311
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->title:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v11, v1}, Lcom/twocloo/com/cn/beans/BFBook;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 312
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v11, v1}, Lcom/twocloo/com/cn/beans/BFBook;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 313
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getFinishflag()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v11, v1}, Lcom/twocloo/com/cn/beans/BFBook;->setFinishFlag(I)V
a=0;// 
a=0;//     .line 314
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->isFromWeb:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v1}, Lcom/twocloo/com/cn/beans/BFBook;->setIsFromWeb(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 315
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v1, v11}, Lcom/twocloo/com/cn/db/DBAdapter;->insertBook(Lcom/twocloo/com/cn/beans/BFBook;)Ljava/lang/String;
a=0;// 
a=0;//     .line 316
a=0;//     new-instance v14, Lcom/twocloo/com/cn/http/DownFile;
a=0;// 
a=0;//     #v14=(UninitRef,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->title:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v14, v0, v1, v2}, Lcom/twocloo/com/cn/http/DownFile;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 317
a=0;//     .local v14, "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     #v14=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     invoke-virtual {v14}, Lcom/twocloo/com/cn/http/DownFile;->start()V
a=0;// 
a=0;//     .line 318
a=0;//     sget-object v1, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v14}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 326
a=0;//     .end local v11    # "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .end local v14    # "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     :cond_e
a=0;//     #v1=(Conflicted);v11=(Conflicted);v14=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookGxVip(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_f
a=0;// 
a=0;//     .line 327
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0, v3}, Lcom/twocloo/com/cn/db/DBAdapter;->insertGx(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 330
a=0;//     :cond_f
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookGx(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_10
a=0;// 
a=0;//     .line 331
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0, v3}, Lcom/twocloo/com/cn/db/DBAdapter;->insertGx(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 334
a=0;//     :cond_10
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->titleTx:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 335
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->btnBM:Landroid/widget/Button;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 336
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 337
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->showly1:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 338
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->showly2:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 339
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->yy3:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 340
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->mWaitDg:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 341
a=0;//     new-instance v23, Ljava/lang/Thread;
a=0;// 
a=0;//     #v23=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/threads/GetTextThread;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook;->textid:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/16 v4, 0xc
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v5, v0, Lcom/twocloo/com/cn/activitys/Readbook;->isV:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/twocloo/com/cn/activitys/Readbook;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v7=(Reference,Landroid/os/Handler;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v8, v0, Lcom/twocloo/com/cn/activitys/Readbook;->autoOrder:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v9, v0, Lcom/twocloo/com/cn/activitys/Readbook;->readBookShareListener:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/common/ReadBookShareListener;);
a=0;//     move-object/from16 v6, p0
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-direct/range {v1 .. v9}, Lcom/twocloo/com/cn/threads/GetTextThread;-><init>(Ljava/lang/String;Ljava/lang/String;IILcom/twocloo/com/cn/activitys/Readbook;Landroid/os/Handler;ZLcom/twocloo/com/cn/common/ReadBookShareListener;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);v23=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual/range {v23 .. v23}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 275
a=0;//     .end local v21    # "uidd":Ljava/lang/String;
a=0;//     .restart local v13    # "bookName":Ljava/lang/String;
a=0;//     .restart local v17    # "loginType":Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;//     :cond_11
a=0;//     #v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Null);v14=(Uninit);v17=(Reference,Lcom/twocloo/com/cn/common/Constants$LoginType;);v18=(Uninit);v21=(Uninit);v23=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloo/com/cn/http/HttpImpl;->Shubenxinxiye(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 276
a=0;//     .local v12, "bookDetail":Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;//     #v12=(Reference,Lcom/twocloo/com/cn/beans/Shubenxinxiye;);
a=0;//     if-eqz v12, :cond_a
a=0;// 
a=0;//     .line 277
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 308
a=0;//     .end local v12    # "bookDetail":Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;//     .end local v13    # "bookName":Ljava/lang/String;
a=0;//     .end local v17    # "loginType":Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;//     .restart local v11    # "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .restart local v21    # "uidd":Ljava/lang/String;
a=0;//     :cond_12
a=0;//     #v3=(Conflicted);v10=(Conflicted);v11=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);v12=(Conflicted);v13=(Conflicted);v17=(Conflicted);v18=(Conflicted);v21=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->imgFile:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v11, v1}, Lcom/twocloo/com/cn/beans/BFBook;->setImgFile(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 344
a=0;//     .end local v11    # "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .end local v21    # "uidd":Ljava/lang/String;
a=0;//     :sswitch_a
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v17=(Uninit);v18=(Uninit);v21=(Uninit);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeProgress()V
a=0;// 
a=0;//     .line 345
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->showly1:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 346
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->showly2:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 347
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->yy3:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 354
a=0;//     :sswitch_b
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeProgress()V
a=0;// 
a=0;//     .line 355
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->showly1:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 356
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->showly2:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 357
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->yy3:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 364
a=0;//     :sswitch_c
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeProgress()V
a=0;// 
a=0;//     .line 365
a=0;//     const-string v1, "\u83b7\u53d6\u7ae0\u8282\u4fe1\u606f\u51fa\u9519"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->Toast(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 368
a=0;//     :sswitch_d
a=0;//     #v1=(Integer);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeProgress()V
a=0;// 
a=0;//     .line 369
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeDialog()V
a=0;// 
a=0;//     .line 370
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 371
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->titleTx:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 372
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->btnBM:Landroid/widget/Button;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 374
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook;->yy3:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 377
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->vipView()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 382
a=0;//     :sswitch_e
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeProgress()V
a=0;// 
a=0;//     .line 384
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u60a8\u7684\u9605\u8bfb\u5e01\u4e0d\u8db3\uff0c\u8bf7\u5145\u503c\u9605\u8bfb\u5e01\u3002"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/activitys/Readbook$1;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/activitys/Readbook$1;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v3, v0}, Lcom/twocloo/com/cn/activitys/Readbook$1;-><init>(Lcom/twocloo/com/cn/activitys/Readbook;)V
a=0;// 
a=0;//     .line 392
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$1;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 384
a=0;//     #v4=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v1, v2, v3, v4}, Lcom/twocloo/base/util/ViewUtils;->confirm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 395
a=0;//     :sswitch_f
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeProgress()V
a=0;// 
a=0;//     .line 396
a=0;//     const-string v1, "\u5df2\u8ba2\u9605"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->Toast(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 399
a=0;//     :sswitch_10
a=0;//     #v1=(Integer);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeProgress()V
a=0;// 
a=0;//     .line 400
a=0;//     const-string v1, "\u8ba2\u9605\u51fa\u9519\uff0c\u975e\u6cd5\u7ed3\u679c"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->Toast(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 403
a=0;//     :sswitch_11
a=0;//     #v1=(Integer);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeProgress()V
a=0;// 
a=0;//     .line 404
a=0;//     const-string v1, "\u8ba2\u9605\u51fa\u9519\uff0c\u5176\u5b83\u9519\u8bef"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->Toast(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 123
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);v18=(Unknown);v19=(Unknown);v20=(Unknown);v21=(Unknown);v22=(Unknown);v23=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0xb -> :sswitch_1
a=0;//         0xc -> :sswitch_2
a=0;//         0xd -> :sswitch_3
a=0;//         0xe -> :sswitch_4
a=0;//         0x14 -> :sswitch_5
a=0;//         0x15 -> :sswitch_6
a=0;//         0x16 -> :sswitch_7
a=0;//         0x17 -> :sswitch_9
a=0;//         0x1f -> :sswitch_a
a=0;//         0x20 -> :sswitch_c
a=0;//         0x21 -> :sswitch_b
a=0;//         0x29 -> :sswitch_d
a=0;//         0x2a -> :sswitch_e
a=0;//         0x2b -> :sswitch_f
a=0;//         0x2c -> :sswitch_10
a=0;//         0x2d -> :sswitch_11
a=0;//         0x36 -> :sswitch_8
a=0;//         0x6f -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 11
a=0;//     .param p1, "requestCode"    # I
a=0;//     .param p2, "resultCode"    # I
a=0;//     .param p3, "data"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1178
a=0;//     invoke-super {p0, p1, p2, p3}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     .line 1179
a=0;//     const/16 v0, 0x3e8
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 1180
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne p2, v0, :cond_0
a=0;// 
a=0;//     .line 1181
a=0;//     const-string v0, "textIds"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 1183
a=0;//     .local v9, "textids":[Ljava/lang/String;
a=0;//     #v9=(Reference,[Ljava/lang/String;);
a=0;//     new-instance v10, Ljava/lang/Thread;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/GetTextThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/Readbook;->textid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/16 v3, 0xc
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/activitys/Readbook;->isV:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v6=(Reference,Landroid/os/Handler;);
a=0;//     iget-boolean v7, p0, Lcom/twocloo/com/cn/activitys/Readbook;->autoOrder:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/Readbook;->readBookShareListener:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/common/ReadBookShareListener;);
a=0;//     move-object v5, p0
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-direct/range {v0 .. v8}, Lcom/twocloo/com/cn/threads/GetTextThread;-><init>(Ljava/lang/String;Ljava/lang/String;IILcom/twocloo/com/cn/activitys/Readbook;Landroid/os/Handler;ZLcom/twocloo/com/cn/common/ReadBookShareListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     invoke-direct {v10, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v10}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 1187
a=0;//     .end local v9    # "textids":[Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 9
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 940
a=0;//     #v3=(One);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->btnReadTextSizedecrease:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 942
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/LocalStore;->getFontsize(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 943
a=0;//     .local v8, "v1":I
a=0;//     #v8=(Integer);
a=0;//     if-nez v8, :cond_1
a=0;// 
a=0;//     .line 944
a=0;//     const-string v0, "\u6700\u5c0f\u5b57\u4f53\u4e86\uff01"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/Readbook;->Toast(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 945
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->btnReadTextSizedecrease:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 946
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->btnReadTextSizeplus:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 1022
a=0;//     .end local v8    # "v1":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Integer);v4=(Reference,Ljava/lang/String;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 949
a=0;//     .restart local v8    # "v1":I
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/Context;);v1=(Integer);v2=(Uninit);v3=(One);v4=(Null);v5=(PosByte);v6=(Uninit);v7=(Uninit);v8=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->btnReadTextSizeplus:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 950
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->btnReadTextSizedecrease:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 951
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->readTextsizeseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     add-int/lit8 v1, v8, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V
a=0;// 
a=0;//     .line 952
a=0;//     add-int/lit8 v0, v8, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/common/LocalStore;->setFontsize(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 953
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getFontsize(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/BookPageFactory;->setFontSize(I)V
a=0;// 
a=0;//     .line 954
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->refresh()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 955
a=0;//     .end local v8    # "v1":I
a=0;//     :cond_2
a=0;//     #v0=(Integer);v8=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->btnReadTextSizeplus:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     .line 956
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/LocalStore;->getFontsize(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 957
a=0;//     .restart local v8    # "v1":I
a=0;//     #v8=(Integer);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v8, v0, :cond_3
a=0;// 
a=0;//     .line 958
a=0;//     const-string v0, "\u6700\u5927\u5b57\u4f53\u4e86\uff01"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/Readbook;->Toast(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 959
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->btnReadTextSizeplus:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 960
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->btnReadTextSizedecrease:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 963
a=0;//     :cond_3
a=0;//     #v0=(PosByte);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->btnReadTextSizeplus:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 964
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->btnReadTextSizedecrease:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 965
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->readTextsizeseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     add-int/lit8 v1, v8, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V
a=0;// 
a=0;//     .line 966
a=0;//     add-int/lit8 v0, v8, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/common/LocalStore;->setFontsize(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 967
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     add-int/lit8 v1, v8, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/BookPageFactory;->setFontSize(I)V
a=0;// 
a=0;//     .line 968
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->refresh()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 969
a=0;//     .end local v8    # "v1":I
a=0;//     :cond_4
a=0;//     #v0=(Integer);v8=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->iv_back:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v1}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_5
a=0;// 
a=0;//     .line 970
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->addBookShelfWhenReadCountEnough()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 972
a=0;//     :cond_5
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v1}, Landroid/widget/ImageView;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_6
a=0;// 
a=0;//     .line 973
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getArticleId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     iget v3, v3, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/twocloo/com/cn/db/DBAdapter;->deleteOneMarkaid(Ljava/lang/String;Ljava/lang/String;I)J
a=0;// 
a=0;//     .line 974
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4, p0}, Lcom/twocloo/com/cn/db/DBAdapter;->queryAllBookP(Ljava/lang/String;ILandroid/app/Activity;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->sqmap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 975
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 976
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getAnimationout3()Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 977
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->refresh()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 978
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(One);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->btnBM:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_8
a=0;// 
a=0;//     .line 979
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v5, :cond_7
a=0;// 
a=0;//     .line 980
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->addMk()V
a=0;// 
a=0;//     .line 981
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v4, p0}, Lcom/twocloo/com/cn/db/DBAdapter;->queryAllBookP(Ljava/lang/String;ILandroid/app/Activity;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->sqmap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 982
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 983
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getAnimationin2()Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 990
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->refresh()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 985
a=0;//     :cond_7
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(One);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getArticleId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     iget v3, v3, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/twocloo/com/cn/db/DBAdapter;->deleteOneMarkaid(Ljava/lang/String;Ljava/lang/String;I)J
a=0;// 
a=0;//     .line 986
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4, p0}, Lcom/twocloo/com/cn/db/DBAdapter;->queryAllBookP(Ljava/lang/String;ILandroid/app/Activity;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->sqmap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 987
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 988
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getAnimationout3()Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 991
a=0;//     :cond_8
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(One);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->downAlllayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 992
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->doGone()V
a=0;// 
a=0;//     .line 993
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
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     .line 994
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getResources()Landroid/content/res/Resources;
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
a=0;//     invoke-static {p0, v0, v4}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 998
a=0;//     :cond_9
a=0;//     #v0=(Boolean);v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     const-string v0, "WIFI"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/CommonUtils;->getCurrentNetType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_b
a=0;// 
a=0;//     .line 999
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/LocalStore;->getisWifiAlarm(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v3, :cond_a
a=0;// 
a=0;//     .line 1000
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     const-string v2, "\u5f53\u524d\u662f\u975ewifi\u7f51\u7edc\uff0c\u662f\u5426\u4e0b\u8f7d"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "\u662f"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "\u5426"
a=0;// 
a=0;//     .line 1001
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/activitys/Readbook$6;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/activitys/Readbook$6;);
a=0;//     invoke-direct {v6, p0}, Lcom/twocloo/com/cn/activitys/Readbook$6;-><init>(Lcom/twocloo/com/cn/activitys/Readbook;)V
a=0;// 
a=0;//     .line 1008
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$6;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/activitys/Readbook$7;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/activitys/Readbook$7;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/activitys/Readbook$7;-><init>(Lcom/twocloo/com/cn/activitys/Readbook;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$7;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 1000
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static/range {v0 .. v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->netTypedialog:Landroid/app/Dialog;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1016
a=0;//     :cond_a
a=0;//     #v0=(Integer);v2=(Uninit);v4=(Null);v5=(PosByte);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->downbook()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1019
a=0;//     :cond_b
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->downbook()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 428
a=0;//     #v2=(Null);
a=0;//     invoke-super {p0, p1}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 672
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->addAd()V
a=0;// 
a=0;//     .line 429
a=0;//     new-instance v0, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     .line 430
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 431
a=0;//     sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     const-string v1, "\u5728\u7ebf\u8bfbreadbook"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 432
a=0;//     const-class v0, Lcom/twocloo/com/cn/db/orm/OrmDBHelper;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/base/db/orm/DBHelper;->getHelper(Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloo/com/cn/db/orm/OrmDBHelper;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbHelper:Lcom/twocloo/com/cn/db/orm/OrmDBHelper;
a=0;// 
a=0;//     .line 434
a=0;//     new-instance v0, Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/common/ReadBookShareListener;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/common/ReadBookShareListener;-><init>(Lcom/twocloo/base/openapi/QZoneAble;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/ReadBookShareListener;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->readBookShareListener:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     .line 435
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->readBookShareListener:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/common/ReadBookShareListener;->setAId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 436
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->readBookShareListener:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->title:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/common/ReadBookShareListener;->setChapterName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 438
a=0;//     const-string v0, "BookMarkActivity"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->intenttag:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 439
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 442
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "isOnline"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->isOnlineread:Z
a=0;// 
a=0;//     .line 444
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->hasBookMark()V
a=0;// 
a=0;//     .line 445
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/PageWidget;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/Readbook$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/Readbook$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/Readbook$2;-><init>(Lcom/twocloo/com/cn/activitys/Readbook;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$2;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/PageWidget;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
a=0;// 
a=0;//     .line 668
a=0;//     invoke-static {p0}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->mWaitDg:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 669
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/Util;->read(Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->mulu:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     .line 670
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->mulu:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 671
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->mulu:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->mulist:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 672
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->loadData()V
a=0;//
a=0;// 
a=0;//     .line 675
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1380
a=0;//     invoke-super {p0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->onDestroy()V
a=0;// 
a=0;//     .line 1381
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1382
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     .line 1383
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     .line 1385
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1389
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 1390
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->addBookShelfWhenReadCountEnough()V
a=0;// 
a=0;//     .line 1391
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1393
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-super {p0, p1, p2}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onNewIntent(Landroid/content/Intent;)V
a=0;//     .locals 0
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1468
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->closeDialog()V
a=0;// 
a=0;//     .line 1469
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/activitys/Readbook;->setIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 1470
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/activitys/Readbook;->getIntentParams(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 1471
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->loadData()V
a=0;// 
a=0;//     .line 1472
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 679
a=0;//     invoke-super {p0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->onPause()V
a=0;// 
a=0;//     .line 681
a=0;//     iget-boolean v5, p0, Lcom/twocloo/com/cn/activitys/Readbook;->isOnlineread:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 682
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/Readbook;->saveLastRead()V
a=0;// 
a=0;//     .line 707
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 685
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Boolean);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     invoke-direct {v4, p0}, Lcom/twocloo/com/cn/db/LastReadTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 686
a=0;//     .local v4, "rd":Lcom/twocloo/com/cn/db/LastReadTable;
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/db/LastReadTable;->open()V
a=0;// 
a=0;//     .line 687
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Lcom/twocloo/com/cn/db/LastReadTable;->remove(Ljava/lang/String;)J
a=0;// 
a=0;//     .line 688
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/db/LastReadTable;->close()V
a=0;// 
a=0;//     .line 691
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v5, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_DATA_ROOT:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 692
a=0;//     .local v0, "dirFile":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "downBook/"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v1, v0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 693
a=0;//     .local v1, "downbookFile":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     .line 694
a=0;//     invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 696
a=0;//     :cond_2
a=0;//     invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 697
a=0;//     .local v3, "files":[Ljava/io/File;
a=0;//     #v3=(Reference,[Ljava/io/File;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 698
a=0;//     array-length v6, v3
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v5=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v5, v6, :cond_0
a=0;// 
a=0;//     aget-object v2, v3, v5
a=0;// 
a=0;//     .line 699
a=0;//     .local v2, "f":Ljava/io/File;
a=0;//     #v2=(Null);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 700
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "book"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "obj"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     .line 701
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/FileUtils;->deleteFiles(Ljava/io/File;)V
a=0;// 
a=0;//     .line 698
a=0;//     :cond_3
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0xc
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 1318
a=0;//     #v11=(Null);
a=0;//     invoke-super {p0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->onResume()V
a=0;// 
a=0;//     .line 1319
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1320
a=0;//     new-instance v0, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     .line 1321
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 1323
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v11, p0}, Lcom/twocloo/com/cn/db/DBAdapter;->queryAllBookP(Ljava/lang/String;ILandroid/app/Activity;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->sqmap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 1324
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1325
a=0;//     new-instance v9, Lcom/twocloo/com/cn/db/AutoOrderTable;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/twocloo/com/cn/db/AutoOrderTable;);
a=0;//     invoke-direct {v9, p0}, Lcom/twocloo/com/cn/db/AutoOrderTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 1326
a=0;//     .local v9, "autoOrderTable":Lcom/twocloo/com/cn/db/AutoOrderTable;
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/db/AutoOrderTable;);
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/db/AutoOrderTable;->open()V
a=0;// 
a=0;//     .line 1327
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v0}, Lcom/twocloo/com/cn/db/AutoOrderTable;->exist(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->autoOrder:Z
a=0;// 
a=0;//     .line 1328
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/db/AutoOrderTable;->close()V
a=0;// 
a=0;//     .line 1330
a=0;//     .end local v9    # "autoOrderTable":Lcom/twocloo/com/cn/db/AutoOrderTable;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v9=(Conflicted);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->flagFlash:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 1331
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->textid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->existHC(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 1332
a=0;//     invoke-static {p0}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->mWaitDg:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 1333
a=0;//     new-instance v10, Ljava/lang/Thread;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/GetTextThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/Readbook;->textid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/activitys/Readbook;->isV:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v6=(Reference,Landroid/os/Handler;);
a=0;//     iget-boolean v7, p0, Lcom/twocloo/com/cn/activitys/Readbook;->autoOrder:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/Readbook;->readBookShareListener:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/common/ReadBookShareListener;);
a=0;//     move-object v5, p0
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-direct/range {v0 .. v8}, Lcom/twocloo/com/cn/threads/GetTextThread;-><init>(Ljava/lang/String;Ljava/lang/String;IILcom/twocloo/com/cn/activitys/Readbook;Landroid/os/Handler;ZLcom/twocloo/com/cn/common/ReadBookShareListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     invoke-direct {v10, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v10}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 1334
a=0;//     iput v11, p0, Lcom/twocloo/com/cn/activitys/Readbook;->flagFlash:I
a=0;// 
a=0;//     .line 1337
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 1338
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getLastUid(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBF1(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->exist:Z
a=0;// 
a=0;//     .line 1341
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 1342
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->autoOrderlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 1345
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1344
a=0;//     :cond_4
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->autoOrderlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v11}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onStart()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1313
a=0;//     invoke-super {p0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->onStart()V
a=0;// 
a=0;//     .line 1315
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFile(Ljava/io/File;)V
a=0;//     .locals 0
a=0;//     .param p1, "file"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1455
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->file:Ljava/io/File;
a=0;// 
a=0;//     .line 1456
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setJumpLis()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 779
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SeekBar;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 780
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/Readbook$3;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/Readbook$3;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/Readbook$3;-><init>(Lcom/twocloo/com/cn/activitys/Readbook;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$3;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V
a=0;// 
a=0;//     .line 804
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->btnReadjp1:Landroid/widget/Button;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 805
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->btnReadjp1:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/Readbook$4;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/Readbook$4;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/Readbook$4;-><init>(Lcom/twocloo/com/cn/activitys/Readbook;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$4;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 820
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->btnReadjp2:Landroid/widget/Button;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 821
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook;->btnReadjp2:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/Readbook$5;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/Readbook$5;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/Readbook$5;-><init>(Lcom/twocloo/com/cn/activitys/Readbook;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$5;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 836
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRd(Lcom/twocloo/com/cn/beans/RDBook;)V
a=0;//     .locals 0
a=0;//     .param p1, "rd"    # Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1463
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/Readbook;->rd:Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     .line 1464
a=0;//     return-void
a=0;// .end method
a=0;//
a=0;// .method public addChaping()V
a=0;//    .registers 6
a=0;//
a=0;//    .prologue
a=0;//    .line 43
a=0;//    invoke-static {p0}, Lnet/youmi/android/spot/SpotManager;->getInstance(Landroid/content/Context;)Lnet/youmi/android/spot/SpotManager;
a=0;//
a=0;//    move-result-object v0
a=0;//
a=0;//    invoke-virtual {v0}, Lnet/youmi/android/spot/SpotManager;->loadSpotAds()V
a=0;//
a=0;//    .line 44
a=0;//    invoke-static {p0}, Lnet/youmi/android/spot/SpotManager;->getInstance(Landroid/content/Context;)Lnet/youmi/android/spot/SpotManager;
a=0;//
a=0;//    move-result-object v0
a=0;//
a=0;//    const/4 v1, 0x1
a=0;//
a=0;//    invoke-virtual {v0, v1}, Lnet/youmi/android/spot/SpotManager;->setSpotOrientation(I)V
a=0;//
a=0;//    .line 46
a=0;//    invoke-static {p0}, Lnet/youmi/android/spot/SpotManager;->getInstance(Landroid/content/Context;)Lnet/youmi/android/spot/SpotManager;
a=0;//
a=0;//    move-result-object v0
a=0;//
a=0;//    invoke-virtual {v0, p0}, Lnet/youmi/android/spot/SpotManager;->showSpotAds(Landroid/content/Context;)V
a=0;//    const-string v4, "readbook"
a=0;//
a=0;//    const-string v5, "loading chaping over"
a=0;//
a=0;//    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;//    .line 47
a=0;//    return-void
a=0;//.end method
a=0;//.method public addAd()V
a=0;//    .registers 7
a=0;//
a=0;//    .prologue
a=0;//    .line 34
a=0;//    new-instance v1, Lnet/youmi/android/banner/AdView;
a=0;//
a=0;//    sget-object v2, Lnet/youmi/android/banner/AdSize;->SIZE_320x50:Lnet/youmi/android/banner/AdSize;
a=0;//    invoke-direct {v1, p0, v2}, Lnet/youmi/android/banner/AdView;-><init>(Landroid/content/Context;Lnet/youmi/android/banner/AdSize;)V
a=0;//
a=0;//    .line 36
a=0;//    .local v1, "adLayout_readbook":Lnet/youmi/android/banner/AdView;
a=0;//    const v2, 0x7f0501df
a=0;//
a=0;//    invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/Readbook;->findViewById(I)Landroid/view/View;
a=0;//
a=0;//    move-result-object v0
a=0;//
a=0;//    check-cast v0, Landroid/widget/RelativeLayout;
a=0;//
a=0;//    .line 38
a=0;//    .local v0, "adLayout":Landroid/widget/RelativeLayout;
a=0;//    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;//
a=0;//    const-string v4, "readbook"
a=0;//
a=0;//    const-string v5, "loading ad over"
a=0;//
a=0;//    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;//    .line 39
a=0;//   return-void
a=0;//.end method
}}
