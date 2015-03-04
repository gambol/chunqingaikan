package com.twocloo.com.cn.view; class RefreshableView { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/view/RefreshableView;
a=0;// .super Landroid/widget/LinearLayout;
a=0;// .source "RefreshableView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/view/RefreshableView$RefreshListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "LILITH"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private bar:Landroid/widget/ProgressBar;
a=0;// 
a=0;// .field private downTextString:Ljava/lang/String;
a=0;// 
a=0;// .field private downTextView:Landroid/widget/TextView;
a=0;// 
a=0;// .field private isDragging:Z
a=0;// 
a=0;// .field private isRefreshEnabled:Z
a=0;// 
a=0;// .field private isRefreshing:Z
a=0;// 
a=0;// .field private lastX:I
a=0;// 
a=0;// .field private lastY:I
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private refreshIndicatorView:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private refreshListener:Lcom/twocloo/com/cn/view/RefreshableView$RefreshListener;
a=0;// 
a=0;// .field private refreshTargetTop:I
a=0;// 
a=0;// .field private refreshTime:Ljava/lang/Long;
a=0;// 
a=0;// .field private refreshView:Landroid/view/View;
a=0;// 
a=0;// .field private releaseTextString:Ljava/lang/String;
a=0;// 
a=0;// .field private scroller:Landroid/widget/Scroller;
a=0;// 
a=0;// .field private timeTextView:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 52
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/RefreshableView;);
a=0;//     const/16 v0, -0x3c
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshTargetTop:I
a=0;// 
a=0;//     .line 39
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshTime:Ljava/lang/Long;
a=0;// 
a=0;//     .line 43
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->isDragging:Z
a=0;// 
a=0;//     .line 45
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/view/RefreshableView;->isRefreshEnabled:Z
a=0;// 
a=0;//     .line 47
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->isRefreshing:Z
a=0;// 
a=0;//     .line 53
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 58
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/RefreshableView;);
a=0;//     const/16 v0, -0x3c
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshTargetTop:I
a=0;// 
a=0;//     .line 39
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshTime:Ljava/lang/Long;
a=0;// 
a=0;//     .line 43
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->isDragging:Z
a=0;// 
a=0;//     .line 45
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/view/RefreshableView;->isRefreshEnabled:Z
a=0;// 
a=0;//     .line 47
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->isRefreshing:Z
a=0;// 
a=0;//     .line 59
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 60
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/RefreshableView;->init()V
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private canScroll()Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 295
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/RefreshableView;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-le v3, v4, :cond_3
a=0;// 
a=0;//     .line 296
a=0;//     invoke-virtual {p0, v4}, Lcom/twocloo/com/cn/view/RefreshableView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 297
a=0;//     .local v0, "childView":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     instance-of v3, v0, Landroid/widget/ListView;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     move-object v3, v0
a=0;// 
a=0;//     .line 298
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/ListView;
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .local v2, "top":I
a=0;//     #v2=(Integer);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     .line 299
a=0;//     check-cast v3, Landroid/widget/ListView;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/ListView;->getListPaddingTop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 300
a=0;//     .local v1, "pad":I
a=0;//     #v1=(Integer);
a=0;//     sub-int v3, v2, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-ge v3, v6, :cond_0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/ListView;
a=0;// 
a=0;//     .end local v0    # "childView":Landroid/view/View;
a=0;//     invoke-virtual {v0}, Landroid/widget/ListView;->getFirstVisiblePosition()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     .line 314
a=0;//     .end local v1    # "pad":I
a=0;//     .end local v2    # "top":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v6=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .restart local v1    # "pad":I
a=0;//     .restart local v2    # "top":I
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Integer);v2=(Integer);v3=(Integer);v6=(PosByte);
a=0;//     move v3, v5
a=0;// 
a=0;//     .line 303
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 305
a=0;//     .end local v1    # "pad":I
a=0;//     .end local v2    # "top":I
a=0;//     .restart local v0    # "childView":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Boolean);v6=(Uninit);
a=0;//     instance-of v3, v0, Landroid/widget/ScrollView;
a=0;// 
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 306
a=0;//     check-cast v0, Landroid/widget/ScrollView;
a=0;// 
a=0;//     .end local v0    # "childView":Landroid/view/View;
a=0;//     invoke-virtual {v0}, Landroid/widget/ScrollView;->getScrollY()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     .line 307
a=0;//     #v3=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Integer);
a=0;//     move v3, v5
a=0;// 
a=0;//     .line 309
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v3=(Integer);
a=0;//     move v3, v5
a=0;// 
a=0;//     .line 314
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private doMovement(I)V
a=0;//     .locals 7
a=0;//     .param p1, "moveY"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 192
a=0;//     #v6=(Null);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshView:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v3, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 193
a=0;//     .local v3, "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     if-lez p1, :cond_0
a=0;// 
a=0;//     .line 195
a=0;//     iget v4, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v0, v4
a=0;// 
a=0;//     .line 196
a=0;//     .local v0, "f1":F
a=0;//     #v0=(Float);
a=0;//     int-to-float v4, p1
a=0;// 
a=0;//     #v4=(Float);
a=0;//     const v5, 0x3e99999a    # 0.3f
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     mul-float v1, v4, v5
a=0;// 
a=0;//     .line 197
a=0;//     .local v1, "f2":F
a=0;//     #v1=(Float);
a=0;//     add-float v4, v0, v1
a=0;// 
a=0;//     float-to-int v2, v4
a=0;// 
a=0;//     .line 199
a=0;//     .local v2, "i":I
a=0;//     #v2=(Integer);
a=0;//     iput v2, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshView:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v4, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/View;->invalidate()V
a=0;// 
a=0;//     .line 203
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/RefreshableView;->invalidate()V
a=0;// 
a=0;//     .line 205
a=0;//     .end local v0    # "f1":F
a=0;//     .end local v1    # "f2":F
a=0;//     .end local v2    # "i":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RefreshableView;->timeTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 206
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshTime:Ljava/lang/Long;
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshTime:Ljava/lang/Long;
a=0;// 
a=0;//     invoke-direct {p0, v4}, Lcom/twocloo/com/cn/view/RefreshableView;->setRefreshTime(Ljava/lang/Long;)V
a=0;// 
a=0;//     .line 209
a=0;//     :cond_1
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RefreshableView;->downTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 211
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshIndicatorView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 212
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RefreshableView;->bar:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 213
a=0;//     iget v4, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_2
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RefreshableView;->downTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/TextView;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$string;->release_to_refresh:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(I)V
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshIndicatorView:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->arrow_up:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 221
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 217
a=0;//     :cond_2
a=0;//     #v4=(Integer);v5=(PosByte);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RefreshableView;->downTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/TextView;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$string;->pull_to_refresh:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(I)V
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshIndicatorView:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->arrow_down:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private fling()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 136
a=0;//     .local v0, "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     const-string v1, "LILITH"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "fling()"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v3, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I
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
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 137
a=0;//     iget v1, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 138
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/RefreshableView;->refresh()V
a=0;// 
a=0;//     .line 142
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/RefreshableView;->returnInitState()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private init()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     new-instance v1, Landroid/widget/Scroller;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/Scroller;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Scroller;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->scroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     .line 70
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$layout;->refresh_top_item:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshView:Landroid/view/View;
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshView:Landroid/view/View;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->indicator:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshIndicatorView:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshView:Landroid/view/View;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->progress:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->bar:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshView:Landroid/view/View;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->refresh_hint:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->downTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshView:Landroid/view/View;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->refresh_time:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->timeTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 80
a=0;//     new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshTargetTop:I
a=0;// 
a=0;//     neg-int v2, v2
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 81
a=0;//     .local v0, "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshTargetTop:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 82
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 83
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/twocloo/com/cn/view/RefreshableView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 84
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->pull_to_refresh:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->downTextString:Ljava/lang/String;
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->release_to_refresh:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->releaseTextString:Ljava/lang/String;
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private refresh()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 154
a=0;//     #v4=(Null);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshView:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 155
a=0;//     .local v1, "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     iget v0, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 156
a=0;//     .local v0, "i":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshIndicatorView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->bar:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->timeTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->downTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 160
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->scroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     rsub-int/lit8 v3, v0, 0x0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v4, v0, v4, v3}, Landroid/widget/Scroller;->startScroll(IIII)V
a=0;// 
a=0;//     .line 161
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/RefreshableView;->invalidate()V
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshListener:Lcom/twocloo/com/cn/view/RefreshableView$RefreshListener;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshListener:Lcom/twocloo/com/cn/view/RefreshableView$RefreshListener;
a=0;// 
a=0;//     invoke-interface {v2, p0}, Lcom/twocloo/com/cn/view/RefreshableView$RefreshListener;->onRefresh(Lcom/twocloo/com/cn/view/RefreshableView;)V
a=0;// 
a=0;//     .line 164
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->isRefreshing:Z
a=0;// 
a=0;//     .line 166
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private returnInitState()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 146
a=0;//     #v4=(Null);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshView:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 147
a=0;//     .local v1, "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     iget v0, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 148
a=0;//     .local v0, "i":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->scroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshTargetTop:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v4, v0, v4, v3}, Landroid/widget/Scroller;->startScroll(IIII)V
a=0;// 
a=0;//     .line 149
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/RefreshableView;->invalidate()V
a=0;// 
a=0;//     .line 150
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setRefreshText(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "time"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setRefreshTime(Ljava/lang/Long;)V
a=0;//     .locals 0
a=0;//     .param p1, "time"    # Ljava/lang/Long;
a=0;// 
a=0;//     .prologue
a=0;//     .line 239
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public computeScroll()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RefreshableView;->scroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v3}, Landroid/widget/Scroller;->computeScrollOffset()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RefreshableView;->scroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v3}, Landroid/widget/Scroller;->getCurrY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 176
a=0;//     .local v0, "i":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v2, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 177
a=0;//     .local v2, "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshTargetTop:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 178
a=0;//     .local v1, "k":I
a=0;//     #v1=(Integer);
a=0;//     iput v1, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/view/View;->invalidate()V
a=0;// 
a=0;//     .line 181
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/RefreshableView;->invalidate()V
a=0;// 
a=0;//     .line 183
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "k":I
a=0;//     .end local v2    # "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public finishRefresh()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 245
a=0;//     #v4=(Null);
a=0;//     const-string v2, "LILITH"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "\u6267\u884c\u4e86=====finishRefresh"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 246
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 247
a=0;//     .local v1, "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     iget v0, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 248
a=0;//     .local v0, "i":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshIndicatorView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 249
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->timeTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 250
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->scroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshTargetTop:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v4, v0, v4, v3}, Landroid/widget/Scroller;->startScroll(IIII)V
a=0;// 
a=0;//     .line 251
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/RefreshableView;->invalidate()V
a=0;// 
a=0;//     .line 252
a=0;//     iput-boolean v4, p0, Lcom/twocloo/com/cn/view/RefreshableView;->isRefreshing:Z
a=0;// 
a=0;//     .line 253
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 4
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 264
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 265
a=0;//     .local v0, "action":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v2, v3
a=0;// 
a=0;//     .line 266
a=0;//     .local v2, "y":I
a=0;//     #v2=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 289
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Boolean);
a=0;//     return v3
a=0;// 
a=0;//     .line 268
a=0;//     :pswitch_1
a=0;//     #v1=(Uninit);v3=(Float);
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->lastY:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 273
a=0;//     :pswitch_2
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/RefreshableView;->lastY:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int v1, v2, v3
a=0;// 
a=0;//     .line 276
a=0;//     .local v1, "m":I
a=0;//     #v1=(Integer);
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->lastY:I
a=0;// 
a=0;//     .line 277
a=0;//     const/4 v3, 0x6
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-le v1, v3, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/RefreshableView;->canScroll()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 278
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 266
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 4
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v1, v2
a=0;// 
a=0;//     .line 103
a=0;//     .local v1, "y":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     .line 127
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     return v2
a=0;// 
a=0;//     .line 106
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v2=(Integer);v3=(Uninit);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->lastY:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 110
a=0;//     :pswitch_1
a=0;//     const-string v2, "LILITH"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "ACTION_MOVE"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 112
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->lastY:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int v0, v1, v2
a=0;// 
a=0;//     .line 113
a=0;//     .local v0, "m":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gt v0, v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     iget-boolean v2, p0, Lcom/twocloo/com/cn/view/RefreshableView;->isDragging:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 114
a=0;//     :cond_1
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/com/cn/view/RefreshableView;->doMovement(I)V
a=0;// 
a=0;//     .line 117
a=0;//     :cond_2
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->lastY:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 121
a=0;//     .end local v0    # "m":I
a=0;//     :pswitch_2
a=0;//     #v0=(Uninit);v2=(Integer);v3=(Uninit);
a=0;//     const-string v2, "LILITH"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "ACTION_UP"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 123
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/RefreshableView;->fling()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 103
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setRefreshEnabled(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "b"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 224
a=0;//     iput-boolean p1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->isRefreshEnabled:Z
a=0;// 
a=0;//     .line 225
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRefreshListener(Lcom/twocloo/com/cn/view/RefreshableView$RefreshListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/twocloo/com/cn/view/RefreshableView$RefreshListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 228
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/RefreshableView;->refreshListener:Lcom/twocloo/com/cn/view/RefreshableView$RefreshListener;
a=0;// 
a=0;//     .line 229
a=0;//     return-void
a=0;// .end method
}}
