package com.twocloo.com.cn.view; class FlingGallery$FlingGalleryAnimation { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;
a=0;// .super Landroid/view/animation/Animation;
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
a=0;//     name = "FlingGalleryAnimation"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mInitialOffset:I
a=0;// 
a=0;// .field private mIsAnimationInProgres:Z
a=0;// 
a=0;// .field private mRelativeViewNumber:I
a=0;// 
a=0;// .field private mTargetDistance:I
a=0;// 
a=0;// .field private mTargetOffset:I
a=0;// 
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/twocloo/com/cn/view/FlingGallery;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 443
a=0;//     #v0=(Null);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     .line 442
a=0;//     invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V
a=0;// 
a=0;//     .line 444
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mIsAnimationInProgres:Z
a=0;// 
a=0;//     .line 445
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mRelativeViewNumber:I
a=0;// 
a=0;//     .line 446
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mInitialOffset:I
a=0;// 
a=0;//     .line 447
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mTargetOffset:I
a=0;// 
a=0;//     .line 448
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mTargetDistance:I
a=0;// 
a=0;//     .line 449
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected applyTransformation(FLandroid/view/animation/Transformation;)V
a=0;//     .locals 5
a=0;//     .param p1, "interpolatedTime"    # F
a=0;//     .param p2, "transformation"    # Landroid/view/animation/Transformation;
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v2, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 505
a=0;//     #v2=(Integer);
a=0;//     cmpl-float v3, p1, v2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_0
a=0;// 
a=0;//     move p1, v2
a=0;// 
a=0;//     .line 507
a=0;//     :cond_0
a=0;//     #p1=(Integer);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mInitialOffset:I
a=0;// 
a=0;//     .line 508
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mTargetDistance:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     mul-float/2addr v3, p1
a=0;// 
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     .line 507
a=0;//     #v3=(Integer);
a=0;//     add-int v0, v2, v3
a=0;// 
a=0;//     .line 510
a=0;//     .local v0, "offset":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "viewNumber":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_1
a=0;// 
a=0;//     .line 521
a=0;//     return-void
a=0;// 
a=0;//     .line 514
a=0;//     :cond_1
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mTargetDistance:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_2
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mRelativeViewNumber:I
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/twocloo/com/cn/view/FlingGallery;->access$7(Lcom/twocloo/com/cn/view/FlingGallery;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_3
a=0;// 
a=0;//     .line 515
a=0;//     :cond_2
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mTargetDistance:I
a=0;// 
a=0;//     if-gez v2, :cond_4
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mRelativeViewNumber:I
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/twocloo/com/cn/view/FlingGallery;->access$3(Lcom/twocloo/com/cn/view/FlingGallery;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v1, v2, :cond_4
a=0;// 
a=0;//     .line 517
a=0;//     :cond_3
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/view/FlingGallery;->access$4(Lcom/twocloo/com/cn/view/FlingGallery;)[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aget-object v2, v2, v1
a=0;// 
a=0;//     .line 518
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mRelativeViewNumber:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v0, v3, v4}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->setOffset(III)V
a=0;// 
a=0;//     .line 510
a=0;//     :cond_4
a=0;//     #v2=(Integer);v3=(Integer);v4=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getTransformation(JLandroid/view/animation/Transformation;)Z
a=0;//     .locals 5
a=0;//     .param p1, "currentTime"    # J
a=0;//     .param p3, "outTransformation"    # Landroid/view/animation/Transformation;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 527
a=0;//     #v0=(Null);
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/view/animation/Animation;->getTransformation(JLandroid/view/animation/Transformation;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 530
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/view/FlingGallery;->access$4(Lcom/twocloo/com/cn/view/FlingGallery;)[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mTargetOffset:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mRelativeViewNumber:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v3, v0, v4}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->setOffset(III)V
a=0;// 
a=0;//     .line 531
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/view/FlingGallery;->access$4(Lcom/twocloo/com/cn/view/FlingGallery;)[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aget-object v1, v2, v1
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mTargetOffset:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mRelativeViewNumber:I
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0, v3}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->setOffset(III)V
a=0;// 
a=0;//     .line 532
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/view/FlingGallery;->access$4(Lcom/twocloo/com/cn/view/FlingGallery;)[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aget-object v1, v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mTargetOffset:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mRelativeViewNumber:I
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0, v3}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->setOffset(III)V
a=0;// 
a=0;//     .line 535
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mIsAnimationInProgres:Z
a=0;// 
a=0;//     .line 553
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 541
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(One);v2=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/view/FlingGallery;->access$8(Lcom/twocloo/com/cn/view/FlingGallery;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/view/FlingGallery;->access$9(Lcom/twocloo/com/cn/view/FlingGallery;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 553
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public prepareAnimation(I)V
a=0;//     .locals 7
a=0;//     .param p1, "relativeViewNumber"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 454
a=0;//     #v6=(Null);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mRelativeViewNumber:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq v4, p1, :cond_1
a=0;// 
a=0;//     .line 456
a=0;//     iget-boolean v4, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mIsAnimationInProgres:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 460
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mRelativeViewNumber:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v5}, Lcom/twocloo/com/cn/view/FlingGallery;->access$3(Lcom/twocloo/com/cn/view/FlingGallery;I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne p1, v4, :cond_2
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 462
a=0;//     .local v1, "newDirection":I
a=0;//     :goto_0
a=0;//     #v1=(Byte);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mTargetDistance:I
a=0;// 
a=0;//     if-gez v4, :cond_3
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 465
a=0;//     .local v0, "animDirection":I
a=0;//     :goto_1
a=0;//     #v0=(Byte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 469
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/view/FlingGallery;->access$4(Lcom/twocloo/com/cn/view/FlingGallery;)[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aget-object v3, v3, v6
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mTargetOffset:I
a=0;// 
a=0;//     .line 470
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mRelativeViewNumber:I
a=0;// 
a=0;//     .line 469
a=0;//     invoke-virtual {v3, v4, v6, v5}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->setOffset(III)V
a=0;// 
a=0;//     .line 471
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/view/FlingGallery;->access$4(Lcom/twocloo/com/cn/view/FlingGallery;)[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aget-object v3, v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mTargetOffset:I
a=0;// 
a=0;//     .line 472
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mRelativeViewNumber:I
a=0;// 
a=0;//     .line 471
a=0;//     invoke-virtual {v3, v4, v6, v5}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->setOffset(III)V
a=0;// 
a=0;//     .line 473
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/view/FlingGallery;->access$4(Lcom/twocloo/com/cn/view/FlingGallery;)[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aget-object v3, v3, v4
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mTargetOffset:I
a=0;// 
a=0;//     .line 474
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mRelativeViewNumber:I
a=0;// 
a=0;//     .line 473
a=0;//     invoke-virtual {v3, v4, v6, v5}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->setOffset(III)V
a=0;// 
a=0;//     .line 479
a=0;//     .end local v0    # "animDirection":I
a=0;//     .end local v1    # "newDirection":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Byte);v5=(Conflicted);
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mRelativeViewNumber:I
a=0;// 
a=0;//     .line 486
a=0;//     :cond_1
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/view/FlingGallery;->access$4(Lcom/twocloo/com/cn/view/FlingGallery;)[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mRelativeViewNumber:I
a=0;// 
a=0;//     aget-object v3, v3, v4
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->getCurrentOffset()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mInitialOffset:I
a=0;// 
a=0;//     .line 487
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mRelativeViewNumber:I
a=0;// 
a=0;//     .line 488
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mRelativeViewNumber:I
a=0;// 
a=0;//     .line 487
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v3, v4, v5}, Lcom/twocloo/com/cn/view/FlingGallery;->access$2(Lcom/twocloo/com/cn/view/FlingGallery;II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mTargetOffset:I
a=0;// 
a=0;//     .line 489
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mTargetOffset:I
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mInitialOffset:I
a=0;// 
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mTargetDistance:I
a=0;// 
a=0;//     .line 492
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/view/FlingGallery;->access$5(Lcom/twocloo/com/cn/view/FlingGallery;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-long v3, v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {p0, v3, v4}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->setDuration(J)V
a=0;// 
a=0;//     .line 493
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/view/FlingGallery;->access$6(Lcom/twocloo/com/cn/view/FlingGallery;)Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 496
a=0;//     iput-boolean v2, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->mIsAnimationInProgres:Z
a=0;// 
a=0;//     .line 497
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Byte);v4=(Integer);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 461
a=0;//     #v1=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v1    # "newDirection":I
a=0;//     :cond_3
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 462
a=0;//     #v0=(Byte);
a=0;//     goto :goto_1
a=0;// .end method
}}
