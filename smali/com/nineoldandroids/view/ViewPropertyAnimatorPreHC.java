package com.nineoldandroids.view; class ViewPropertyAnimatorPreHC { void a() { int a;
a=0;// .class Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;
a=0;// .super Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;// .source "ViewPropertyAnimatorPreHC.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$AnimatorEventListener;,
a=0;//         Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;,
a=0;//         Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ALPHA:I = 0x200
a=0;// 
a=0;// .field private static final NONE:I = 0x0
a=0;// 
a=0;// .field private static final ROTATION:I = 0x10
a=0;// 
a=0;// .field private static final ROTATION_X:I = 0x20
a=0;// 
a=0;// .field private static final ROTATION_Y:I = 0x40
a=0;// 
a=0;// .field private static final SCALE_X:I = 0x4
a=0;// 
a=0;// .field private static final SCALE_Y:I = 0x8
a=0;// 
a=0;// .field private static final TRANSFORM_MASK:I = 0x1ff
a=0;// 
a=0;// .field private static final TRANSLATION_X:I = 0x1
a=0;// 
a=0;// .field private static final TRANSLATION_Y:I = 0x2
a=0;// 
a=0;// .field private static final X:I = 0x80
a=0;// 
a=0;// .field private static final Y:I = 0x100
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAnimationStarter:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mAnimatorEventListener:Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$AnimatorEventListener;
a=0;// 
a=0;// .field private mAnimatorMap:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Lcom/nineoldandroids/animation/Animator;",
a=0;//             "Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mDuration:J
a=0;// 
a=0;// .field private mDurationSet:Z
a=0;// 
a=0;// .field private mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field private mInterpolatorSet:Z
a=0;// 
a=0;// .field private mListener:Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;// .field mPendingAnimations:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;// .field private mStartDelay:J
a=0;// 
a=0;// .field private mStartDelaySet:Z
a=0;// 
a=0;// .field private final mView:Ljava/lang/ref/WeakReference;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/ref/WeakReference",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 212
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/ViewPropertyAnimator;-><init>()V
a=0;// 
a=0;//     .line 53
a=0;//     #p0=(Reference,Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;);
a=0;//     iput-boolean v2, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mDurationSet:Z
a=0;// 
a=0;//     .line 60
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mStartDelay:J
a=0;// 
a=0;//     .line 66
a=0;//     iput-boolean v2, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mStartDelaySet:Z
a=0;// 
a=0;//     .line 79
a=0;//     iput-boolean v2, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mInterpolatorSet:Z
a=0;// 
a=0;//     .line 84
a=0;//     iput-object v3, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mListener:Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 91
a=0;//     new-instance v0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$AnimatorEventListener;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$AnimatorEventListener;);
a=0;//     invoke-direct {v0, p0, v3}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$AnimatorEventListener;-><init>(Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$AnimatorEventListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$AnimatorEventListener;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorEventListener:Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$AnimatorEventListener;
a=0;// 
a=0;//     .line 101
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mPendingAnimations:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 130
a=0;//     new-instance v0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$1;-><init>(Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$1;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimationStarter:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 187
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorMap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 213
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 214
a=0;//     invoke-static {p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     .line 215
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 435
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->startAnimation()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;)Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mListener:Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/Animator$AnimatorListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;)Ljava/util/HashMap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;Lcom/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mListener:Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;)Ljava/lang/ref/WeakReference;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;IF)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 541
a=0;//     invoke-direct {p0, p1, p2}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->setValue(IF)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private animateProperty(IF)V
a=0;//     .locals 2
a=0;//     .param p1, "constantName"    # I
a=0;//     .param p2, "toValue"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 474
a=0;//     invoke-direct {p0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->getValue(I)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 475
a=0;//     .local v1, "fromValue":F
a=0;//     #v1=(Float);
a=0;//     sub-float v0, p2, v1
a=0;// 
a=0;//     .line 476
a=0;//     .local v0, "deltaValue":F
a=0;//     #v0=(Float);
a=0;//     invoke-direct {p0, p1, v1, v0}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IFF)V
a=0;// 
a=0;//     .line 477
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private animatePropertyBy(IF)V
a=0;//     .locals 1
a=0;//     .param p1, "constantName"    # I
a=0;//     .param p2, "byValue"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 488
a=0;//     invoke-direct {p0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->getValue(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 489
a=0;//     .local v0, "fromValue":F
a=0;//     #v0=(Float);
a=0;//     invoke-direct {p0, p1, v0, p2}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IFF)V
a=0;// 
a=0;//     .line 490
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private animatePropertyBy(IFF)V
a=0;//     .locals 8
a=0;//     .param p1, "constantName"    # I
a=0;//     .param p2, "startValue"    # F
a=0;//     .param p3, "byValue"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 502
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v6}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_1
a=0;// 
a=0;//     .line 503
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 504
a=0;//     .local v1, "animatorToCancel":Lcom/nineoldandroids/animation/Animator;
a=0;//     #v1=(Null);
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v6}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 505
a=0;//     .local v0, "animatorSet":Ljava/util/Set;, "Ljava/util/Set<Lcom/nineoldandroids/animation/Animator;>;"
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     .line 519
a=0;//     :goto_0
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/Animator;);v7=(Integer);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 520
a=0;//     invoke-virtual {v1}, Lcom/nineoldandroids/animation/Animator;->cancel()V
a=0;// 
a=0;//     .line 524
a=0;//     .end local v0    # "animatorSet":Ljava/util/Set;, "Ljava/util/Set<Lcom/nineoldandroids/animation/Animator;>;"
a=0;//     .end local v1    # "animatorToCancel":Lcom/nineoldandroids/animation/Animator;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     new-instance v3, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;);
a=0;//     invoke-direct {v3, p1, p2, p3}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;-><init>(IFF)V
a=0;// 
a=0;//     .line 525
a=0;//     .local v3, "nameValuePair":Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;
a=0;//     #v3=(Reference,Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;);
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mPendingAnimations:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 526
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Landroid/view/View;
a=0;// 
a=0;//     .line 527
a=0;//     .local v5, "v":Landroid/view/View;
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 528
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimationStarter:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 529
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimationStarter:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 531
a=0;//     :cond_2
a=0;//     return-void
a=0;// 
a=0;//     .line 505
a=0;//     .end local v3    # "nameValuePair":Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;
a=0;//     .end local v5    # "v":Landroid/view/View;
a=0;//     .restart local v0    # "animatorSet":Ljava/util/Set;, "Ljava/util/Set<Lcom/nineoldandroids/animation/Animator;>;"
a=0;//     .restart local v1    # "animatorToCancel":Lcom/nineoldandroids/animation/Animator;
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/util/Set;);v1=(Null);v3=(Uninit);v5=(Uninit);v7=(Boolean);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .line 506
a=0;//     .local v4, "runningAnim":Lcom/nineoldandroids/animation/Animator;
a=0;//     iget-object v7, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v7, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;
a=0;// 
a=0;//     .line 507
a=0;//     .local v2, "bundle":Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;
a=0;//     invoke-virtual {v2, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;->cancel(I)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 512
a=0;//     iget v7, v2, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;->mPropertyMask:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 514
a=0;//     move-object v1, v4
a=0;// 
a=0;//     .line 515
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/Animator;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getValue(I)F
a=0;//     .locals 1
a=0;//     .param p1, "propertyConstant"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 595
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     .line 627
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     .line 598
a=0;//     :sswitch_0
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getTranslationX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 601
a=0;//     :sswitch_1
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getTranslationY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 604
a=0;//     :sswitch_2
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getRotation()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 607
a=0;//     :sswitch_3
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getRotationX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 610
a=0;//     :sswitch_4
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getRotationY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 613
a=0;//     :sswitch_5
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getScaleX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 616
a=0;//     :sswitch_6
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getScaleY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 619
a=0;//     :sswitch_7
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 622
a=0;//     :sswitch_8
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 625
a=0;//     :sswitch_9
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getAlpha()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 595
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1 -> :sswitch_0
a=0;//         0x2 -> :sswitch_1
a=0;//         0x4 -> :sswitch_5
a=0;//         0x8 -> :sswitch_6
a=0;//         0x10 -> :sswitch_2
a=0;//         0x20 -> :sswitch_3
a=0;//         0x40 -> :sswitch_4
a=0;//         0x80 -> :sswitch_7
a=0;//         0x100 -> :sswitch_8
a=0;//         0x200 -> :sswitch_9
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private setValue(IF)V
a=0;//     .locals 1
a=0;//     .param p1, "propertyConstant"    # I
a=0;//     .param p2, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 543
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     .line 585
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 546
a=0;//     :sswitch_0
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setTranslationX(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 550
a=0;//     :sswitch_1
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setTranslationY(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 554
a=0;//     :sswitch_2
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setRotation(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 558
a=0;//     :sswitch_3
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setRotationX(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 562
a=0;//     :sswitch_4
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setRotationY(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 566
a=0;//     :sswitch_5
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setScaleX(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 570
a=0;//     :sswitch_6
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setScaleY(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 574
a=0;//     :sswitch_7
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setX(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 578
a=0;//     :sswitch_8
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setY(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 582
a=0;//     :sswitch_9
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setAlpha(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 543
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1 -> :sswitch_0
a=0;//         0x2 -> :sswitch_1
a=0;//         0x4 -> :sswitch_5
a=0;//         0x8 -> :sswitch_6
a=0;//         0x10 -> :sswitch_2
a=0;//         0x20 -> :sswitch_3
a=0;//         0x40 -> :sswitch_4
a=0;//         0x80 -> :sswitch_7
a=0;//         0x100 -> :sswitch_8
a=0;//         0x200 -> :sswitch_9
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private startAnimation()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 436
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     new-array v6, v6, [F
a=0;// 
a=0;//     #v6=(Reference,[F);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/high16 v8, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     aput v8, v6, v7
a=0;// 
a=0;//     invoke-static {v6}, Lcom/nineoldandroids/animation/ValueAnimator;->ofFloat([F)Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 438
a=0;//     .local v0, "animator":Lcom/nineoldandroids/animation/ValueAnimator;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/ValueAnimator;);
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mPendingAnimations:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 439
a=0;//     .local v2, "nameValueList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;>;"
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mPendingAnimations:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 440
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 441
a=0;//     .local v5, "propertyMask":I
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 442
a=0;//     .local v4, "propertyCount":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);v5=(Integer);v6=(Conflicted);
a=0;//     if-lt v1, v4, :cond_3
a=0;// 
a=0;//     .line 446
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/HashMap;);
a=0;//     new-instance v7, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;);
a=0;//     invoke-direct {v7, v5, v2}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;-><init>(ILjava/util/ArrayList;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;);
a=0;//     invoke-virtual {v6, v0, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 447
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorEventListener:Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$AnimatorEventListener;
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Lcom/nineoldandroids/animation/ValueAnimator;->addUpdateListener(Lcom/nineoldandroids/animation/ValueAnimator$AnimatorUpdateListener;)V
a=0;// 
a=0;//     .line 448
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorEventListener:Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$AnimatorEventListener;
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Lcom/nineoldandroids/animation/ValueAnimator;->addListener(Lcom/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 449
a=0;//     iget-boolean v6, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mStartDelaySet:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 450
a=0;//     iget-wide v6, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mStartDelay:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v0, v6, v7}, Lcom/nineoldandroids/animation/ValueAnimator;->setStartDelay(J)V
a=0;// 
a=0;//     .line 452
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-boolean v6, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mDurationSet:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 453
a=0;//     iget-wide v6, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mDuration:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v0, v6, v7}, Lcom/nineoldandroids/animation/ValueAnimator;->setDuration(J)Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     .line 455
a=0;//     :cond_1
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-boolean v6, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mInterpolatorSet:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 456
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-virtual {v0, v6}, Lcom/nineoldandroids/animation/ValueAnimator;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 458
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/animation/ValueAnimator;->start()V
a=0;// 
a=0;//     .line 459
a=0;//     return-void
a=0;// 
a=0;//     .line 443
a=0;//     :cond_3
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;
a=0;// 
a=0;//     .line 444
a=0;//     .local v3, "nameValuesHolder":Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;
a=0;//     iget v6, v3, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;->mNameConstant:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     or-int/2addr v5, v6
a=0;// 
a=0;//     .line 442
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public alpha(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 420
a=0;//     const/16 v0, 0x200
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V
a=0;// 
a=0;//     .line 421
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public alphaBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 426
a=0;//     const/16 v0, 0x200
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V
a=0;// 
a=0;//     .line 427
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public cancel()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 295
a=0;//     iget-object v4, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v4}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_0
a=0;// 
a=0;//     .line 297
a=0;//     iget-object v4, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v4}, Ljava/util/HashMap;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/HashMap;
a=0;// 
a=0;//     .line 298
a=0;//     .local v1, "mAnimatorMapCopy":Ljava/util/HashMap;, "Ljava/util/HashMap<Lcom/nineoldandroids/animation/Animator;Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;>;"
a=0;//     invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 299
a=0;//     .local v0, "animatorSet":Ljava/util/Set;, "Ljava/util/Set<Lcom/nineoldandroids/animation/Animator;>;"
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     .line 303
a=0;//     .end local v0    # "animatorSet":Ljava/util/Set;, "Ljava/util/Set<Lcom/nineoldandroids/animation/Animator;>;"
a=0;//     .end local v1    # "mAnimatorMapCopy":Ljava/util/HashMap;, "Ljava/util/HashMap<Lcom/nineoldandroids/animation/Animator;Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;>;"
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mPendingAnimations:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 304
a=0;//     iget-object v4, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/view/View;
a=0;// 
a=0;//     .line 305
a=0;//     .local v3, "v":Landroid/view/View;
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 306
a=0;//     iget-object v4, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimationStarter:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 308
a=0;//     :cond_1
a=0;//     return-void
a=0;// 
a=0;//     .line 299
a=0;//     .end local v3    # "v":Landroid/view/View;
a=0;//     .restart local v0    # "animatorSet":Ljava/util/Set;, "Ljava/util/Set<Lcom/nineoldandroids/animation/Animator;>;"
a=0;//     .restart local v1    # "mAnimatorMapCopy":Ljava/util/HashMap;, "Ljava/util/HashMap<Lcom/nineoldandroids/animation/Animator;Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;>;"
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/util/Set;);v1=(Reference,Ljava/util/HashMap;);v3=(Uninit);v5=(Boolean);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .line 300
a=0;//     .local v2, "runningAnim":Lcom/nineoldandroids/animation/Animator;
a=0;//     invoke-virtual {v2}, Lcom/nineoldandroids/animation/Animator;->cancel()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDuration()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     iget-boolean v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mDurationSet:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 245
a=0;//     iget-wide v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mDuration:J
a=0;// 
a=0;//     .line 249
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/ValueAnimator;);
a=0;//     invoke-direct {v0}, Lcom/nineoldandroids/animation/ValueAnimator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/ValueAnimator;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/animation/ValueAnimator;->getDuration()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getStartDelay()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 255
a=0;//     iget-boolean v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mStartDelaySet:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 256
a=0;//     iget-wide v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mStartDelay:J
a=0;// 
a=0;//     .line 260
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public rotation(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 336
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V
a=0;// 
a=0;//     .line 337
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public rotationBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 342
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V
a=0;// 
a=0;//     .line 343
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public rotationX(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 348
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V
a=0;// 
a=0;//     .line 349
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public rotationXBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 354
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V
a=0;// 
a=0;//     .line 355
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public rotationY(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 360
a=0;//     const/16 v0, 0x40
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V
a=0;// 
a=0;//     .line 361
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public rotationYBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 366
a=0;//     const/16 v0, 0x40
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V
a=0;// 
a=0;//     .line 367
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public scaleX(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 396
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V
a=0;// 
a=0;//     .line 397
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public scaleXBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 402
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V
a=0;// 
a=0;//     .line 403
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public scaleY(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 408
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V
a=0;// 
a=0;//     .line 409
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public scaleYBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 414
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V
a=0;// 
a=0;//     .line 415
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setDuration(J)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 3
a=0;//     .param p1, "duration"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 227
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Animators cannot have negative duration: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 228
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 227
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 230
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(LongHi);v2=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mDurationSet:Z
a=0;// 
a=0;//     .line 231
a=0;//     iput-wide p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mDuration:J
a=0;// 
a=0;//     .line 232
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setInterpolator(Landroid/view/animation/Interpolator;)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "interpolator"    # Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 277
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mInterpolatorSet:Z
a=0;// 
a=0;//     .line 278
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 279
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setListener(Lcom/nineoldandroids/animation/Animator$AnimatorListener;)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 284
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mListener:Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 285
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setStartDelay(J)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 3
a=0;//     .param p1, "startDelay"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 266
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 267
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Animators cannot have negative duration: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 268
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 267
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 270
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(LongHi);v2=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mStartDelaySet:Z
a=0;// 
a=0;//     .line 271
a=0;//     iput-wide p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mStartDelay:J
a=0;// 
a=0;//     .line 272
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public start()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 290
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->startAnimation()V
a=0;// 
a=0;//     .line 291
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public translationX(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 372
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V
a=0;// 
a=0;//     .line 373
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public translationXBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 378
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V
a=0;// 
a=0;//     .line 379
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public translationY(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 384
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V
a=0;// 
a=0;//     .line 385
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public translationYBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 390
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V
a=0;// 
a=0;//     .line 391
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public x(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 312
a=0;//     const/16 v0, 0x80
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V
a=0;// 
a=0;//     .line 313
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public xBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 318
a=0;//     const/16 v0, 0x80
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V
a=0;// 
a=0;//     .line 319
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public y(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     const/16 v0, 0x100
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V
a=0;// 
a=0;//     .line 325
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public yBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 330
a=0;//     const/16 v0, 0x100
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V
a=0;// 
a=0;//     .line 331
a=0;//     return-object p0
a=0;// .end method
}}
