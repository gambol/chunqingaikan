package com.twocloo.com.cn.fragment; class SelectBookFragment { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/fragment/SelectBookFragment;
a=0;// .super Landroid/support/v4/app/Fragment;
a=0;// .source "SelectBookFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private gudianxianxia:Landroid/widget/ImageView;
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
a=0;// .field private qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private sex:I
a=0;// 
a=0;// .field private tiaoguo:Landroid/widget/ImageView;
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
a=0;//     .line 30
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/SelectBookFragment;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 34
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isDushi:Z
a=0;// 
a=0;//     .line 35
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isXiandai:Z
a=0;// 
a=0;//     .line 36
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isXiangcun:Z
a=0;// 
a=0;//     .line 37
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isGudian:Z
a=0;// 
a=0;//     .line 38
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isQihuan:Z
a=0;// 
a=0;//     .line 39
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isDongfang:Z
a=0;// 
a=0;//     .line 40
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isKongbu:Z
a=0;// 
a=0;//     .line 41
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isYishi:Z
a=0;// 
a=0;//     .line 42
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isXifang:Z
a=0;// 
a=0;//     .line 44
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     .line 30
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initbook()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 337
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
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
a=0;//     .line 338
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->dushiyineng2:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 339
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->xiandaixiuzhen2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 340
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->xiangcunxiaoshuo2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 341
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->gudianxianxia2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 342
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->qihuanxiuzhen2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 343
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->dongfangxuanhuan2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 344
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->kongbulingyi2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 345
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->yishidalu2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 346
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->xifangxuanhuan2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 352
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->zongcaihaomen2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 353
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->gaoganyanqing2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 354
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->haomenmengbao2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 355
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->chongwennuvwen2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 356
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->gongdouzhaidou2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 357
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->chuanyuezhongtian2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 358
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->chuanyuechongshen2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 359
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->xuanhuannvqian2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 360
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->xianqingyanqing2:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 363
a=0;//     return-void
a=0;// 
a=0;//     .line 348
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(One);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/LocalStore;->getUserSex(Landroid/content/Context;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private initview(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->doushiyineng:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 63
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->xiandaixiuzhen:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 64
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->xiangcunxiaoshuo:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 65
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->gudianxianxia:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 66
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->qihuanxiuzhen:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 67
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->dongfangxuanhuan:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 68
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->kongbulingyi:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 69
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->xifangqihuan:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 70
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->yishidalu:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 71
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->tiaoguo:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->tiaoguo:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->tiaoguo:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 73
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->yueduzhilv:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->yueduzhilv:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->yueduzhilv:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 83
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 84
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onAttach(Landroid/app/Activity;)V
a=0;//     .locals 2
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 332
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 333
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "-------onattach->"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 334
a=0;//     return-void
a=0;// .end method
a=0;// 
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
a=0;//     .line 88
a=0;//     #v5=(One);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ImageView;);
a=0;//     if-ne p1, v3, :cond_4
a=0;// 
a=0;//     .line 90
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isDushi:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 91
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_1
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u90fd\u5e02\u5f02\u80fd"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 93
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isDushi:Z
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->dushiyineng1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 321
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 96
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u603b\u88c1\u8c6a\u95e8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 97
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isDushi:Z
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->zongcaihaomen1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 102
a=0;//     :cond_2
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_3
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u90fd\u5e02\u5f02\u80fd"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 104
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isDushi:Z
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->dushiyineng2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 107
a=0;//     :cond_3
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u603b\u88c1\u8c6a\u95e8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 108
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isDushi:Z
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->dushiyineng:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->zongcaihaomen2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 113
a=0;//     :cond_4
a=0;//     #v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_8
a=0;// 
a=0;//     .line 114
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isXiandai:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     .line 115
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_5
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u73b0\u4ee3\u4fee\u771f"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 117
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isXiandai:Z
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xiandaixiuzhen1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 120
a=0;//     :cond_5
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u9ad8\u5e72\u8a00\u60c5"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 121
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isXiandai:Z
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->gaoganyanqing1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 126
a=0;//     :cond_6
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_7
a=0;// 
a=0;//     .line 127
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u73b0\u4ee3\u4fee\u771f"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 128
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isXiandai:Z
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xiandaixiuzhen2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 131
a=0;//     :cond_7
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u9ad8\u5e72\u8a00\u60c5"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 132
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isXiandai:Z
a=0;// 
a=0;//     .line 133
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xiandaixiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->gaoganyanqing2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 137
a=0;//     :cond_8
a=0;//     #v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_c
a=0;// 
a=0;//     .line 138
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isXiangcun:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_a
a=0;// 
a=0;//     .line 139
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_9
a=0;// 
a=0;//     .line 140
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u4e61\u6751\u5c0f\u8bf4"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 141
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isXiangcun:Z
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xiangcunxiaoshuo1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 144
a=0;//     :cond_9
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u8c6a\u95e8\u840c\u5b9d"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 145
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isXiangcun:Z
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->haomenmengbao1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 150
a=0;//     :cond_a
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_b
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u4e61\u6751\u5c0f\u8bf4"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 152
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isXiangcun:Z
a=0;// 
a=0;//     .line 153
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xiangcunxiaoshuo2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 155
a=0;//     :cond_b
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u8c6a\u95e8\u840c\u5b9d"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 156
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isXiangcun:Z
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xiangcunxiaoshuo:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->haomenmengbao2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 161
a=0;//     :cond_c
a=0;//     #v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_10
a=0;// 
a=0;//     .line 162
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isGudian:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_e
a=0;// 
a=0;//     .line 163
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_d
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u53e4\u5178\u4ed9\u4fe0"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 165
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isGudian:Z
a=0;// 
a=0;//     .line 166
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->gudianxianxia1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 168
a=0;//     :cond_d
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u5ba0\u6587\u8650\u6587"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 169
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isGudian:Z
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->chongwennuvwen1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 174
a=0;//     :cond_e
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_f
a=0;// 
a=0;//     .line 175
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isGudian:Z
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u53e4\u5178\u4ed9\u4fe0"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->gudianxianxia2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 179
a=0;//     :cond_f
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isGudian:Z
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u5ba0\u6587\u8650\u6587"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 181
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->gudianxianxia:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->chongwennuvwen2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 185
a=0;//     :cond_10
a=0;//     #v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_14
a=0;// 
a=0;//     .line 186
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isQihuan:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_12
a=0;// 
a=0;//     .line 187
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_11
a=0;// 
a=0;//     .line 188
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u5947\u5e7b\u4fee\u771f"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 189
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isQihuan:Z
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->qihuanxiuzhen1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 192
a=0;//     :cond_11
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u5bab\u6597\u5b85\u6597"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 193
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isQihuan:Z
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->gongdouzhaidou1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 197
a=0;//     :cond_12
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_13
a=0;// 
a=0;//     .line 198
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isQihuan:Z
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u5947\u5e7b\u4fee\u771f"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 200
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->qihuanxiuzhen2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 202
a=0;//     :cond_13
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isQihuan:Z
a=0;// 
a=0;//     .line 203
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u5bab\u6597\u5b85\u6597"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->qihuanxiuzhen:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->gongdouzhaidou2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 207
a=0;//     :cond_14
a=0;//     #v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_18
a=0;// 
a=0;//     .line 208
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isDongfang:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_16
a=0;// 
a=0;//     .line 209
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_15
a=0;// 
a=0;//     .line 210
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isDongfang:Z
a=0;// 
a=0;//     .line 211
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u4e1c\u65b9\u7384\u5e7b"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 212
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->dongfangxuanhuan1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 214
a=0;//     :cond_15
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isDongfang:Z
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u7a7f\u8d8a\u79cd\u7530"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->chuanyuezhongtian1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 220
a=0;//     :cond_16
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_17
a=0;// 
a=0;//     .line 221
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isDongfang:Z
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u4e1c\u65b9\u7384\u5e7b"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->dongfangxuanhuan2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 225
a=0;//     :cond_17
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isDongfang:Z
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u7a7f\u8d8a\u79cd\u7530"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->dongfangxuanhuan:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->chuanyuechongshen2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 231
a=0;//     :cond_18
a=0;//     #v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_1c
a=0;// 
a=0;//     .line 232
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isKongbu:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1a
a=0;// 
a=0;//     .line 233
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_19
a=0;// 
a=0;//     .line 234
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isKongbu:Z
a=0;// 
a=0;//     .line 235
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u6050\u6016\u7075\u5f02"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 236
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->kongbulingyi1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 238
a=0;//     :cond_19
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isKongbu:Z
a=0;// 
a=0;//     .line 239
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u7a7f\u8d8a\u91cd\u751f"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 240
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->chuanyuechongsheng1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 243
a=0;//     :cond_1a
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_1b
a=0;// 
a=0;//     .line 244
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isKongbu:Z
a=0;// 
a=0;//     .line 245
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u6050\u6016\u7075\u5f02"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 246
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->kongbulingyi2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 248
a=0;//     :cond_1b
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isKongbu:Z
a=0;// 
a=0;//     .line 249
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u7a7f\u8d8a\u91cd\u751f"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 250
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->kongbulingyi:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->chuanyuechongshen2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 254
a=0;//     :cond_1c
a=0;//     #v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_20
a=0;// 
a=0;//     .line 255
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isYishi:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1e
a=0;// 
a=0;//     .line 256
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_1d
a=0;// 
a=0;//     .line 257
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isYishi:Z
a=0;// 
a=0;//     .line 258
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u5f02\u4e16\u5927\u9646"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 259
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->yishidalu1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 261
a=0;//     :cond_1d
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isYishi:Z
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u7384\u5e7b\u5973\u5f3a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xuanhuannvquang1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 267
a=0;//     :cond_1e
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_1f
a=0;// 
a=0;//     .line 268
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isYishi:Z
a=0;// 
a=0;//     .line 269
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u5f02\u4e16\u5927\u9646"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 270
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->yishidalu2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 272
a=0;//     :cond_1f
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isYishi:Z
a=0;// 
a=0;//     .line 273
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u7384\u5e7b\u5973\u5f3a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 274
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->yishidalu:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xuanhuannvqian2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 278
a=0;//     :cond_20
a=0;//     #v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_24
a=0;// 
a=0;//     .line 279
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isXifang:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_22
a=0;// 
a=0;//     .line 280
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_21
a=0;// 
a=0;//     .line 281
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isXifang:Z
a=0;// 
a=0;//     .line 282
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u897f\u65b9\u5947\u5e7b"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 283
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xifangxuanhuan1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 285
a=0;//     :cond_21
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isXifang:Z
a=0;// 
a=0;//     .line 286
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u4ed9\u4fa0\u8a00\u60c5"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 287
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xianqingyanqing1:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 291
a=0;//     :cond_22
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v5, :cond_23
a=0;// 
a=0;//     .line 292
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isXifang:Z
a=0;// 
a=0;//     .line 293
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u897f\u65b9\u5947\u5e7b"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 294
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xifangxuanhuan2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 296
a=0;//     :cond_23
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iput-boolean v6, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->isXifang:Z
a=0;// 
a=0;//     .line 297
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u897f\u65b9\u5947\u5e7b"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 298
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->xifangxuanhuanImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->xianqingyanqing2:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 301
a=0;//     :cond_24
a=0;//     #v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->tiaoguo:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_25
a=0;// 
a=0;//     .line 302
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-class v4, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 303
a=0;//     .local v1, "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "id"
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$id;->main_bookshelf:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 304
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 305
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->finish()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 306
a=0;//     .end local v1    # "intent":Landroid/content/Intent;
a=0;//     :cond_25
a=0;//     #v1=(Uninit);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->yueduzhilv:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v3, :cond_0
a=0;// 
a=0;//     .line 307
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 308
a=0;//     .local v2, "stringBuilder":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v0, v3, :cond_26
a=0;// 
a=0;//     .line 316
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     const-class v4, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 317
a=0;//     .restart local v1    # "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "id"
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$id;->main_bookshelf:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 318
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 319
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->finish()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 309
a=0;//     .end local v1    # "intent":Landroid/content/Intent;
a=0;//     :cond_26
a=0;//     #v1=(Uninit);v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
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
a=0;//     .line 310
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
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
a=0;//     .line 308
a=0;//     :goto_2
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 312
a=0;//     :cond_27
a=0;//     #v3=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->list:Ljava/util/ArrayList;
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
a=0;//     .line 313
a=0;//     const-string v3, ","
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;//     .locals 3
a=0;//     .param p1, "inflater"    # Landroid/view/LayoutInflater;
a=0;//     .param p2, "container"    # Landroid/view/ViewGroup;
a=0;//     .param p3, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     sget v1, Lcom/twocloo/com/cn/R$layout;->select_book_fragment:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 49
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->initview(Landroid/view/View;)V
a=0;// 
a=0;//     .line 50
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->initbook()V
a=0;// 
a=0;//     .line 51
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getUserSex(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->sex:I
a=0;// 
a=0;//     .line 52
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onResume()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "-------resume->"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 58
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStart()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 325
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/fragment/SelectBookFragment;->initbook()V
a=0;// 
a=0;//     .line 326
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "-------start->"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 327
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V
a=0;// 
a=0;//     .line 328
a=0;//     return-void
a=0;// .end method
}}
