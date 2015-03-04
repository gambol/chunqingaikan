package com.actionbarsherlock.internal.nineoldandroids.view.animation; class AnimatorProxy { void a() { int a;
a=0;// .class public final Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
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
a=0;//             "Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;",
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
a=0;//     .line 14
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
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
a=0;//     sput-boolean v0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     .line 17
a=0;//     new-instance v0, Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/WeakHashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V
a=0;// 
a=0;//     .line 16
a=0;//     #v0=(Reference,Ljava/util/WeakHashMap;);
a=0;//     sput-object v0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->PROXIES:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     .line 17
a=0;//     return-void
a=0;// 
a=0;//     .line 14
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
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 40
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mAlpha:F
a=0;// 
a=0;//     .line 31
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mScaleX:F
a=0;// 
a=0;//     .line 32
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mScaleY:F
a=0;// 
a=0;//     .line 36
a=0;//     new-instance v0, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mBefore:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 37
a=0;//     new-instance v0, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mAfter:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v0, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mTempMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     .line 41
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->setDuration(J)V
a=0;// 
a=0;//     .line 42
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->setFillAfter(Z)V
a=0;// 
a=0;//     .line 43
a=0;//     invoke-virtual {p1, p0}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 44
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 45
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
a=0;//     .line 158
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v3, v4
a=0;// 
a=0;//     .line 159
a=0;//     .local v3, "w":F
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     int-to-float v1, v4
a=0;// 
a=0;//     .line 162
a=0;//     .local v1, "h":F
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1, v5, v5, v3, v1}, Landroid/graphics/RectF;->set(FFFF)V
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mTempMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     .line 165
a=0;//     .local v2, "m":Landroid/graphics/Matrix;
a=0;//     #v2=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V
a=0;// 
a=0;//     .line 166
a=0;//     invoke-direct {p0, v2, p2}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->transformMatrix(Landroid/graphics/Matrix;Landroid/view/View;)V
a=0;// 
a=0;//     .line 167
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mTempMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v4, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z
a=0;// 
a=0;//     .line 169
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
a=0;//     .line 172
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
a=0;//     .line 173
a=0;//     iget v0, p1, Landroid/graphics/RectF;->right:F
a=0;// 
a=0;//     .line 174
a=0;//     .local v0, "f":F
a=0;//     #v0=(Integer);
a=0;//     iget v4, p1, Landroid/graphics/RectF;->left:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p1, Landroid/graphics/RectF;->right:F
a=0;// 
a=0;//     .line 175
a=0;//     iput v0, p1, Landroid/graphics/RectF;->left:F
a=0;// 
a=0;//     .line 177
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
a=0;//     .line 178
a=0;//     iget v0, p1, Landroid/graphics/RectF;->top:F
a=0;// 
a=0;//     .line 179
a=0;//     .restart local v0    # "f":F
a=0;//     #v0=(Integer);
a=0;//     iget v4, p1, Landroid/graphics/RectF;->bottom:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p1, Landroid/graphics/RectF;->top:F
a=0;// 
a=0;//     .line 180
a=0;//     iput v0, p1, Landroid/graphics/RectF;->bottom:F
a=0;// 
a=0;//     .line 182
a=0;//     .end local v0    # "f":F
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private invalidateAfterUpdate()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/view/View;
a=0;// 
a=0;//     .line 135
a=0;//     .local v2, "view":Landroid/view/View;
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 154
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 138
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Reference,Ljava/lang/ref/WeakReference;);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v1, Landroid/view/View;
a=0;// 
a=0;//     .line 139
a=0;//     .local v1, "parent":Landroid/view/View;
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 143
a=0;//     invoke-virtual {v2, p0}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mAfter:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 146
a=0;//     .local v0, "after":Landroid/graphics/RectF;
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);
a=0;//     invoke-direct {p0, v0, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->computeRect(Landroid/graphics/RectF;Landroid/view/View;)V
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mBefore:Landroid/graphics/RectF;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V
a=0;// 
a=0;//     .line 150
a=0;//     iget v3, v0, Landroid/graphics/RectF;->left:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Landroid/util/FloatMath;->floor(F)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     .line 151
a=0;//     #v3=(Integer);
a=0;//     iget v4, v0, Landroid/graphics/RectF;->top:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Landroid/util/FloatMath;->floor(F)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     .line 152
a=0;//     #v4=(Integer);
a=0;//     iget v5, v0, Landroid/graphics/RectF;->right:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Landroid/util/FloatMath;->ceil(F)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     float-to-int v5, v5
a=0;// 
a=0;//     .line 153
a=0;//     #v5=(Integer);
a=0;//     iget v6, v0, Landroid/graphics/RectF;->bottom:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Landroid/util/FloatMath;->ceil(F)F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     .line 149
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v1, v3, v4, v5, v6}, Landroid/view/View;->invalidate(IIII)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private prepareForUpdate()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 129
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mBefore:Landroid/graphics/RectF;
a=0;// 
a=0;//     invoke-direct {p0, v1, v0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->computeRect(Landroid/graphics/RectF;Landroid/view/View;)V
a=0;// 
a=0;//     .line 132
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private transformMatrix(Landroid/graphics/Matrix;Landroid/view/View;)V
a=0;//     .locals 9
a=0;//     .param p1, "m"    # Landroid/graphics/Matrix;
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v8, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/high16 v7, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 185
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v5, v6
a=0;// 
a=0;//     .line 186
a=0;//     .local v5, "w":F
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     int-to-float v2, v6
a=0;// 
a=0;//     .line 188
a=0;//     .local v2, "h":F
a=0;//     #v2=(Float);
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mScaleX:F
a=0;// 
a=0;//     .line 189
a=0;//     .local v3, "sX":F
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mScaleY:F
a=0;// 
a=0;//     .line 190
a=0;//     .local v4, "sY":F
a=0;//     #v4=(Integer);
a=0;//     cmpl-float v6, v3, v7
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     cmpl-float v6, v4, v7
a=0;// 
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 191
a=0;//     :cond_0
a=0;//     mul-float v6, v3, v5
a=0;// 
a=0;//     #v6=(Float);
a=0;//     sub-float/2addr v6, v5
a=0;// 
a=0;//     div-float v0, v6, v8
a=0;// 
a=0;//     .line 192
a=0;//     .local v0, "deltaSX":F
a=0;//     #v0=(Float);
a=0;//     mul-float v6, v4, v2
a=0;// 
a=0;//     sub-float/2addr v6, v2
a=0;// 
a=0;//     div-float v1, v6, v8
a=0;// 
a=0;//     .line 193
a=0;//     .local v1, "deltaSY":F
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1, v3, v4}, Landroid/graphics/Matrix;->postScale(FF)Z
a=0;// 
a=0;//     .line 194
a=0;//     neg-float v6, v0
a=0;// 
a=0;//     neg-float v7, v1
a=0;// 
a=0;//     #v7=(Float);
a=0;//     invoke-virtual {p1, v6, v7}, Landroid/graphics/Matrix;->postTranslate(FF)Z
a=0;// 
a=0;//     .line 196
a=0;//     .end local v0    # "deltaSX":F
a=0;//     .end local v1    # "deltaSY":F
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v7=(Integer);
a=0;//     iget v6, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mTranslationX:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mTranslationY:F
a=0;// 
a=0;//     invoke-virtual {p1, v6, v7}, Landroid/graphics/Matrix;->postTranslate(FF)Z
a=0;// 
a=0;//     .line 197
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static wrap(Landroid/view/View;)Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;//     .locals 2
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     sget-object v1, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->PROXIES:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     .line 21
a=0;//     .local v0, "proxy":Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 22
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     .end local v0    # "proxy":Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-direct {v0, p0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;-><init>(Landroid/view/View;)V
a=0;// 
a=0;//     .line 23
a=0;//     .restart local v0    # "proxy":Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     sget-object v1, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->PROXIES:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     invoke-virtual {v1, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 25
a=0;//     :cond_0
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
a=0;//     .line 201
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 202
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 203
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mAlpha:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/animation/Transformation;->setAlpha(F)V
a=0;// 
a=0;//     .line 204
a=0;//     invoke-virtual {p2}, Landroid/view/animation/Transformation;->getMatrix()Landroid/graphics/Matrix;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {p0, v1, v0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->transformMatrix(Landroid/graphics/Matrix;Landroid/view/View;)V
a=0;// 
a=0;//     .line 206
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getAlpha()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mAlpha:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getScaleX()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mScaleX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getScaleY()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mScaleY:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getScrollX()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 81
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 82
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 84
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
a=0;//     .line 93
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 94
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 95
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 97
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
a=0;//     .line 107
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mTranslationX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getTranslationY()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mTranslationY:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public reset()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAlpha(F)V
a=0;//     .locals 2
a=0;//     .param p1, "alpha"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mAlpha:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpl-float v1, v1, p1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mAlpha:F
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 54
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     invoke-virtual {v0}, Landroid/view/View;->invalidate()V
a=0;// 
a=0;//     .line 58
a=0;//     .end local v0    # "view":Landroid/view/View;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setScaleX(F)V
a=0;//     .locals 1
a=0;//     .param p1, "scaleX"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mScaleX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 64
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->prepareForUpdate()V
a=0;// 
a=0;//     .line 65
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mScaleX:F
a=0;// 
a=0;//     .line 66
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->invalidateAfterUpdate()V
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setScaleY(F)V
a=0;//     .locals 1
a=0;//     .param p1, "scaleY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mScaleY:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->prepareForUpdate()V
a=0;// 
a=0;//     .line 75
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mScaleY:F
a=0;// 
a=0;//     .line 76
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->invalidateAfterUpdate()V
a=0;// 
a=0;//     .line 78
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setScrollX(I)V
a=0;//     .locals 2
a=0;//     .param p1, "value"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 88
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 89
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getScrollY()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/view/View;->scrollTo(II)V
a=0;// 
a=0;//     .line 91
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
a=0;//     .line 100
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 101
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getScrollY()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/view/View;->scrollTo(II)V
a=0;// 
a=0;//     .line 104
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
a=0;//     .line 110
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mTranslationX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 111
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->prepareForUpdate()V
a=0;// 
a=0;//     .line 112
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mTranslationX:F
a=0;// 
a=0;//     .line 113
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->invalidateAfterUpdate()V
a=0;// 
a=0;//     .line 115
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTranslationY(F)V
a=0;//     .locals 1
a=0;//     .param p1, "translationY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mTranslationY:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->prepareForUpdate()V
a=0;// 
a=0;//     .line 122
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->mTranslationY:F
a=0;// 
a=0;//     .line 123
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->invalidateAfterUpdate()V
a=0;// 
a=0;//     .line 125
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
