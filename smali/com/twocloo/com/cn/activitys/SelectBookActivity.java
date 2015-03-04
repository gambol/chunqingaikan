package com.twocloo.com.cn.activitys; class SelectBookActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "SelectBookActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/GestureDetector$OnGestureListener;
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;// .field private dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private isDongfang:Z
a=0;// 
a=0;// .field private isDushi:Z
a=0;// 
a=0;// .field private isGudian:Z
a=0;// 
a=0;// .field private isKongbu:Z
a=0;// 
a=0;// .field private isQihuan:Z
a=0;// 
a=0;// .field private isXiandai:Z
a=0;// 
a=0;// .field private isXiangcun:Z
a=0;// 
a=0;// .field private isXifang:Z
a=0;// 
a=0;// .field private isYishi:Z
a=0;// 
a=0;// .field private kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private list:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mGestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;// .field private qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private sex:I
a=0;// 
a=0;// .field private tiaoguo:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// .field private xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private yueduzhilv:Landroid/widget/ImageView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 31
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 35
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/SelectBookActivity;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 36
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isDushi:Z
a=0;// 
a=0;//     .line 37
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isXiandai:Z
a=0;// 
a=0;//     .line 38
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isXiangcun:Z
a=0;// 
a=0;//     .line 39
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isGudian:Z
a=0;// 
a=0;//     .line 40
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isQihuan:Z
a=0;// 
a=0;//     .line 41
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isDongfang:Z
a=0;// 
a=0;//     .line 42
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isKongbu:Z
a=0;// 
a=0;//     .line 43
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isYishi:Z
a=0;// 
a=0;//     .line 44
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isXifang:Z
a=0;// 
a=0;//     .line 48
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     .line 49
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/SelectBookActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 31
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/SelectBookActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/SelectBookActivity;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/SelectBookActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private initbook()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 370
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/LocalStore;->getUserSex(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 371
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->dushiyineng2:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 372
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->xiandaixiuzhen2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 373
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->xiangcunxiaoshuo2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 374
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->gudianxianxia2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 375
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->qihuanxiuzhen2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 376
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->dongfangxuanhuan2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 377
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->kongbulingyi2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 378
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->yishidalu2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 379
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->xifangxuanhuan2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 394
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 382
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(One);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->zongcaihaomen2:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 383
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->gaoganyanqing2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 384
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->haomenmengbao2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 385
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->chongwennuvwen2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 386
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->gongdouzhaidou2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 387
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->chuanyuezhongtian2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 388
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->chuanyuechongshen2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 389
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->xuanhuannvqian2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 390
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->xianqingyanqing2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private initview()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->doushiyineng:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 106
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->xiandaixiuzhen:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 107
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->xiangcunxiaoshuo:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 108
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->gudianxianxia:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 109
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->qihuanxiuzhen:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 110
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->dongfangxuanhuan:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 111
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->kongbulingyi:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 112
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->xifangqihuan:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 113
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->yishidalu:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 114
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->tiaoguo:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->tiaoguo:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->tiaoguo:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 116
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->yueduzhilv:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->yueduzhilv:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->yueduzhilv:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 127
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 7
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 131
a=0;//     #v5=(One);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ImageView;);
a=0;//     if-ne p1, v3, :cond_4
a=0;// 
a=0;//     .line 133
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isDushi:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 134
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_1
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "10"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 136
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isDushi:Z
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->dushiyineng1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 367
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 139
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Integer);v4=(Uninit);v5=(One);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "1"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 140
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isDushi:Z
a=0;// 
a=0;//     .line 141
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->zongcaihaomen1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 145
a=0;//     :cond_2
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_3
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "10"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 147
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isDushi:Z
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->dushiyineng2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 150
a=0;//     :cond_3
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "1"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 151
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isDushi:Z
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->zongcaihaomen2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 156
a=0;//     :cond_4
a=0;//     #v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_8
a=0;// 
a=0;//     .line 157
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isXiandai:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     .line 158
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_5
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "11"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 160
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isXiandai:Z
a=0;// 
a=0;//     .line 161
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xiandaixiuzhen1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 163
a=0;//     :cond_5
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "2"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 164
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isXiandai:Z
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->gaoganyanqing1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 169
a=0;//     :cond_6
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_7
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "11"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 171
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isXiandai:Z
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xiandaixiuzhen2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 174
a=0;//     :cond_7
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "2"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 175
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isXiandai:Z
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->gaoganyanqing2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 180
a=0;//     :cond_8
a=0;//     #v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_c
a=0;// 
a=0;//     .line 181
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isXiangcun:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_a
a=0;// 
a=0;//     .line 182
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_9
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "12"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 184
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isXiangcun:Z
a=0;// 
a=0;//     .line 185
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xiangcunxiaoshuo1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 187
a=0;//     :cond_9
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "3"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 188
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isXiangcun:Z
a=0;// 
a=0;//     .line 189
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->haomenmengbao1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 193
a=0;//     :cond_a
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_b
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "12"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 195
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isXiangcun:Z
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xiangcunxiaoshuo2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 198
a=0;//     :cond_b
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "3"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 199
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isXiangcun:Z
a=0;// 
a=0;//     .line 200
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->haomenmengbao2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 204
a=0;//     :cond_c
a=0;//     #v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_10
a=0;// 
a=0;//     .line 205
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isGudian:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_e
a=0;// 
a=0;//     .line 206
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_d
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "13"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 208
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isGudian:Z
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->gudianxianxia1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 211
a=0;//     :cond_d
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "4"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 212
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isGudian:Z
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->chongwennuvwen1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 217
a=0;//     :cond_e
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_f
a=0;// 
a=0;//     .line 218
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isGudian:Z
a=0;// 
a=0;//     .line 219
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "13"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->gudianxianxia2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 222
a=0;//     :cond_f
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isGudian:Z
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "4"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->chongwennuvwen2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 228
a=0;//     :cond_10
a=0;//     #v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_14
a=0;// 
a=0;//     .line 229
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isQihuan:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_12
a=0;// 
a=0;//     .line 230
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_11
a=0;// 
a=0;//     .line 231
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "14"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 232
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isQihuan:Z
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->qihuanxiuzhen1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 235
a=0;//     :cond_11
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "5"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 236
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isQihuan:Z
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->gongdouzhaidou1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 240
a=0;//     :cond_12
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_13
a=0;// 
a=0;//     .line 241
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isQihuan:Z
a=0;// 
a=0;//     .line 242
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "14"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 243
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->qihuanxiuzhen2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 245
a=0;//     :cond_13
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isQihuan:Z
a=0;// 
a=0;//     .line 246
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "5"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 247
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->gongdouzhaidou2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 250
a=0;//     :cond_14
a=0;//     #v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_18
a=0;// 
a=0;//     .line 251
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isDongfang:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_16
a=0;// 
a=0;//     .line 252
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_15
a=0;// 
a=0;//     .line 253
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isDongfang:Z
a=0;// 
a=0;//     .line 254
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "15"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 255
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->dongfangxuanhuan1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 257
a=0;//     :cond_15
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isDongfang:Z
a=0;// 
a=0;//     .line 258
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "6"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 259
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->chuanyuezhongtian1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 263
a=0;//     :cond_16
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_17
a=0;// 
a=0;//     .line 264
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isDongfang:Z
a=0;// 
a=0;//     .line 265
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "15"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 266
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->dongfangxuanhuan2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 268
a=0;//     :cond_17
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isDongfang:Z
a=0;// 
a=0;//     .line 269
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "6"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 270
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->chuanyuechongshen2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 274
a=0;//     :cond_18
a=0;//     #v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_1c
a=0;// 
a=0;//     .line 275
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isKongbu:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1a
a=0;// 
a=0;//     .line 276
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_19
a=0;// 
a=0;//     .line 277
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isKongbu:Z
a=0;// 
a=0;//     .line 278
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "16"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 279
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->kongbulingyi1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 281
a=0;//     :cond_19
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isKongbu:Z
a=0;// 
a=0;//     .line 282
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "7"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 283
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->chuanyuechongsheng1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 286
a=0;//     :cond_1a
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_1b
a=0;// 
a=0;//     .line 287
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isKongbu:Z
a=0;// 
a=0;//     .line 288
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "16"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 289
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->kongbulingyi2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 291
a=0;//     :cond_1b
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isKongbu:Z
a=0;// 
a=0;//     .line 292
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "7"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 293
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->chuanyuechongshen2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 297
a=0;//     :cond_1c
a=0;//     #v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_20
a=0;// 
a=0;//     .line 298
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isYishi:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1e
a=0;// 
a=0;//     .line 299
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_1d
a=0;// 
a=0;//     .line 300
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isYishi:Z
a=0;// 
a=0;//     .line 301
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "17"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 302
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->yishidalu1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 304
a=0;//     :cond_1d
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isYishi:Z
a=0;// 
a=0;//     .line 305
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 306
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xuanhuannvquang1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 310
a=0;//     :cond_1e
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_1f
a=0;// 
a=0;//     .line 311
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isYishi:Z
a=0;// 
a=0;//     .line 312
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "17"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 313
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->yishidalu2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 315
a=0;//     :cond_1f
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isYishi:Z
a=0;// 
a=0;//     .line 316
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 317
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xuanhuannvqian2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 321
a=0;//     :cond_20
a=0;//     #v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_24
a=0;// 
a=0;//     .line 322
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isXifang:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_22
a=0;// 
a=0;//     .line 323
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_21
a=0;// 
a=0;//     .line 324
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isXifang:Z
a=0;// 
a=0;//     .line 325
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "18"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 326
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xifangxuanhuan1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 328
a=0;//     :cond_21
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isXifang:Z
a=0;// 
a=0;//     .line 329
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "9"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 330
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xianqingyanqing1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 334
a=0;//     :cond_22
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_23
a=0;// 
a=0;//     .line 335
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isXifang:Z
a=0;// 
a=0;//     .line 336
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "18"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 337
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xifangxuanhuan2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 339
a=0;//     :cond_23
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->isXifang:Z
a=0;// 
a=0;//     .line 340
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "9"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 341
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xianqingyanqing2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 344
a=0;//     :cond_24
a=0;//     #v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->tiaoguo:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_25
a=0;// 
a=0;//     .line 345
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v3, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     invoke-direct {v1, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 346
a=0;//     .local v1, "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "id"
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$id;->main_bookshelf:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 347
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 348
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->finish()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 349
a=0;//     .end local v1    # "intent":Landroid/content/Intent;
a=0;//     :cond_25
a=0;//     #v1=(Uninit);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->yueduzhilv:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_0
a=0;// 
a=0;//     .line 350
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 351
a=0;//     .local v2, "stringBuilder":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v0, v3, :cond_26
a=0;// 
a=0;//     .line 360
a=0;//     new-instance v3, Lcom/twocloo/com/cn/threads/RecommendedBooksThread;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/threads/RecommendedBooksThread;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v3, p0, v4, v5}, Lcom/twocloo/com/cn/threads/RecommendedBooksThread;-><init>(Landroid/app/Activity;Landroid/os/Handler;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/threads/RecommendedBooksThread;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/threads/RecommendedBooksThread;->start()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 352
a=0;//     :cond_26
a=0;//     #v3=(Integer);v4=(Uninit);v5=(One);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     if-ne v0, v3, :cond_27
a=0;// 
a=0;//     .line 353
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 351
a=0;//     :goto_2
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 355
a=0;//     :cond_27
a=0;//     #v3=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 356
a=0;//     const-string v3, ","
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 94
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->select_book_fragment:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 95
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 96
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->initview()V
a=0;// 
a=0;//     .line 97
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->initbook()V
a=0;// 
a=0;//     .line 98
a=0;//     new-instance v0, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 100
a=0;//     new-instance v0, Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/GestureDetector;);
a=0;//     invoke-direct {v0, p0}, Landroid/view/GestureDetector;-><init>(Landroid/view/GestureDetector$OnGestureListener;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->mGestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/LocalStore;->getUserSex(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->sex:I
a=0;// 
a=0;//     .line 102
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 410
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 411
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 412
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDown(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 417
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;//     .locals 2
a=0;//     .param p1, "e1"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "e2"    # Landroid/view/MotionEvent;
a=0;//     .param p3, "velocityX"    # F
a=0;//     .param p4, "velocityY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 448
a=0;//     const/high16 v0, 0x41200000    # 10.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, p3, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 449
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/SelectSexActicity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 450
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->finish()V
a=0;// 
a=0;//     .line 452
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onLongPress(Landroid/view/MotionEvent;)V
a=0;//     .locals 0
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 444
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onRestart()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 398
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 399
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onRestart()V
a=0;// 
a=0;//     .line 400
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;//     .locals 2
a=0;//     .param p1, "e1"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "e2"    # Landroid/view/MotionEvent;
a=0;//     .param p3, "distanceX"    # F
a=0;//     .param p4, "distanceY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 434
a=0;//     const/high16 v0, 0x41200000    # 10.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, p3, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 435
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/SelectSexActicity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 436
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->finish()V
a=0;// 
a=0;//     .line 438
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onShowPress(Landroid/view/MotionEvent;)V
a=0;//     .locals 0
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 424
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onSingleTapUp(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 429
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onStop()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 404
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 405
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onStop()V
a=0;// 
a=0;//     .line 406
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 457
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->mGestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     .line 458
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
