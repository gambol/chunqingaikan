package com.twocloo.com.cn.view; class FlingGallery$FlingGalleryView { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// .super Ljava/lang/Object;
a=0;// .source "FlingGallery.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "FlingGalleryView"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mExternalView:Landroid/view/View;
a=0;// 
a=0;// .field private mInternalLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private mInvalidLayout:Landroid/widget/FrameLayout;
a=0;// 
a=0;// .field private mParentLayout:Landroid/widget/FrameLayout;
a=0;// 
a=0;// .field private mViewNumber:I
a=0;// 
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/twocloo/com/cn/view/FlingGallery;ILandroid/widget/FrameLayout;)V
a=0;//     .locals 3
a=0;//     .param p2, "viewNumber"    # I
a=0;//     .param p3, "parentLayout"    # Landroid/widget/FrameLayout;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 368
a=0;//     #v2=(Byte);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     .line 367
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 363
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mInvalidLayout:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     .line 364
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mInternalLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 365
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mExternalView:Landroid/view/View;
a=0;// 
a=0;//     .line 369
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mViewNumber:I
a=0;// 
a=0;//     .line 370
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mParentLayout:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     .line 373
a=0;//     new-instance v0, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     invoke-static {p1}, Lcom/twocloo/com/cn/view/FlingGallery;->access$0(Lcom/twocloo/com/cn/view/FlingGallery;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mInvalidLayout:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     .line 374
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mInvalidLayout:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 375
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 374
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 378
a=0;//     new-instance v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-static {p1}, Lcom/twocloo/com/cn/view/FlingGallery;->access$0(Lcom/twocloo/com/cn/view/FlingGallery;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mInternalLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 379
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mInternalLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 380
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 379
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 382
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mParentLayout:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mInternalLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 383
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCurrentOffset()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 425
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mInternalLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v0}, Landroid/widget/LinearLayout;->getScrollX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public recycleView(I)V
a=0;//     .locals 4
a=0;//     .param p1, "newPosition"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     .line 387
a=0;//     #v3=(Byte);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mExternalView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 389
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mInternalLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mExternalView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 392
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/view/FlingGallery;->access$1(Lcom/twocloo/com/cn/view/FlingGallery;)Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 394
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/view/FlingGallery;->getFirstPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt p1, v0, :cond_3
a=0;// 
a=0;//     .line 395
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/view/FlingGallery;->getLastPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt p1, v0, :cond_3
a=0;// 
a=0;//     .line 397
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/view/FlingGallery;->access$1(Lcom/twocloo/com/cn/view/FlingGallery;)Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 398
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mExternalView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mInternalLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 397
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-interface {v0, p1, v1, v2}, Landroid/widget/Adapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mExternalView:Landroid/view/View;
a=0;// 
a=0;//     .line 405
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mExternalView:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 407
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mInternalLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mExternalView:Landroid/view/View;
a=0;// 
a=0;//     .line 408
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     new-instance v2, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v2, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 407
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 411
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 401
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mInvalidLayout:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mExternalView:Landroid/view/View;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public requestFocus()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 430
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mInternalLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v0}, Landroid/widget/LinearLayout;->requestFocus()Z
a=0;// 
a=0;//     .line 431
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOffset(III)V
a=0;//     .locals 3
a=0;//     .param p1, "xOffset"    # I
a=0;//     .param p2, "yOffset"    # I
a=0;//     .param p3, "relativeViewNumber"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 417
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mInternalLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 418
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->mViewNumber:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2, p3}, Lcom/twocloo/com/cn/view/FlingGallery;->access$2(Lcom/twocloo/com/cn/view/FlingGallery;II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v1, p1
a=0;// 
a=0;//     .line 417
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/widget/LinearLayout;->scrollTo(II)V
a=0;// 
a=0;//     .line 420
a=0;//     return-void
a=0;// .end method
}}
