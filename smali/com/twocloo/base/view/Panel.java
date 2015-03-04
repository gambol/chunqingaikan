package com.twocloo.base.view; class Panel { void a() { int a;
a=0;// .class public Lcom/twocloo/base/view/Panel;
a=0;// .super Landroid/widget/LinearLayout;
a=0;// .source "Panel.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/base/view/Panel$OnPanelListener;,
a=0;//         Lcom/twocloo/base/view/Panel$PanelOnGestureListener;,
a=0;//         Lcom/twocloo/base/view/Panel$State;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final BOTTOM:I = 0x1
a=0;// 
a=0;// .field public static final LEFT:I = 0x2
a=0;// 
a=0;// .field public static final RIGHT:I = 0x3
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "Panel"
a=0;// 
a=0;// .field public static final TOP:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private animationListener:Landroid/view/animation/Animation$AnimationListener;
a=0;// 
a=0;// .field private mClosedHandle:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mContent:Landroid/view/View;
a=0;// 
a=0;// .field private mContentHeight:I
a=0;// 
a=0;// .field private mContentWidth:I
a=0;// 
a=0;// .field private mDuration:I
a=0;// 
a=0;// .field private mGestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;// .field private mGestureListener:Lcom/twocloo/base/view/Panel$PanelOnGestureListener;
a=0;// 
a=0;// .field private mHandle:Landroid/view/View;
a=0;// 
a=0;// .field private mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field private mIsShrinking:Z
a=0;// 
a=0;// .field private mLinearFlying:Z
a=0;// 
a=0;// .field private mOpenedHandle:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mOrientation:I
a=0;// 
a=0;// .field private mPosition:I
a=0;// 
a=0;// .field private mState:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;// .field private mTrackX:F
a=0;// 
a=0;// .field private mTrackY:F
a=0;// 
a=0;// .field private mVelocity:F
a=0;// 
a=0;// .field private panelListener:Lcom/twocloo/base/view/Panel$OnPanelListener;
a=0;// 
a=0;// .field startAnimation:Ljava/lang/Runnable;
a=0;// 
a=0;// .field touchListener:Landroid/view/View$OnTouchListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 72
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 225
a=0;//     #p0=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     new-instance v3, Lcom/twocloo/base/view/Panel$1;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/base/view/Panel$1;);
a=0;//     invoke-direct {v3, p0}, Lcom/twocloo/base/view/Panel$1;-><init>(Lcom/twocloo/base/view/Panel;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/view/Panel$1;);
a=0;//     iput-object v3, p0, Lcom/twocloo/base/view/Panel;->touchListener:Landroid/view/View$OnTouchListener;
a=0;// 
a=0;//     .line 270
a=0;//     new-instance v3, Lcom/twocloo/base/view/Panel$2;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/base/view/Panel$2;);
a=0;//     invoke-direct {v3, p0}, Lcom/twocloo/base/view/Panel$2;-><init>(Lcom/twocloo/base/view/Panel;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/view/Panel$2;);
a=0;//     iput-object v3, p0, Lcom/twocloo/base/view/Panel;->startAnimation:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 352
a=0;//     new-instance v3, Lcom/twocloo/base/view/Panel$3;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/base/view/Panel$3;);
a=0;//     invoke-direct {v3, p0}, Lcom/twocloo/base/view/Panel$3;-><init>(Lcom/twocloo/base/view/Panel;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/view/Panel$3;);
a=0;//     iput-object v3, p0, Lcom/twocloo/base/view/Panel;->animationListener:Landroid/view/animation/Animation$AnimationListener;
a=0;// 
a=0;//     .line 73
a=0;//     sget-object v3, Lcom/twocloo/base/R$styleable;->Panel:[I
a=0;// 
a=0;//     invoke-virtual {p1, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 74
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/16 v3, 0x2ee
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getInteger(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/twocloo/base/view/Panel;->mDuration:I
a=0;// 
a=0;//     .line 75
a=0;//     invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getInteger(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iput v3, p0, Lcom/twocloo/base/view/Panel;->mPosition:I
a=0;// 
a=0;//     .line 76
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     iput-boolean v3, p0, Lcom/twocloo/base/view/Panel;->mLinearFlying:Z
a=0;// 
a=0;//     .line 77
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v3, p0, Lcom/twocloo/base/view/Panel;->mOpenedHandle:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 78
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v3, p0, Lcom/twocloo/base/view/Panel;->mClosedHandle:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 79
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 80
a=0;//     iget v3, p0, Lcom/twocloo/base/view/Panel;->mPosition:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget v3, p0, Lcom/twocloo/base/view/Panel;->mPosition:I
a=0;// 
a=0;//     if-ne v3, v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     iput v1, p0, Lcom/twocloo/base/view/Panel;->mOrientation:I
a=0;// 
a=0;//     .line 81
a=0;//     iget v1, p0, Lcom/twocloo/base/view/Panel;->mOrientation:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/base/view/Panel;->setOrientation(I)V
a=0;// 
a=0;//     .line 82
a=0;//     sget-object v1, Lcom/twocloo/base/view/Panel$State;->READY:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/view/Panel$State;);
a=0;//     iput-object v1, p0, Lcom/twocloo/base/view/Panel;->mState:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     .line 83
a=0;//     new-instance v1, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/base/view/Panel$PanelOnGestureListener;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;-><init>(Lcom/twocloo/base/view/Panel;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/view/Panel$PanelOnGestureListener;);
a=0;//     iput-object v1, p0, Lcom/twocloo/base/view/Panel;->mGestureListener:Lcom/twocloo/base/view/Panel$PanelOnGestureListener;
a=0;// 
a=0;//     .line 84
a=0;//     new-instance v1, Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/GestureDetector;);
a=0;//     iget-object v3, p0, Lcom/twocloo/base/view/Panel;->mGestureListener:Lcom/twocloo/base/view/Panel$PanelOnGestureListener;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/view/Panel$PanelOnGestureListener;);
a=0;//     invoke-direct {v1, v3}, Landroid/view/GestureDetector;-><init>(Landroid/view/GestureDetector$OnGestureListener;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/GestureDetector;);
a=0;//     iput-object v1, p0, Lcom/twocloo/base/view/Panel;->mGestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v1, p0, Lcom/twocloo/base/view/Panel;->mGestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(One);v3=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 80
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/base/view/Panel;)Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/base/view/Panel;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     iget v0, p0, Lcom/twocloo/base/view/Panel;->mOrientation:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/twocloo/base/view/Panel;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-boolean v0, p0, Lcom/twocloo/base/view/Panel;->mIsShrinking:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$11(Lcom/twocloo/base/view/Panel;)F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iget v0, p0, Lcom/twocloo/base/view/Panel;->mTrackY:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$12(Lcom/twocloo/base/view/Panel;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     iget-boolean v0, p0, Lcom/twocloo/base/view/Panel;->mLinearFlying:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$13(Lcom/twocloo/base/view/Panel;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     iget v0, p0, Lcom/twocloo/base/view/Panel;->mDuration:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$14(Lcom/twocloo/base/view/Panel;)F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     iget v0, p0, Lcom/twocloo/base/view/Panel;->mTrackX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$15(Lcom/twocloo/base/view/Panel;F)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iput p1, p0, Lcom/twocloo/base/view/Panel;->mTrackY:F
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$16(Lcom/twocloo/base/view/Panel;F)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     iput p1, p0, Lcom/twocloo/base/view/Panel;->mTrackX:F
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$17(Lcom/twocloo/base/view/Panel;Lcom/twocloo/base/view/Panel$State;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iput-object p1, p0, Lcom/twocloo/base/view/Panel;->mState:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$18(Lcom/twocloo/base/view/Panel;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 369
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/view/Panel;->postProcess()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$19(Lcom/twocloo/base/view/Panel;)Landroid/view/animation/Animation$AnimationListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 352
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->animationListener:Landroid/view/animation/Animation$AnimationListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation$AnimationListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/base/view/Panel;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget v0, p0, Lcom/twocloo/base/view/Panel;->mPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$20(Lcom/twocloo/base/view/Panel;)Landroid/view/animation/Interpolator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$21(Lcom/twocloo/base/view/Panel;F)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iput p1, p0, Lcom/twocloo/base/view/Panel;->mVelocity:F
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$22(Lcom/twocloo/base/view/Panel;FII)F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/twocloo/base/view/Panel;->ensureRange(FII)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/base/view/Panel;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     iget v0, p0, Lcom/twocloo/base/view/Panel;->mContentWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/base/view/Panel;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget v0, p0, Lcom/twocloo/base/view/Panel;->mContentHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/base/view/Panel;)Lcom/twocloo/base/view/Panel$PanelOnGestureListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mGestureListener:Lcom/twocloo/base/view/Panel$PanelOnGestureListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/view/Panel$PanelOnGestureListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/base/view/Panel;)Landroid/view/GestureDetector;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mGestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/base/view/Panel;)Lcom/twocloo/base/view/Panel$State;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mState:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/view/Panel$State;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/twocloo/base/view/Panel;)F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget v0, p0, Lcom/twocloo/base/view/Panel;->mVelocity:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/twocloo/base/view/Panel;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iput-boolean p1, p0, Lcom/twocloo/base/view/Panel;->mIsShrinking:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private ensureRange(FII)F
a=0;//     .locals 1
a=0;//     .param p1, "v"    # F
a=0;//     .param p2, "min"    # I
a=0;//     .param p3, "max"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     int-to-float v0, p2
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 221
a=0;//     int-to-float v0, p3
a=0;// 
a=0;//     invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 222
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method private postProcess()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 370
a=0;//     iget-boolean v0, p0, Lcom/twocloo/base/view/Panel;->mIsShrinking:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mClosedHandle:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 371
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mHandle:Landroid/view/View;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/base/view/Panel;->mClosedHandle:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 376
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->panelListener:Lcom/twocloo/base/view/Panel$OnPanelListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/view/Panel$OnPanelListener;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 377
a=0;//     iget-boolean v0, p0, Lcom/twocloo/base/view/Panel;->mIsShrinking:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 378
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->panelListener:Lcom/twocloo/base/view/Panel$OnPanelListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/view/Panel$OnPanelListener;);
a=0;//     invoke-interface {v0, p0}, Lcom/twocloo/base/view/Panel$OnPanelListener;->onPanelClosed(Lcom/twocloo/base/view/Panel;)V
a=0;// 
a=0;//     .line 383
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 372
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Uninit);
a=0;//     iget-boolean v0, p0, Lcom/twocloo/base/view/Panel;->mIsShrinking:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mOpenedHandle:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 373
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mHandle:Landroid/view/View;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/base/view/Panel;->mOpenedHandle:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 380
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->panelListener:Lcom/twocloo/base/view/Panel$OnPanelListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/view/Panel$OnPanelListener;);
a=0;//     invoke-interface {v0, p0}, Lcom/twocloo/base/view/Panel$OnPanelListener;->onPanelOpened(Lcom/twocloo/base/view/Panel;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected dispatchDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 5
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 202
a=0;//     #v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/base/view/Panel;->mState:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/view/Panel$State;);
a=0;//     sget-object v2, Lcom/twocloo/base/view/Panel$State;->ABOUT_TO_ANIMATE:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/view/Panel$State;);
a=0;//     if-ne v1, v2, :cond_2
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/twocloo/base/view/Panel;->mIsShrinking:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 203
a=0;//     iget v1, p0, Lcom/twocloo/base/view/Panel;->mOrientation:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v4, :cond_5
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloo/base/view/Panel;->mContentHeight:I
a=0;// 
a=0;//     .line 204
a=0;//     .local v0, "delta":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/twocloo/base/view/Panel;->mPosition:I
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/base/view/Panel;->mPosition:I
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 205
a=0;//     :cond_0
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     .line 207
a=0;//     :cond_1
a=0;//     iget v1, p0, Lcom/twocloo/base/view/Panel;->mOrientation:I
a=0;// 
a=0;//     if-ne v1, v4, :cond_6
a=0;// 
a=0;//     .line 208
a=0;//     int-to-float v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1, v3, v1}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 213
a=0;//     .end local v0    # "delta":I
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/base/view/Panel;->mState:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/view/Panel$State;);
a=0;//     sget-object v2, Lcom/twocloo/base/view/Panel$State;->TRACKING:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/view/Panel$State;);
a=0;//     if-eq v1, v2, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/base/view/Panel;->mState:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     sget-object v2, Lcom/twocloo/base/view/Panel$State;->FLYING:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     if-ne v1, v2, :cond_4
a=0;// 
a=0;//     .line 214
a=0;//     :cond_3
a=0;//     iget v1, p0, Lcom/twocloo/base/view/Panel;->mTrackX:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/twocloo/base/view/Panel;->mTrackY:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 216
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/widget/LinearLayout;->dispatchDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 217
a=0;//     return-void
a=0;// 
a=0;//     .line 203
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Reference,Lcom/twocloo/base/view/Panel$State;);
a=0;//     iget v0, p0, Lcom/twocloo/base/view/Panel;->mContentWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 210
a=0;//     .restart local v0    # "delta":I
a=0;//     :cond_6
a=0;//     #v2=(PosByte);
a=0;//     int-to-float v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1, v1, v3}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getContent()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getHandle()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mHandle:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isOpen()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onFinishInflate()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V
a=0;// 
a=0;//     .line 161
a=0;//     sget v0, Lcom/twocloo/base/R$id;->panelHandle:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/base/view/Panel;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/base/view/Panel;->mHandle:Landroid/view/View;
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mHandle:Landroid/view/View;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 163
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v1, "Your Panel must have a View whose id attribute is \'R.id.panelHandle\'"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 165
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mHandle:Landroid/view/View;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/base/view/Panel;->touchListener:Landroid/view/View$OnTouchListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View$OnTouchListener;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
a=0;// 
a=0;//     .line 167
a=0;//     sget v0, Lcom/twocloo/base/R$id;->panelContent:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/base/view/Panel;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/base/view/Panel;->mContent:Landroid/view/View;
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mContent:Landroid/view/View;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 169
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v1, "Your Panel must have a View whose id attribute is \'R.id.panelContent\'"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 173
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mHandle:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/base/view/Panel;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mContent:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/base/view/Panel;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 175
a=0;//     iget v0, p0, Lcom/twocloo/base/view/Panel;->mPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloo/base/view/Panel;->mPosition:I
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     .line 176
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/base/view/Panel;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mHandle:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/base/view/Panel;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 183
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mClosedHandle:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mHandle:Landroid/view/View;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/base/view/Panel;->mClosedHandle:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 186
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mContent:Landroid/view/View;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 187
a=0;//     return-void
a=0;// 
a=0;//     .line 179
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mHandle:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/base/view/Panel;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mContent:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/base/view/Panel;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 1
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "l"    # I
a=0;//     .param p3, "t"    # I
a=0;//     .param p4, "r"    # I
a=0;//     .param p5, "b"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 191
a=0;//     invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/base/view/Panel;->mContentWidth:I
a=0;// 
a=0;//     .line 193
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/base/view/Panel;->mContentHeight:I
a=0;// 
a=0;//     .line 194
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;//     .locals 0
a=0;//     .param p1, "i"    # Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     iput-object p1, p0, Lcom/twocloo/base/view/Panel;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 122
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnPanelListener(Lcom/twocloo/base/view/Panel$OnPanelListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "onPanelListener"    # Lcom/twocloo/base/view/Panel$OnPanelListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     iput-object p1, p0, Lcom/twocloo/base/view/Panel;->panelListener:Lcom/twocloo/base/view/Panel$OnPanelListener;
a=0;// 
a=0;//     .line 95
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOpen(ZZ)V
a=0;//     .locals 2
a=0;//     .param p1, "open"    # Z
a=0;//     .param p2, "animate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 132
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/view/Panel;->isOpen()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     xor-int/2addr v0, p1
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 133
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     iput-boolean v0, p0, Lcom/twocloo/base/view/Panel;->mIsShrinking:Z
a=0;// 
a=0;//     .line 134
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     .line 135
a=0;//     sget-object v0, Lcom/twocloo/base/view/Panel$State;->ABOUT_TO_ANIMATE:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/view/Panel$State;);
a=0;//     iput-object v0, p0, Lcom/twocloo/base/view/Panel;->mState:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     .line 136
a=0;//     iget-boolean v0, p0, Lcom/twocloo/base/view/Panel;->mIsShrinking:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 139
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 141
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->startAnimation:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/base/view/Panel;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 147
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(PosByte);
a=0;//     return-void
a=0;// 
a=0;//     .line 133
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 143
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz p1, :cond_4
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 144
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/view/Panel;->postProcess()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 143
a=0;//     :cond_4
a=0;//     #v1=(Null);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_2
a=0;// .end method
}}
