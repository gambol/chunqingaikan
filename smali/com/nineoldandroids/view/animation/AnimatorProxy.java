package com.nineoldandroids.view.animation; class AnimatorProxy { void a() { int a;
a=0;// .class public final Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// .super Landroid/view/animation/Animation;
a=0;// .source "AnimatorProxy.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final NEEDS_PROXY:Z
a=0;// 
a=0;// .field private static final PROXIES:Ljava/util/WeakHashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/WeakHashMap",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             "Lcom/nineoldandroids/view/animation/AnimatorProxy;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mAfter:Landroid/graphics/RectF;
a=0;// 
a=0;// .field private mAlpha:F
a=0;// 
a=0;// .field private final mBefore:Landroid/graphics/RectF;
a=0;// 
a=0;// .field private final mCamera:Landroid/graphics/Camera;
a=0;// 
a=0;// .field private mHasPivot:Z
a=0;// 
a=0;// .field private mPivotX:F
a=0;// 
a=0;// .field private mPivotY:F
a=0;// 
a=0;// .field private mRotationX:F
a=0;// 
a=0;// .field private mRotationY:F
a=0;// 
a=0;// .field private mRotationZ:F
a=0;// 
a=0;// .field private mScaleX:F
a=0;// 
a=0;// .field private mScaleY:F
a=0;// 
a=0;// .field private final mTempMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;// .field private mTranslationX:F
a=0;// 
a=0;// .field private mTranslationY:F
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
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     .line 24
a=0;//     new-instance v0, Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/WeakHashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V
a=0;// 
a=0;//     .line 23
a=0;//     #v0=(Reference,Ljava/util/WeakHashMap;);
a=0;//     sput-object v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->PROXIES:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     .line 24
a=0;//     return-void
a=0;// 
a=0;//     .line 21
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 63
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     new-instance v0, Landroid/graphics/Camera;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Camera;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Camera;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Camera;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mCamera:Landroid/graphics/Camera;
a=0;// 
a=0;//     .line 48
a=0;//     iput v1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mAlpha:F
a=0;// 
a=0;//     .line 54
a=0;//     iput v1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mScaleX:F
a=0;// 
a=0;//     .line 55
a=0;//     iput v1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mScaleY:F
a=0;// 
a=0;//     .line 59
a=0;//     new-instance v0, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mBefore:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 60
a=0;//     new-instance v0, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mAfter:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 61
a=0;//     new-instance v0, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mTempMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     .line 64
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setDuration(J)V
a=0;// 
a=0;//     .line 65
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setFillAfter(Z)V
a=0;// 
a=0;//     .line 66
a=0;//     invoke-virtual {p1, p0}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 67
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private computeRect(Landroid/graphics/RectF;Landroid/view/View;)V
a=0;//     .locals 6
a=0;//     .param p1, "r"    # Landroid/graphics/RectF;
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 254
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v3, v4
a=0;// 
a=0;//     .line 255
a=0;//     .local v3, "w":F
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     int-to-float v1, v4
a=0;// 
a=0;//     .line 258
a=0;//     .local v1, "h":F
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1, v5, v5, v3, v1}, Landroid/graphics/RectF;->set(FFFF)V
a=0;// 
a=0;//     .line 260
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mTempMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     .line 261
a=0;//     .local v2, "m":Landroid/graphics/Matrix;
a=0;//     #v2=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V
a=0;// 
a=0;//     .line 262
a=0;//     invoke-direct {p0, v2, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->transformMatrix(Landroid/graphics/Matrix;Landroid/view/View;)V
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v4, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mTempMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v4, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z
a=0;// 
a=0;//     .line 265
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {p1, v4, v5}, Landroid/graphics/RectF;->offset(FF)V
a=0;// 
a=0;//     .line 268
a=0;//     iget v4, p1, Landroid/graphics/RectF;->right:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p1, Landroid/graphics/RectF;->left:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     cmpg-float v4, v4, v5
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gez v4, :cond_0
a=0;// 
a=0;//     .line 269
a=0;//     iget v0, p1, Landroid/graphics/RectF;->right:F
a=0;// 
a=0;//     .line 270
a=0;//     .local v0, "f":F
a=0;//     #v0=(Integer);
a=0;//     iget v4, p1, Landroid/graphics/RectF;->left:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p1, Landroid/graphics/RectF;->right:F
a=0;// 
a=0;//     .line 271
a=0;//     iput v0, p1, Landroid/graphics/RectF;->left:F
a=0;// 
a=0;//     .line 273
a=0;//     .end local v0    # "f":F
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget v4, p1, Landroid/graphics/RectF;->bottom:F
a=0;// 
a=0;//     iget v5, p1, Landroid/graphics/RectF;->top:F
a=0;// 
a=0;//     cmpg-float v4, v4, v5
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gez v4, :cond_1
a=0;// 
a=0;//     .line 274
a=0;//     iget v0, p1, Landroid/graphics/RectF;->top:F
a=0;// 
a=0;//     .line 275
a=0;//     .restart local v0    # "f":F
a=0;//     #v0=(Integer);
a=0;//     iget v4, p1, Landroid/graphics/RectF;->bottom:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p1, Landroid/graphics/RectF;->top:F
a=0;// 
a=0;//     .line 276
a=0;//     iput v0, p1, Landroid/graphics/RectF;->bottom:F
a=0;// 
a=0;//     .line 278
a=0;//     .end local v0    # "f":F
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private invalidateAfterUpdate()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 236
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/view/View;
a=0;// 
a=0;//     .line 237
a=0;//     .local v1, "view":Landroid/view/View;
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 250
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 241
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mAfter:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 242
a=0;//     .local v0, "after":Landroid/graphics/RectF;
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->computeRect(Landroid/graphics/RectF;Landroid/view/View;)V
a=0;// 
a=0;//     .line 243
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mBefore:Landroid/graphics/RectF;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V
a=0;// 
a=0;//     .line 245
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/view/View;
a=0;// 
a=0;//     .line 246
a=0;//     iget v3, v0, Landroid/graphics/RectF;->left:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     float-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     double-to-int v3, v3
a=0;// 
a=0;//     .line 247
a=0;//     #v3=(Integer);
a=0;//     iget v4, v0, Landroid/graphics/RectF;->top:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     float-to-double v4, v4
a=0;// 
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     double-to-int v4, v4
a=0;// 
a=0;//     .line 248
a=0;//     #v4=(Integer);
a=0;//     iget v5, v0, Landroid/graphics/RectF;->right:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     float-to-double v5, v5
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     double-to-int v5, v5
a=0;// 
a=0;//     .line 249
a=0;//     #v5=(Integer);
a=0;//     iget v6, v0, Landroid/graphics/RectF;->bottom:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     float-to-double v6, v6
a=0;// 
a=0;//     #v6=(DoubleLo);v7=(DoubleHi);
a=0;//     invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     double-to-int v6, v6
a=0;// 
a=0;//     .line 245
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v3, v4, v5, v6}, Landroid/view/View;->invalidate(IIII)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private prepareForUpdate()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 231
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mBefore:Landroid/graphics/RectF;
a=0;// 
a=0;//     invoke-direct {p0, v1, v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->computeRect(Landroid/graphics/RectF;Landroid/view/View;)V
a=0;// 
a=0;//     .line 234
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private transformMatrix(Landroid/graphics/Matrix;Landroid/view/View;)V
a=0;//     .locals 16
a=0;//     .param p1, "m"    # Landroid/graphics/Matrix;
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 281
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     int-to-float v13, v14
a=0;// 
a=0;//     .line 282
a=0;//     .local v13, "w":F
a=0;//     #v13=(Float);
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     int-to-float v2, v14
a=0;// 
a=0;//     .line 283
a=0;//     .local v2, "h":F
a=0;//     #v2=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     iget-boolean v3, v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mHasPivot:Z
a=0;// 
a=0;//     .line 284
a=0;//     .local v3, "hasPivot":Z
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v4, v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mPivotX:F
a=0;// 
a=0;//     .line 285
a=0;//     .local v4, "pX":F
a=0;//     :goto_0
a=0;//     #v4=(Integer);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v5, v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mPivotY:F
a=0;// 
a=0;//     .line 287
a=0;//     .local v5, "pY":F
a=0;//     :goto_1
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v6, v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mRotationX:F
a=0;// 
a=0;//     .line 288
a=0;//     .local v6, "rX":F
a=0;//     #v6=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v7, v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mRotationY:F
a=0;// 
a=0;//     .line 289
a=0;//     .local v7, "rY":F
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v8, v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mRotationZ:F
a=0;// 
a=0;//     .line 290
a=0;//     .local v8, "rZ":F
a=0;//     #v8=(Integer);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     cmpl-float v14, v6, v14
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-nez v14, :cond_0
a=0;// 
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     cmpl-float v14, v7, v14
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-nez v14, :cond_0
a=0;// 
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     cmpl-float v14, v8, v14
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-eqz v14, :cond_1
a=0;// 
a=0;//     .line 291
a=0;//     :cond_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mCamera:Landroid/graphics/Camera;
a=0;// 
a=0;//     .line 292
a=0;//     .local v1, "camera":Landroid/graphics/Camera;
a=0;//     #v1=(Reference,Landroid/graphics/Camera;);
a=0;//     invoke-virtual {v1}, Landroid/graphics/Camera;->save()V
a=0;// 
a=0;//     .line 293
a=0;//     invoke-virtual {v1, v6}, Landroid/graphics/Camera;->rotateX(F)V
a=0;// 
a=0;//     .line 294
a=0;//     invoke-virtual {v1, v7}, Landroid/graphics/Camera;->rotateY(F)V
a=0;// 
a=0;//     .line 295
a=0;//     neg-float v14, v8
a=0;// 
a=0;//     #v14=(Float);
a=0;//     invoke-virtual {v1, v14}, Landroid/graphics/Camera;->rotateZ(F)V
a=0;// 
a=0;//     .line 296
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/graphics/Camera;->getMatrix(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 297
a=0;//     invoke-virtual {v1}, Landroid/graphics/Camera;->restore()V
a=0;// 
a=0;//     .line 298
a=0;//     neg-float v14, v4
a=0;// 
a=0;//     neg-float v15, v5
a=0;// 
a=0;//     #v15=(Float);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v14, v15}, Landroid/graphics/Matrix;->preTranslate(FF)Z
a=0;// 
a=0;//     .line 299
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z
a=0;// 
a=0;//     .line 302
a=0;//     .end local v1    # "camera":Landroid/graphics/Camera;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v15=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v11, v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mScaleX:F
a=0;// 
a=0;//     .line 303
a=0;//     .local v11, "sX":F
a=0;//     #v11=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v12, v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mScaleY:F
a=0;// 
a=0;//     .line 304
a=0;//     .local v12, "sY":F
a=0;//     #v12=(Integer);
a=0;//     const/high16 v14, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     cmpl-float v14, v11, v14
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-nez v14, :cond_2
a=0;// 
a=0;//     const/high16 v14, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     cmpl-float v14, v12, v14
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-eqz v14, :cond_3
a=0;// 
a=0;//     .line 305
a=0;//     :cond_2
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v11, v12}, Landroid/graphics/Matrix;->postScale(FF)Z
a=0;// 
a=0;//     .line 306
a=0;//     div-float v14, v4, v13
a=0;// 
a=0;//     #v14=(Float);
a=0;//     neg-float v14, v14
a=0;// 
a=0;//     mul-float v15, v11, v13
a=0;// 
a=0;//     #v15=(Float);
a=0;//     sub-float/2addr v15, v13
a=0;// 
a=0;//     mul-float v9, v14, v15
a=0;// 
a=0;//     .line 307
a=0;//     .local v9, "sPX":F
a=0;//     #v9=(Float);
a=0;//     div-float v14, v5, v2
a=0;// 
a=0;//     neg-float v14, v14
a=0;// 
a=0;//     mul-float v15, v12, v2
a=0;// 
a=0;//     sub-float/2addr v15, v2
a=0;// 
a=0;//     mul-float v10, v14, v15
a=0;// 
a=0;//     .line 308
a=0;//     .local v10, "sPY":F
a=0;//     #v10=(Float);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v9, v10}, Landroid/graphics/Matrix;->postTranslate(FF)Z
a=0;// 
a=0;//     .line 311
a=0;//     .end local v9    # "sPX":F
a=0;//     .end local v10    # "sPY":F
a=0;//     :cond_3
a=0;//     #v9=(Conflicted);v10=(Conflicted);v15=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v14, v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mTranslationX:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v15, v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mTranslationY:F
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v14, v15}, Landroid/graphics/Matrix;->postTranslate(FF)Z
a=0;// 
a=0;//     .line 312
a=0;//     return-void
a=0;// 
a=0;//     .line 284
a=0;//     .end local v4    # "pX":F
a=0;//     .end local v5    # "pY":F
a=0;//     .end local v6    # "rX":F
a=0;//     .end local v7    # "rY":F
a=0;//     .end local v8    # "rZ":F
a=0;//     .end local v11    # "sX":F
a=0;//     .end local v12    # "sY":F
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v15=(Uninit);
a=0;//     const/high16 v14, 0x40000000    # 2.0f
a=0;// 
a=0;//     div-float v4, v13, v14
a=0;// 
a=0;//     #v4=(Float);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 285
a=0;//     .restart local v4    # "pX":F
a=0;//     :cond_5
a=0;//     #v4=(Integer);
a=0;//     const/high16 v14, 0x40000000    # 2.0f
a=0;// 
a=0;//     div-float v5, v2, v14
a=0;// 
a=0;//     #v5=(Float);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;//     .locals 2
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     sget-object v1, Lcom/nineoldandroids/view/animation/AnimatorProxy;->PROXIES:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     .line 37
a=0;//     .local v0, "proxy":Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     .line 38
a=0;//     :cond_0
a=0;//     new-instance v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     .end local v0    # "proxy":Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-direct {v0, p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;-><init>(Landroid/view/View;)V
a=0;// 
a=0;//     .line 39
a=0;//     .restart local v0    # "proxy":Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     sget-object v1, Lcom/nineoldandroids/view/animation/AnimatorProxy;->PROXIES:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     invoke-virtual {v1, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 41
a=0;//     :cond_1
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected applyTransformation(FLandroid/view/animation/Transformation;)V
a=0;//     .locals 2
a=0;//     .param p1, "interpolatedTime"    # F
a=0;//     .param p2, "t"    # Landroid/view/animation/Transformation;
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 317
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 318
a=0;//     iget v1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mAlpha:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/animation/Transformation;->setAlpha(F)V
a=0;// 
a=0;//     .line 319
a=0;//     invoke-virtual {p2}, Landroid/view/animation/Transformation;->getMatrix()Landroid/graphics/Matrix;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {p0, v1, v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->transformMatrix(Landroid/graphics/Matrix;Landroid/view/View;)V
a=0;// 
a=0;//     .line 321
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getAlpha()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mAlpha:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getPivotX()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mPivotX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getPivotY()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mPivotY:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getRotation()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mRotationZ:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getRotationX()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mRotationX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getRotationY()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mRotationY:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getScaleX()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mScaleX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getScaleY()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mScaleY:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getScrollX()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 157
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 158
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 160
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getScrollX()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getScrollY()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 170
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 171
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 173
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getScrollY()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getTranslationX()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mTranslationX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getTranslationY()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mTranslationY:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getX()F
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 204
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 205
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 207
a=0;//     :goto_0
a=0;//     #v1=(Float);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);v2=(Uninit);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mTranslationX:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-float/2addr v1, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getY()F
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 217
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 218
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 220
a=0;//     :goto_0
a=0;//     #v1=(Float);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);v2=(Uninit);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mTranslationY:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-float/2addr v1, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setAlpha(F)V
a=0;//     .locals 2
a=0;//     .param p1, "alpha"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     iget v1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mAlpha:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpl-float v1, v1, p1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     iput p1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mAlpha:F
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 77
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     invoke-virtual {v0}, Landroid/view/View;->invalidate()V
a=0;// 
a=0;//     .line 81
a=0;//     .end local v0    # "view":Landroid/view/View;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPivotX(F)V
a=0;//     .locals 1
a=0;//     .param p1, "pivotX"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     iget-boolean v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mHasPivot:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mPivotX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 87
a=0;//     :cond_0
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->prepareForUpdate()V
a=0;// 
a=0;//     .line 88
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mHasPivot:Z
a=0;// 
a=0;//     .line 89
a=0;//     iput p1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mPivotX:F
a=0;// 
a=0;//     .line 90
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->invalidateAfterUpdate()V
a=0;// 
a=0;//     .line 92
a=0;//     :cond_1
a=0;//     #v0=(Byte);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPivotY(F)V
a=0;//     .locals 1
a=0;//     .param p1, "pivotY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     iget-boolean v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mHasPivot:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mPivotY:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->prepareForUpdate()V
a=0;// 
a=0;//     .line 99
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mHasPivot:Z
a=0;// 
a=0;//     .line 100
a=0;//     iput p1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mPivotY:F
a=0;// 
a=0;//     .line 101
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->invalidateAfterUpdate()V
a=0;// 
a=0;//     .line 103
a=0;//     :cond_1
a=0;//     #v0=(Byte);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRotation(F)V
a=0;//     .locals 1
a=0;//     .param p1, "rotation"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mRotationZ:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->prepareForUpdate()V
a=0;// 
a=0;//     .line 110
a=0;//     iput p1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mRotationZ:F
a=0;// 
a=0;//     .line 111
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->invalidateAfterUpdate()V
a=0;// 
a=0;//     .line 113
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRotationX(F)V
a=0;//     .locals 1
a=0;//     .param p1, "rotationX"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mRotationX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 119
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->prepareForUpdate()V
a=0;// 
a=0;//     .line 120
a=0;//     iput p1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mRotationX:F
a=0;// 
a=0;//     .line 121
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->invalidateAfterUpdate()V
a=0;// 
a=0;//     .line 123
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRotationY(F)V
a=0;//     .locals 1
a=0;//     .param p1, "rotationY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mRotationY:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 130
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->prepareForUpdate()V
a=0;// 
a=0;//     .line 131
a=0;//     iput p1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mRotationY:F
a=0;// 
a=0;//     .line 132
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->invalidateAfterUpdate()V
a=0;// 
a=0;//     .line 134
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setScaleX(F)V
a=0;//     .locals 1
a=0;//     .param p1, "scaleX"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mScaleX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->prepareForUpdate()V
a=0;// 
a=0;//     .line 141
a=0;//     iput p1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mScaleX:F
a=0;// 
a=0;//     .line 142
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->invalidateAfterUpdate()V
a=0;// 
a=0;//     .line 144
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setScaleY(F)V
a=0;//     .locals 1
a=0;//     .param p1, "scaleY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 149
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mScaleY:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 150
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->prepareForUpdate()V
a=0;// 
a=0;//     .line 151
a=0;//     iput p1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mScaleY:F
a=0;// 
a=0;//     .line 152
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->invalidateAfterUpdate()V
a=0;// 
a=0;//     .line 154
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setScrollX(I)V
a=0;//     .locals 2
a=0;//     .param p1, "value"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 164
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 165
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getScrollY()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/view/View;->scrollTo(II)V
a=0;// 
a=0;//     .line 167
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setScrollY(I)V
a=0;//     .locals 2
a=0;//     .param p1, "value"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 177
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 178
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getScrollX()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/view/View;->scrollTo(II)V
a=0;// 
a=0;//     .line 180
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTranslationX(F)V
a=0;//     .locals 1
a=0;//     .param p1, "translationX"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mTranslationX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 187
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->prepareForUpdate()V
a=0;// 
a=0;//     .line 188
a=0;//     iput p1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mTranslationX:F
a=0;// 
a=0;//     .line 189
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->invalidateAfterUpdate()V
a=0;// 
a=0;//     .line 191
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTranslationY(F)V
a=0;//     .locals 1
a=0;//     .param p1, "translationY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 196
a=0;//     iget v0, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mTranslationY:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 197
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->prepareForUpdate()V
a=0;// 
a=0;//     .line 198
a=0;//     iput p1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mTranslationY:F
a=0;// 
a=0;//     .line 199
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->invalidateAfterUpdate()V
a=0;// 
a=0;//     .line 201
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setX(F)V
a=0;//     .locals 2
a=0;//     .param p1, "x"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 211
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 212
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float v1, p1, v1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setTranslationX(F)V
a=0;// 
a=0;//     .line 214
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setY(F)V
a=0;//     .locals 2
a=0;//     .param p1, "y"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 224
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 225
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float v1, p1, v1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setTranslationY(F)V
a=0;// 
a=0;//     .line 227
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
