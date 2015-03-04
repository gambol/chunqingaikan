package com.twocloo.com.cn.view; class PullRefreshListView { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/view/PullRefreshListView;
a=0;// .super Landroid/widget/ListView;
a=0;// .source "PullRefreshListView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/AbsListView$OnScrollListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/view/PullRefreshListView$OnLoadmoreListener;,
a=0;//         Lcom/twocloo/com/cn/view/PullRefreshListView$OnRefreshListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DONE:I = 0x3
a=0;// 
a=0;// .field private static final LOADING:I = 0x4
a=0;// 
a=0;// .field private static final PULL_To_REFRESH:I = 0x1
a=0;// 
a=0;// .field private static final RATIO:I = 0x3
a=0;// 
a=0;// .field private static final REFRESHING:I = 0x2
a=0;// 
a=0;// .field private static final RELEASE_To_REFRESH:I = 0x0
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "listview"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private animation:Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;// .field private arrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private firstItemIndex:I
a=0;// 
a=0;// .field private headContentHeight:I
a=0;// 
a=0;// .field private headContentWidth:I
a=0;// 
a=0;// .field private headView:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// .field private isBack:Z
a=0;// 
a=0;// .field private isRecored:Z
a=0;// 
a=0;// .field private isRefreshable:Z
a=0;// 
a=0;// .field private lastUpdatedTextView:Landroid/widget/TextView;
a=0;// 
a=0;// .field private loadmoreListener:Lcom/twocloo/com/cn/view/PullRefreshListView$OnLoadmoreListener;
a=0;// 
a=0;// .field private progressBar:Landroid/widget/ProgressBar;
a=0;// 
a=0;// .field private refreshListener:Lcom/twocloo/com/cn/view/PullRefreshListView$OnRefreshListener;
a=0;// 
a=0;// .field private reverseAnimation:Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;// .field private startY:I
a=0;// 
a=0;// .field private state:I
a=0;// 
a=0;// .field private tipsTextview:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     invoke-direct {p0, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 75
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/PullRefreshListView;);
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/view/PullRefreshListView;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 76
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 80
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/PullRefreshListView;);
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/view/PullRefreshListView;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private changeHeaderViewByState()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 260
a=0;//     #v2=(Null);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 317
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 262
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->arrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->progressBar:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 264
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->tipsTextview:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 265
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->lastUpdatedTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 267
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->arrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V
a=0;// 
a=0;//     .line 268
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->arrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->animation:Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/RotateAnimation;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 270
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->tipsTextview:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, "\u677e\u5f00\u5237\u65b0"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 272
a=0;//     const-string v0, "listview"
a=0;// 
a=0;//     const-string v1, "\u5f53\u524d\u72b6\u6001\uff0c\u677e\u5f00\u5237\u65b0"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 275
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->progressBar:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ProgressBar;);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 276
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->tipsTextview:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 277
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->lastUpdatedTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 278
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->arrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V
a=0;// 
a=0;//     .line 279
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->arrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 281
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->isBack:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 282
a=0;//     iput-boolean v2, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->isBack:Z
a=0;// 
a=0;//     .line 283
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->arrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V
a=0;// 
a=0;//     .line 284
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->arrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->reverseAnimation:Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/RotateAnimation;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 286
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->tipsTextview:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, "\u4e0b\u62c9\u5237\u65b0"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 290
a=0;//     :goto_1
a=0;//     const-string v0, "listview"
a=0;// 
a=0;//     const-string v1, "\u5f53\u524d\u72b6\u6001\uff0c\u4e0b\u62c9\u5237\u65b0"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 288
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->tipsTextview:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v1, "\u4e0b\u62c9\u5237\u65b0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 295
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headView:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v0, v2, v2, v2, v2}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     .line 297
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->progressBar:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 298
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->arrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V
a=0;// 
a=0;//     .line 299
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->arrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 300
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->tipsTextview:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, "\u6b63\u5728\u5237\u65b0..."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 301
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->lastUpdatedTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 303
a=0;//     const-string v0, "listview"
a=0;// 
a=0;//     const-string v1, "\u5f53\u524d\u72b6\u6001,\u6b63\u5728\u5237\u65b0..."
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 306
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headView:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headContentHeight:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1, v2, v2}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     .line 308
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->progressBar:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 309
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->arrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V
a=0;// 
a=0;//     .line 310
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->arrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->arrow_down:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 311
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->tipsTextview:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, "\u4e0b\u62c9\u5237\u65b0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 312
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->lastUpdatedTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 314
a=0;//     const-string v0, "listview"
a=0;// 
a=0;//     const-string v1, "\u5f53\u524d\u72b6\u6001\uff0cdone"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 260
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private init(Landroid/content/Context;)V
a=0;//     .locals 13
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/high16 v2, -0x3ccc0000    # -180.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/high16 v4, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 85
a=0;//     #v3=(One);
a=0;//     invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 87
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$layout;->head:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headView:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headView:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->head_arrowImageView:I
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->arrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->arrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/16 v5, 0x46
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setMinimumWidth(I)V
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->arrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/16 v5, 0x32
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setMinimumHeight(I)V
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headView:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->head_progressBar:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->progressBar:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headView:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->head_tipsTextView:I
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->tipsTextview:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headView:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->head_lastUpdatedTextView:I
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->lastUpdatedTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headView:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/com/cn/view/PullRefreshListView;->measureView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headView:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/LinearLayout;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headContentHeight:I
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headView:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v0}, Landroid/widget/LinearLayout;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headContentWidth:I
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headView:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headContentHeight:I
a=0;// 
a=0;//     mul-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v12, v5, v12, v12}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headView:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/LinearLayout;->invalidate()V
a=0;// 
a=0;//     .line 103
a=0;//     const-string v0, "size"
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "width:"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headContentWidth:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, " height:"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headContentHeight:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v0, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headView:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p0, v0, v5, v12}, Lcom/twocloo/com/cn/view/PullRefreshListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V
a=0;// 
a=0;//     .line 106
a=0;//     invoke-virtual {p0, p0}, Lcom/twocloo/com/cn/view/PullRefreshListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
a=0;// 
a=0;//     .line 108
a=0;//     new-instance v0, Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/RotateAnimation;);
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(One);
a=0;//     move v6, v4
a=0;// 
a=0;//     invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/RotateAnimation;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->animation:Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->animation:Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;//     new-instance v5, Landroid/view/animation/LinearInterpolator;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/view/animation/LinearInterpolator;);
a=0;//     invoke-direct {v5}, Landroid/view/animation/LinearInterpolator;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/animation/LinearInterpolator;);
a=0;//     invoke-virtual {v0, v5}, Landroid/view/animation/RotateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->animation:Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;//     const-wide/16 v5, 0xfa
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/view/animation/RotateAnimation;->setDuration(J)V
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->animation:Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/view/animation/RotateAnimation;->setFillAfter(Z)V
a=0;// 
a=0;//     .line 113
a=0;//     new-instance v5, Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/view/animation/RotateAnimation;);
a=0;//     move v6, v2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v7, v1
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move v8, v3
a=0;// 
a=0;//     #v8=(One);
a=0;//     move v9, v4
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     move v10, v3
a=0;// 
a=0;//     #v10=(One);
a=0;//     move v11, v4
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-direct/range {v5 .. v11}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/animation/RotateAnimation;);
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->reverseAnimation:Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->reverseAnimation:Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;//     new-instance v1, Landroid/view/animation/LinearInterpolator;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/animation/LinearInterpolator;);
a=0;//     invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/LinearInterpolator;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/RotateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->reverseAnimation:Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;//     const-wide/16 v1, 0xc8
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/RotateAnimation;->setDuration(J)V
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->reverseAnimation:Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/view/animation/RotateAnimation;->setFillAfter(Z)V
a=0;// 
a=0;//     .line 118
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     .line 119
a=0;//     iput-boolean v12, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->isRefreshable:Z
a=0;// 
a=0;//     .line 120
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private measureView(Landroid/view/View;)V
a=0;//     .locals 7
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 359
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 360
a=0;//     .local v3, "p":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v3=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 361
a=0;//     new-instance v3, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .end local v3    # "p":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v3=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     const/4 v5, -0x2
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     invoke-direct {v3, v4, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 364
a=0;//     .restart local v3    # "p":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_0
a=0;//     #v3=(Reference,Landroid/view/ViewGroup$LayoutParams;);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v6, v6, v4}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 365
a=0;//     .local v1, "childWidthSpec":I
a=0;//     #v1=(Integer);
a=0;//     iget v2, v3, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     .line 367
a=0;//     .local v2, "lpHeight":I
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     .line 368
a=0;//     const/high16 v4, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 372
a=0;//     .local v0, "childHeightSpec":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v1, v0}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 373
a=0;//     return-void
a=0;// 
a=0;//     .line 370
a=0;//     .end local v0    # "childHeightSpec":I
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     invoke-static {v6, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .restart local v0    # "childHeightSpec":I
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private onRefresh()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 352
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->refreshListener:Lcom/twocloo/com/cn/view/PullRefreshListView$OnRefreshListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/PullRefreshListView$OnRefreshListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 353
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->refreshListener:Lcom/twocloo/com/cn/view/PullRefreshListView$OnRefreshListener;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/twocloo/com/cn/view/PullRefreshListView$OnRefreshListener;->onRefresh()V
a=0;// 
a=0;//     .line 355
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onRefreshComplete()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 344
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     .line 345
a=0;//     new-instance v1, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v2, "yyyy\u5e74MM\u6708dd\u65e5  HH:mm"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 346
a=0;//     .local v1, "format":Ljava/text/SimpleDateFormat;
a=0;//     #v1=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v2, Ljava/util/Date;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v2}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 347
a=0;//     .local v0, "date":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->lastUpdatedTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\u6700\u8fd1\u66f4\u65b0:"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 348
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/PullRefreshListView;->changeHeaderViewByState()V
a=0;// 
a=0;//     .line 349
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onScroll(Landroid/widget/AbsListView;III)V
a=0;//     .locals 0
a=0;//     .param p1, "arg0"    # Landroid/widget/AbsListView;
a=0;//     .param p2, "firstVisiableItem"    # I
a=0;//     .param p3, "arg2"    # I
a=0;//     .param p4, "arg3"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->firstItemIndex:I
a=0;// 
a=0;//     .line 124
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
a=0;//     .locals 2
a=0;//     .param p1, "arg0"    # Landroid/widget/AbsListView;
a=0;//     .param p2, "arg1"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne p2, v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/widget/AbsListView;->getLastVisiblePosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/widget/AbsListView;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->loadmoreListener:Lcom/twocloo/com/cn/view/PullRefreshListView$OnLoadmoreListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/PullRefreshListView$OnLoadmoreListener;);
a=0;//     invoke-interface {v0}, Lcom/twocloo/com/cn/view/PullRefreshListView$OnLoadmoreListener;->onLoadmore()V
a=0;// 
a=0;//     .line 131
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 8
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x4
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 135
a=0;//     #v4=(Null);
a=0;//     iget-boolean v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->isRefreshable:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 136
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 255
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Integer);
a=0;//     invoke-super {p0, p1}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 138
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Uninit);v3=(One);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->firstItemIndex:I
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->isRecored:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 139
a=0;//     iput-boolean v3, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->isRecored:Z
a=0;// 
a=0;//     .line 140
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->startY:I
a=0;// 
a=0;//     .line 141
a=0;//     const-string v1, "listview"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u5728down\u65f6\u5019\u8bb0\u5f55\u5f53\u524d\u4f4d\u7f6e\u2018"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 147
a=0;//     :pswitch_1
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     if-eq v1, v6, :cond_2
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     if-eq v1, v7, :cond_2
a=0;// 
a=0;//     .line 151
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     if-ne v1, v3, :cond_1
a=0;// 
a=0;//     .line 152
a=0;//     iput v5, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     .line 153
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/PullRefreshListView;->changeHeaderViewByState()V
a=0;// 
a=0;//     .line 155
a=0;//     const-string v1, "listview"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u7531\u4e0b\u62c9\u5237\u65b0\u72b6\u6001\uff0c\u5230done\u72b6\u6001"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 157
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 158
a=0;//     iput v6, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     .line 159
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/PullRefreshListView;->changeHeaderViewByState()V
a=0;// 
a=0;//     .line 160
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/PullRefreshListView;->onRefresh()V
a=0;// 
a=0;//     .line 162
a=0;//     const-string v1, "listview"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u7531\u677e\u5f00\u5237\u65b0\u72b6\u6001\uff0c\u5230done\u72b6\u6001"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 166
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iput-boolean v4, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->isRecored:Z
a=0;// 
a=0;//     .line 167
a=0;//     iput-boolean v4, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->isBack:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 172
a=0;//     :pswitch_2
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v0, v1
a=0;// 
a=0;//     .line 174
a=0;//     .local v0, "tempY":I
a=0;//     #v0=(Integer);
a=0;//     iget-boolean v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->isRecored:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->firstItemIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 175
a=0;//     const-string v1, "listview"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u5728move\u65f6\u5019\u8bb0\u5f55\u4e0b\u4f4d\u7f6e"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 176
a=0;//     iput-boolean v3, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->isRecored:Z
a=0;// 
a=0;//     .line 177
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->startY:I
a=0;// 
a=0;//     .line 180
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v6, :cond_0
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->isRecored:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v7, :cond_0
a=0;// 
a=0;//     .line 185
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 187
a=0;//     invoke-virtual {p0, v4}, Lcom/twocloo/com/cn/view/PullRefreshListView;->setSelection(I)V
a=0;// 
a=0;//     .line 190
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->startY:I
a=0;// 
a=0;//     sub-int v1, v0, v1
a=0;// 
a=0;//     div-int/lit8 v1, v1, 0x3
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headContentHeight:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_8
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->startY:I
a=0;// 
a=0;//     sub-int v1, v0, v1
a=0;// 
a=0;//     if-lez v1, :cond_8
a=0;// 
a=0;//     .line 191
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     .line 192
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/PullRefreshListView;->changeHeaderViewByState()V
a=0;// 
a=0;//     .line 194
a=0;//     const-string v1, "listview"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u7531\u677e\u5f00\u5237\u65b0\u72b6\u6001\u8f6c\u53d8\u5230\u4e0b\u62c9\u5237\u65b0\u72b6\u6001"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 209
a=0;//     :cond_4
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v3, :cond_5
a=0;// 
a=0;//     .line 211
a=0;//     invoke-virtual {p0, v4}, Lcom/twocloo/com/cn/view/PullRefreshListView;->setSelection(I)V
a=0;// 
a=0;//     .line 214
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->startY:I
a=0;// 
a=0;//     sub-int v1, v0, v1
a=0;// 
a=0;//     div-int/lit8 v1, v1, 0x3
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headContentHeight:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v1, v2, :cond_9
a=0;// 
a=0;//     .line 215
a=0;//     iput v4, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     .line 216
a=0;//     iput-boolean v3, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->isBack:Z
a=0;// 
a=0;//     .line 217
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/PullRefreshListView;->changeHeaderViewByState()V
a=0;// 
a=0;//     .line 219
a=0;//     const-string v1, "listview"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u7531done\u6216\u8005\u4e0b\u62c9\u5237\u65b0\u72b6\u6001\u8f6c\u53d8\u5230\u677e\u5f00\u5237\u65b0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 231
a=0;//     :cond_5
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v5, :cond_6
a=0;// 
a=0;//     .line 232
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->startY:I
a=0;// 
a=0;//     sub-int v1, v0, v1
a=0;// 
a=0;//     if-lez v1, :cond_6
a=0;// 
a=0;//     .line 233
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     .line 234
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/PullRefreshListView;->changeHeaderViewByState()V
a=0;// 
a=0;//     .line 239
a=0;//     :cond_6
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     if-ne v1, v3, :cond_7
a=0;// 
a=0;//     .line 240
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headView:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headContentHeight:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->startY:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int v3, v0, v3
a=0;// 
a=0;//     div-int/lit8 v3, v3, 0x3
a=0;// 
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {v1, v4, v2, v4, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     .line 245
a=0;//     :cond_7
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 246
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headView:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->startY:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int v2, v0, v2
a=0;// 
a=0;//     div-int/lit8 v2, v2, 0x3
a=0;// 
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->headContentHeight:I
a=0;// 
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {v1, v4, v2, v4, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 197
a=0;//     :cond_8
a=0;//     #v1=(Integer);v3=(One);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->startY:I
a=0;// 
a=0;//     sub-int v1, v0, v1
a=0;// 
a=0;//     if-gtz v1, :cond_4
a=0;// 
a=0;//     .line 198
a=0;//     iput v5, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     .line 199
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/PullRefreshListView;->changeHeaderViewByState()V
a=0;// 
a=0;//     .line 201
a=0;//     const-string v1, "listview"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u7531\u677e\u5f00\u5237\u65b0\u72b6\u6001\u8f6c\u53d8\u5230done\u72b6\u6001"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 222
a=0;//     :cond_9
a=0;//     #v1=(Integer);v2=(Integer);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->startY:I
a=0;// 
a=0;//     sub-int v1, v0, v1
a=0;// 
a=0;//     if-gtz v1, :cond_5
a=0;// 
a=0;//     .line 223
a=0;//     iput v5, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->state:I
a=0;// 
a=0;//     .line 224
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/PullRefreshListView;->changeHeaderViewByState()V
a=0;// 
a=0;//     .line 226
a=0;//     const-string v1, "listview"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u7531DOne\u6216\u8005\u4e0b\u62c9\u5237\u65b0\u72b6\u6001\u8f6c\u53d8\u5230done\u72b6\u6001"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 136
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Landroid/widget/BaseAdapter;)V
a=0;//     .locals 5
a=0;//     .param p1, "adapter"    # Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 376
a=0;//     new-instance v1, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v2, "yyyy\u5e74MM\u6708dd\u65e5  HH:mm"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 377
a=0;//     .local v1, "format":Ljava/text/SimpleDateFormat;
a=0;//     #v1=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v2, Ljava/util/Date;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v2}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 378
a=0;//     .local v0, "date":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->lastUpdatedTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\u6700\u8fd1\u66f4\u65b0:"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 379
a=0;//     invoke-super {p0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 380
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setonLoadmoreListener(Lcom/twocloo/com/cn/view/PullRefreshListView$OnLoadmoreListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "loadmoreListener"    # Lcom/twocloo/com/cn/view/PullRefreshListView$OnLoadmoreListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 320
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->loadmoreListener:Lcom/twocloo/com/cn/view/PullRefreshListView$OnLoadmoreListener;
a=0;// 
a=0;//     .line 321
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setonRefreshListener(Lcom/twocloo/com/cn/view/PullRefreshListView$OnRefreshListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "refreshListener"    # Lcom/twocloo/com/cn/view/PullRefreshListView$OnRefreshListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->refreshListener:Lcom/twocloo/com/cn/view/PullRefreshListView$OnRefreshListener;
a=0;// 
a=0;//     .line 325
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/view/PullRefreshListView;->isRefreshable:Z
a=0;// 
a=0;//     .line 326
a=0;//     return-void
a=0;// .end method
}}
