package com.twocloo.com.cn.view; class FlingGallery { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// .super Landroid/widget/FrameLayout;
a=0;// .source "FlingGallery.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;,
a=0;//         Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;,
a=0;//         Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private listeners:Ljava/util/Set;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Set",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/view/OnGalleryChangeListener;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mAdapter:Landroid/widget/Adapter;
a=0;// 
a=0;// .field private mAnimation:Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;
a=0;// 
a=0;// .field private mAnimationDuration:I
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mCurrentOffset:F
a=0;// 
a=0;// .field private mCurrentPosition:I
a=0;// 
a=0;// .field private mCurrentViewNumber:I
a=0;// 
a=0;// .field private mDecelerateInterpolater:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field private mFlingDirection:I
a=0;// 
a=0;// .field private mGalleryWidth:I
a=0;// 
a=0;// .field private mGestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;// .field private mIsDragging:Z
a=0;// 
a=0;// .field private mIsGalleryCircular:Z
a=0;// 
a=0;// .field private mIsTouched:Z
a=0;// 
a=0;// .field private mScrollTimestamp:J
a=0;// 
a=0;// .field private mSnapBorderRatio:F
a=0;// 
a=0;// .field private mViewPaddingWidth:I
a=0;// 
a=0;// .field private mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;// .field private final swipe_max_off_path:I
a=0;// 
a=0;// .field private final swipe_min_distance:I
a=0;// 
a=0;// .field private final swipe_threshold_veloicty:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 6
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/16 v1, 0xfa
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 49
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 22
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     const/16 v0, 0x78
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->swipe_min_distance:I
a=0;// 
a=0;//     .line 23
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->swipe_max_off_path:I
a=0;// 
a=0;//     .line 24
a=0;//     const/16 v0, 0x190
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->swipe_threshold_veloicty:I
a=0;// 
a=0;//     .line 26
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViewPaddingWidth:I
a=0;// 
a=0;//     .line 27
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mAnimationDuration:I
a=0;// 
a=0;//     .line 28
a=0;//     const/high16 v0, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mSnapBorderRatio:F
a=0;// 
a=0;//     .line 29
a=0;//     iput-boolean v2, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mIsGalleryCircular:Z
a=0;// 
a=0;//     .line 31
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mGalleryWidth:I
a=0;// 
a=0;//     .line 32
a=0;//     iput-boolean v2, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mIsTouched:Z
a=0;// 
a=0;//     .line 33
a=0;//     iput-boolean v2, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mIsDragging:Z
a=0;// 
a=0;//     .line 34
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentOffset:F
a=0;// 
a=0;//     .line 35
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mScrollTimestamp:J
a=0;// 
a=0;//     .line 36
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mFlingDirection:I
a=0;// 
a=0;//     .line 37
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentPosition:I
a=0;// 
a=0;//     .line 38
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     .line 51
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->listeners:Ljava/util/Set;
a=0;// 
a=0;//     .line 53
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 54
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mAdapter:Landroid/widget/Adapter;
a=0;// 
a=0;//     .line 56
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     invoke-direct {v1, p0, v2, p0}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;-><init>(Lcom/twocloo/com/cn/view/FlingGallery;ILandroid/widget/FrameLayout;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     invoke-direct {v1, p0, v3, p0}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;-><init>(Lcom/twocloo/com/cn/view/FlingGallery;ILandroid/widget/FrameLayout;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     aput-object v1, v0, v3
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     invoke-direct {v1, p0, v4, p0}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;-><init>(Lcom/twocloo/com/cn/view/FlingGallery;ILandroid/widget/FrameLayout;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     aput-object v1, v0, v4
a=0;// 
a=0;//     .line 61
a=0;//     new-instance v0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;-><init>(Lcom/twocloo/com/cn/view/FlingGallery;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mAnimation:Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;
a=0;// 
a=0;//     .line 62
a=0;//     new-instance v0, Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/GestureDetector;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;);
a=0;//     invoke-direct {v1, p0, v5}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;-><init>(Lcom/twocloo/com/cn/view/FlingGallery;Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;);
a=0;//     invoke-direct {v0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/view/GestureDetector$OnGestureListener;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mGestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     .line 63
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 64
a=0;//     const v1, 0x10a0006
a=0;// 
a=0;//     .line 63
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mDecelerateInterpolater:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 65
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private NotifyGalleryChange()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->listeners:Ljava/util/Set;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 167
a=0;//     return-void
a=0;// 
a=0;//     .line 163
a=0;//     :cond_0
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/view/OnGalleryChangeListener;
a=0;// 
a=0;//     .line 165
a=0;//     .local v0, "listener":Lcom/twocloo/com/cn/view/OnGalleryChangeListener;
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentPosition:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v0, v2}, Lcom/twocloo/com/cn/view/OnGalleryChangeListener;->onGalleryChange(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/view/FlingGallery;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/view/FlingGallery;)Landroid/widget/Adapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mAdapter:Landroid/widget/Adapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/twocloo/com/cn/view/FlingGallery;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     iput-boolean p1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mIsTouched:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$11(Lcom/twocloo/com/cn/view/FlingGallery;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mFlingDirection:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$12(Lcom/twocloo/com/cn/view/FlingGallery;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     iput-boolean p1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mIsDragging:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$13(Lcom/twocloo/com/cn/view/FlingGallery;J)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     iput-wide p1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mScrollTimestamp:J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$14(Lcom/twocloo/com/cn/view/FlingGallery;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$15(Lcom/twocloo/com/cn/view/FlingGallery;F)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentOffset:F
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$16(Lcom/twocloo/com/cn/view/FlingGallery;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mGalleryWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$17(Lcom/twocloo/com/cn/view/FlingGallery;)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     iget-wide v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mScrollTimestamp:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$18(Lcom/twocloo/com/cn/view/FlingGallery;)F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentOffset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/view/FlingGallery;II)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 214
a=0;//     invoke-direct {p0, p1, p2}, Lcom/twocloo/com/cn/view/FlingGallery;->getViewOffset(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/view/FlingGallery;I)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/view/FlingGallery;->getPrevViewNumber(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/view/FlingGallery;)[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/view/FlingGallery;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mAnimationDuration:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/view/FlingGallery;)Landroid/view/animation/Interpolator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mDecelerateInterpolater:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/com/cn/view/FlingGallery;I)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/view/FlingGallery;->getNextViewNumber(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/twocloo/com/cn/view/FlingGallery;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mIsTouched:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/twocloo/com/cn/view/FlingGallery;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mIsDragging:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private getNextPosition(I)I
a=0;//     .locals 2
a=0;//     .param p1, "relativePosition"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     add-int/lit8 v0, p1, 0x1
a=0;// 
a=0;//     .line 147
a=0;//     .local v0, "nextPosition":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->getLastPosition()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_0
a=0;// 
a=0;//     .line 149
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->getLastPosition()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     .line 151
a=0;//     iget-boolean v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mIsGalleryCircular:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 153
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->getFirstPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 156
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->NotifyGalleryChange()V
a=0;// 
a=0;//     .line 157
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private getNextViewNumber(I)I
a=0;//     .locals 1
a=0;//     .param p1, "relativeViewNumber"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(PosByte);
a=0;//     add-int/lit8 v0, p1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getPrevPosition(I)I
a=0;//     .locals 2
a=0;//     .param p1, "relativePosition"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     add-int/lit8 v0, p1, -0x1
a=0;// 
a=0;//     .line 130
a=0;//     .local v0, "prevPosition":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->getFirstPosition()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 132
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->getFirstPosition()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     .line 134
a=0;//     iget-boolean v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mIsGalleryCircular:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 136
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->getLastPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 139
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->NotifyGalleryChange()V
a=0;// 
a=0;//     .line 140
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private getPrevViewNumber(I)I
a=0;//     .locals 1
a=0;//     .param p1, "relativeViewNumber"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     add-int/lit8 v0, p1, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getViewOffset(II)I
a=0;//     .locals 3
a=0;//     .param p1, "viewNumber"    # I
a=0;//     .param p2, "relativeViewNumber"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mGalleryWidth:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViewPaddingWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int v0, v1, v2
a=0;// 
a=0;//     .line 220
a=0;//     .local v0, "offsetWidth":I
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p2}, Lcom/twocloo/com/cn/view/FlingGallery;->getPrevViewNumber(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ne p1, v1, :cond_0
a=0;// 
a=0;//     .line 231
a=0;//     .end local v0    # "offsetWidth":I
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 226
a=0;//     .restart local v0    # "offsetWidth":I
a=0;//     :cond_0
a=0;//     invoke-direct {p0, p2}, Lcom/twocloo/com/cn/view/FlingGallery;->getNextViewNumber(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ne p1, v1, :cond_1
a=0;// 
a=0;//     .line 228
a=0;//     mul-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 231
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addGalleryChangeListener(Lcom/twocloo/com/cn/view/OnGalleryChangeListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Lcom/twocloo/com/cn/view/OnGalleryChangeListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->listeners:Ljava/util/Set;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getFirstPosition()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getGalleryCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mAdapter:Landroid/widget/Adapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mAdapter:Landroid/widget/Adapter;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getLastPosition()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->getGalleryCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->getGalleryCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getMGestureDetector()Landroid/view/GestureDetector;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 670
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mGestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method moveNext()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mFlingDirection:I
a=0;// 
a=0;//     .line 245
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->processGesture()V
a=0;// 
a=0;//     .line 246
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method movePrevious()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 237
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mFlingDirection:I
a=0;// 
a=0;//     .line 238
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->processGesture()V
a=0;// 
a=0;//     .line 239
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onGalleryTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 3
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 270
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mGestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/GestureDetector;);
a=0;//     invoke-virtual {v1, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 272
a=0;//     .local v0, "consumed":Z
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 274
a=0;//     iget-boolean v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mIsTouched:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mIsDragging:Z
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 276
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->processScrollSnap()V
a=0;// 
a=0;//     .line 277
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->processGesture()V
a=0;// 
a=0;//     .line 281
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 251
a=0;//     #v0=(One);
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 265
a=0;//     invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 254
a=0;//     :pswitch_0
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->movePrevious()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 258
a=0;//     :pswitch_1
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->moveNext()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 251
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x15
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 3
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "left"    # I
a=0;//     .param p3, "top"    # I
a=0;//     .param p4, "right"    # I
a=0;//     .param p5, "bottom"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 183
a=0;//     #v2=(Null);
a=0;//     invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V
a=0;// 
a=0;//     .line 186
a=0;//     sub-int v0, p4, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mGalleryWidth:I
a=0;// 
a=0;//     .line 188
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 191
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     aget-object v0, v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v2, v2, v1}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->setOffset(III)V
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v2, v2, v1}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->setOffset(III)V
a=0;// 
a=0;//     .line 193
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v2, v2, v1}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->setOffset(III)V
a=0;// 
a=0;//     .line 195
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method processGesture()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 286
a=0;//     #v5=(Null);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     .line 287
a=0;//     .local v0, "newViewNumber":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 288
a=0;//     .local v2, "reloadViewNumber":I
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 290
a=0;//     .local v1, "reloadPosition":I
a=0;//     #v1=(Null);
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mIsTouched:Z
a=0;// 
a=0;//     .line 291
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mIsDragging:Z
a=0;// 
a=0;//     .line 293
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mFlingDirection:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_1
a=0;// 
a=0;//     .line 295
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentPosition:I
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->getFirstPosition()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-gt v3, v4, :cond_0
a=0;// 
a=0;//     .line 296
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mIsGalleryCircular:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 299
a=0;//     :cond_0
a=0;//     #v3=(Integer);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/twocloo/com/cn/view/FlingGallery;->getPrevViewNumber(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 300
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentPosition:I
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/twocloo/com/cn/view/FlingGallery;->getPrevPosition(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentPosition:I
a=0;// 
a=0;//     .line 301
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/twocloo/com/cn/view/FlingGallery;->getNextViewNumber(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 302
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentPosition:I
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/twocloo/com/cn/view/FlingGallery;->getPrevPosition(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 306
a=0;//     :cond_1
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mFlingDirection:I
a=0;// 
a=0;//     if-gez v3, :cond_3
a=0;// 
a=0;//     .line 308
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentPosition:I
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->getLastPosition()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lt v3, v4, :cond_2
a=0;// 
a=0;//     .line 309
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mIsGalleryCircular:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 312
a=0;//     :cond_2
a=0;//     #v3=(Integer);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/twocloo/com/cn/view/FlingGallery;->getNextViewNumber(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 313
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentPosition:I
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/twocloo/com/cn/view/FlingGallery;->getNextPosition(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentPosition:I
a=0;// 
a=0;//     .line 314
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/twocloo/com/cn/view/FlingGallery;->getPrevViewNumber(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 315
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentPosition:I
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/twocloo/com/cn/view/FlingGallery;->getNextPosition(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 319
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     if-eq v0, v3, :cond_4
a=0;// 
a=0;//     .line 321
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     .line 324
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v3=(Reference,[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     aget-object v3, v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3, v1}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->recycleView(I)V
a=0;// 
a=0;//     .line 328
a=0;//     :cond_4
a=0;//     #v3=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v3=(Reference,[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     aget-object v3, v3, v4
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->requestFocus()V
a=0;// 
a=0;//     .line 331
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mAnimation:Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;->prepareAnimation(I)V
a=0;// 
a=0;//     .line 332
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mAnimation:Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryAnimation;
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/view/FlingGallery;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 335
a=0;//     iput v5, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mFlingDirection:I
a=0;// 
a=0;//     .line 336
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method processScrollSnap()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mGalleryWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mSnapBorderRatio:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-float v1, v3, v4
a=0;// 
a=0;//     .line 342
a=0;//     .local v1, "rollEdgeWidth":F
a=0;//     #v1=(Float);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mGalleryWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     float-to-int v4, v1
a=0;// 
a=0;//     sub-int v2, v3, v4
a=0;// 
a=0;//     .line 343
a=0;//     .local v2, "rollOffset":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v3=(Reference,[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     aget-object v3, v3, v4
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->getCurrentOffset()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 345
a=0;//     .local v0, "currentOffset":I
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit8 v3, v2, -0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gt v0, v3, :cond_0
a=0;// 
a=0;//     .line 348
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mFlingDirection:I
a=0;// 
a=0;//     .line 351
a=0;//     :cond_0
a=0;//     #v3=(Integer);
a=0;//     if-lt v0, v2, :cond_1
a=0;// 
a=0;//     .line 354
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mFlingDirection:I
a=0;// 
a=0;//     .line 356
a=0;//     :cond_1
a=0;//     #v3=(Integer);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Landroid/widget/Adapter;)V
a=0;//     .locals 5
a=0;//     .param p1, "adapter"    # Landroid/widget/Adapter;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 199
a=0;//     #v2=(Null);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mAdapter:Landroid/widget/Adapter;
a=0;// 
a=0;//     .line 200
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentPosition:I
a=0;// 
a=0;//     .line 201
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     aget-object v0, v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentPosition:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->recycleView(I)V
a=0;// 
a=0;//     .line 205
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     aget-object v0, v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentPosition:I
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/com/cn/view/FlingGallery;->getNextPosition(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->recycleView(I)V
a=0;// 
a=0;//     .line 206
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     aget-object v0, v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentPosition:I
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/com/cn/view/FlingGallery;->getPrevPosition(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->recycleView(I)V
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     aget-object v0, v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     invoke-virtual {v0, v2, v2, v1}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->setOffset(III)V
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     aget-object v0, v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     invoke-virtual {v0, v2, v2, v1}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->setOffset(III)V
a=0;// 
a=0;//     .line 211
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     aget-object v0, v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     invoke-virtual {v0, v2, v2, v1}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->setOffset(III)V
a=0;// 
a=0;//     .line 212
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAnimationDuration(I)V
a=0;//     .locals 0
a=0;//     .param p1, "animationDuration"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mAnimationDuration:I
a=0;// 
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setIsGalleryCircular(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "isGalleryCircular"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mIsGalleryCircular:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eq v0, p1, :cond_1
a=0;// 
a=0;//     .line 91
a=0;//     iput-boolean p1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mIsGalleryCircular:Z
a=0;// 
a=0;//     .line 93
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->getFirstPosition()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/com/cn/view/FlingGallery;->getPrevViewNumber(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     .line 98
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentPosition:I
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/com/cn/view/FlingGallery;->getPrevPosition(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->recycleView(I)V
a=0;// 
a=0;//     .line 101
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentPosition:I
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/FlingGallery;->getLastPosition()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViews:[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentViewNumber:I
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/com/cn/view/FlingGallery;->getNextViewNumber(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     .line 106
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mCurrentPosition:I
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/com/cn/view/FlingGallery;->getNextPosition(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->recycleView(I)V
a=0;// 
a=0;//     .line 109
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPaddingWidth(I)V
a=0;//     .locals 0
a=0;//     .param p1, "viewPaddingWidth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mViewPaddingWidth:I
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSnapBorderRatio(F)V
a=0;//     .locals 0
a=0;//     .param p1, "snapBorderRatio"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/FlingGallery;->mSnapBorderRatio:F
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
}}
