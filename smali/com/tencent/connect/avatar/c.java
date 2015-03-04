package com.tencent.connect.avatar; class c { void a() { int a;
a=0;// .class public Lcom/tencent/connect/avatar/c;
a=0;// .super Landroid/widget/ImageView;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final a:Ljava/lang/String;
a=0;// 
a=0;// .field public b:Z
a=0;// 
a=0;// .field private c:Landroid/graphics/Matrix;
a=0;// 
a=0;// .field private d:Landroid/graphics/Matrix;
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// .field private f:F
a=0;// 
a=0;// .field private g:F
a=0;// 
a=0;// .field private h:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private i:Z
a=0;// 
a=0;// .field private j:F
a=0;// 
a=0;// .field private k:F
a=0;// 
a=0;// .field private l:Landroid/graphics/PointF;
a=0;// 
a=0;// .field private m:Landroid/graphics/PointF;
a=0;// 
a=0;// .field private n:F
a=0;// 
a=0;// .field private o:F
a=0;// 
a=0;// .field private p:Landroid/graphics/Rect;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 51
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 26
a=0;//     #p0=(Reference,Lcom/tencent/connect/avatar/c;);
a=0;//     new-instance v0, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     .line 27
a=0;//     new-instance v0, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/avatar/c;->d:Landroid/graphics/Matrix;
a=0;// 
a=0;//     .line 28
a=0;//     iput v2, p0, Lcom/tencent/connect/avatar/c;->e:I
a=0;// 
a=0;//     .line 29
a=0;//     iput v1, p0, Lcom/tencent/connect/avatar/c;->f:F
a=0;// 
a=0;//     .line 30
a=0;//     iput v1, p0, Lcom/tencent/connect/avatar/c;->g:F
a=0;// 
a=0;//     .line 32
a=0;//     iput-boolean v2, p0, Lcom/tencent/connect/avatar/c;->i:Z
a=0;// 
a=0;//     .line 34
a=0;//     const-string v0, "TouchView"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/connect/avatar/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 36
a=0;//     new-instance v0, Landroid/graphics/PointF;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/PointF;);
a=0;//     invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/PointF;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/avatar/c;->l:Landroid/graphics/PointF;
a=0;// 
a=0;//     .line 37
a=0;//     new-instance v0, Landroid/graphics/PointF;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/PointF;);
a=0;//     invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/PointF;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;
a=0;// 
a=0;//     .line 38
a=0;//     iput v1, p0, Lcom/tencent/connect/avatar/c;->n:F
a=0;// 
a=0;//     .line 39
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/tencent/connect/avatar/c;->o:F
a=0;// 
a=0;//     .line 41
a=0;//     iput-boolean v2, p0, Lcom/tencent/connect/avatar/c;->b:Z
a=0;// 
a=0;//     .line 43
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 52
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/c;->getDrawingRect(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 53
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/avatar/c;->a()V
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/view/MotionEvent;)F
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 90
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 91
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 95
a=0;//     :goto_0
a=0;//     #v0=(Float);v1=(Float);v2=(Float);
a=0;//     return v0
a=0;// 
a=0;//     .line 93
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(PosByte);v2=(Null);
a=0;//     invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getX(I)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     .line 94
a=0;//     invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getY(I)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sub-float/2addr v1, v2
a=0;// 
a=0;//     .line 95
a=0;//     mul-float/2addr v0, v0
a=0;// 
a=0;//     mul-float/2addr v1, v1
a=0;// 
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     invoke-static {v0}, Landroid/util/FloatMath;->sqrt(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/graphics/PointF;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 110
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 145
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 113
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const/16 v0, 0x9
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [F
a=0;// 
a=0;//     .line 114
a=0;//     #v0=(Reference,[F);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v2, v0}, Landroid/graphics/Matrix;->getValues([F)V
a=0;// 
a=0;//     .line 115
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aget v2, v0, v2
a=0;// 
a=0;//     .line 116
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     aget v3, v0, v3
a=0;// 
a=0;//     .line 117
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget v0, v0, v4
a=0;// 
a=0;//     .line 118
a=0;//     #v0=(Integer);
a=0;//     iget-object v4, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     .line 119
a=0;//     #v4=(Float);
a=0;//     iget-object v5, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     .line 120
a=0;//     #v5=(Float);
a=0;//     mul-float/2addr v4, v0
a=0;// 
a=0;//     .line 121
a=0;//     mul-float/2addr v5, v0
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v0, v0, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sub-float/2addr v0, v2
a=0;// 
a=0;//     .line 123
a=0;//     cmpg-float v6, v0, v1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-gtz v6, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 126
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     add-float/2addr v2, v4
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget-object v4, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v4, v4, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float/2addr v2, v4
a=0;// 
a=0;//     .line 127
a=0;//     cmpg-float v4, v2, v1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gtz v4, :cond_2
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 130
a=0;//     :cond_2
a=0;//     #v2=(Integer);
a=0;//     add-float/2addr v2, v0
a=0;// 
a=0;//     .line 131
a=0;//     #v2=(Float);
a=0;//     iget-object v4, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v4}, Landroid/graphics/Rect;->width()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v0, v4
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float/2addr v0, v2
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v2, v2, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     add-float v4, v0, v2
a=0;// 
a=0;//     .line 133
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v0, v0, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sub-float v2, v0, v3
a=0;// 
a=0;//     .line 134
a=0;//     add-float v0, v3, v5
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v3, v3, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     sub-float/2addr v0, v3
a=0;// 
a=0;//     .line 135
a=0;//     cmpg-float v3, v2, v1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gtz v3, :cond_3
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 138
a=0;//     :cond_3
a=0;//     #v2=(Integer);
a=0;//     cmpg-float v3, v0, v1
a=0;// 
a=0;//     if-gtz v3, :cond_4
a=0;// 
a=0;//     .line 141
a=0;//     :goto_1
a=0;//     add-float v0, v2, v1
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v1}, Landroid/graphics/Rect;->height()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     div-float v0, v1, v0
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v1, v1, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     .line 144
a=0;//     invoke-virtual {p1, v4, v0}, Landroid/graphics/PointF;->set(FF)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/connect/avatar/c;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/avatar/c;->b()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/connect/avatar/c;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iput-boolean p1, p0, Lcom/tencent/connect/avatar/c;->i:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 291
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 205
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Rect;->width()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     .line 206
a=0;//     #v4=(Float);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/Rect;->height()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v5, v0
a=0;// 
a=0;//     .line 208
a=0;//     #v5=(Float);
a=0;//     const/16 v0, 0x9
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v6, v0, [F
a=0;// 
a=0;//     .line 209
a=0;//     #v6=(Reference,[F);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v0, v6}, Landroid/graphics/Matrix;->getValues([F)V
a=0;// 
a=0;//     .line 210
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     aget v3, v6, v0
a=0;// 
a=0;//     .line 211
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     aget v2, v6, v0
a=0;// 
a=0;//     .line 212
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aget v7, v6, v0
a=0;// 
a=0;//     .line 213
a=0;//     #v7=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 214
a=0;//     iget v1, p0, Lcom/tencent/connect/avatar/c;->f:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpl-float v1, v7, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     .line 215
a=0;//     iget v0, p0, Lcom/tencent/connect/avatar/c;->f:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-float/2addr v0, v7
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/tencent/connect/avatar/c;->o:F
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     iget v1, p0, Lcom/tencent/connect/avatar/c;->o:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/tencent/connect/avatar/c;->o:F
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Matrix;->postScale(FFFF)Z
a=0;// 
a=0;//     .line 217
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/c;->setImageMatrix(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 218
a=0;//     new-instance v0, Landroid/view/animation/ScaleAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/ScaleAnimation;);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/connect/avatar/c;->o:F
a=0;// 
a=0;//     div-float/2addr v1, v2
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const/high16 v2, 0x3f800000    # 1.0f
a=0;// 
a=0;//     const/high16 v3, 0x3f800000    # 1.0f
a=0;// 
a=0;//     iget v4, p0, Lcom/tencent/connect/avatar/c;->o:F
a=0;// 
a=0;//     div-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     const/high16 v4, 0x3f800000    # 1.0f
a=0;// 
a=0;//     iget-object v5, p0, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-object v6, p0, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v6, v6, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-direct/range {v0 .. v6}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V
a=0;// 
a=0;//     .line 267
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);v3=(Integer);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 268
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Lcom/tencent/connect/avatar/c;->i:Z
a=0;// 
a=0;//     .line 269
a=0;//     const-wide/16 v1, 0x12c
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/c;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 272
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lcom/tencent/connect/avatar/c$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/connect/avatar/c$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/tencent/connect/avatar/c$1;-><init>(Lcom/tencent/connect/avatar/c;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/avatar/c$1;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 221
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Byte);v2=(Integer);v4=(Float);v5=(Float);v6=(Reference,[F);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     iget v1, p0, Lcom/tencent/connect/avatar/c;->g:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpg-float v1, v7, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_3
a=0;// 
a=0;//     .line 222
a=0;//     iget v0, p0, Lcom/tencent/connect/avatar/c;->g:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-float/2addr v0, v7
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/tencent/connect/avatar/c;->o:F
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     iget v1, p0, Lcom/tencent/connect/avatar/c;->o:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/tencent/connect/avatar/c;->o:F
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v4, v4, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Matrix;->postScale(FFFF)Z
a=0;// 
a=0;//     .line 224
a=0;//     new-instance v0, Landroid/view/animation/ScaleAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/ScaleAnimation;);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/connect/avatar/c;->o:F
a=0;// 
a=0;//     const/high16 v3, 0x3f800000    # 1.0f
a=0;// 
a=0;//     iget v4, p0, Lcom/tencent/connect/avatar/c;->o:F
a=0;// 
a=0;//     iget-object v5, p0, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v5, v5, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-object v6, p0, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v6, v6, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-direct/range {v0 .. v6}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/ScaleAnimation;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 227
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(Byte);v4=(Float);v5=(Float);v6=(Reference,[F);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 228
a=0;//     #v1=(Null);
a=0;//     iget-object v8, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v8=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     int-to-float v8, v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     mul-float/2addr v8, v7
a=0;// 
a=0;//     .line 229
a=0;//     iget-object v9, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     int-to-float v9, v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     mul-float/2addr v7, v9
a=0;// 
a=0;//     .line 230
a=0;//     #v7=(Float);
a=0;//     iget-object v9, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v9, v9, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     int-to-float v9, v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     sub-float/2addr v9, v3
a=0;// 
a=0;//     .line 231
a=0;//     iget-object v10, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v10=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v10, v10, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     int-to-float v10, v10
a=0;// 
a=0;//     #v10=(Float);
a=0;//     sub-float/2addr v10, v2
a=0;// 
a=0;//     .line 232
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     cmpg-float v11, v9, v11
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     if-gez v11, :cond_4
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v1, v1, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v3, v1
a=0;// 
a=0;//     .line 234
a=0;//     #v3=(Float);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 236
a=0;//     :cond_4
a=0;//     #v1=(Boolean);v3=(Integer);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     cmpg-float v11, v10, v11
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     if-gez v11, :cond_5
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v1, v1, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v2, v1
a=0;// 
a=0;//     .line 238
a=0;//     #v2=(Float);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 240
a=0;//     :cond_5
a=0;//     #v1=(Boolean);v2=(Integer);
a=0;//     sub-float v9, v8, v9
a=0;// 
a=0;//     .line 241
a=0;//     sub-float v10, v7, v10
a=0;// 
a=0;//     .line 243
a=0;//     cmpg-float v9, v9, v4
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-gez v9, :cond_6
a=0;// 
a=0;//     .line 244
a=0;//     sub-float v1, v8, v4
a=0;// 
a=0;//     .line 245
a=0;//     #v1=(Float);
a=0;//     iget-object v3, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v3, v3, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     sub-float/2addr v3, v1
a=0;// 
a=0;//     .line 246
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 248
a=0;//     :cond_6
a=0;//     #v1=(Boolean);v3=(Integer);
a=0;//     cmpg-float v4, v10, v5
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gez v4, :cond_7
a=0;// 
a=0;//     .line 249
a=0;//     sub-float v1, v7, v5
a=0;// 
a=0;//     .line 250
a=0;//     #v1=(Float);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v2, v2, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sub-float/2addr v2, v1
a=0;// 
a=0;//     .line 251
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 253
a=0;//     :cond_7
a=0;//     #v1=(Boolean);v2=(Integer);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     .line 254
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     aget v0, v6, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-float v1, v0, v3
a=0;// 
a=0;//     .line 255
a=0;//     #v1=(Float);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     aget v0, v6, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-float v4, v0, v2
a=0;// 
a=0;//     .line 256
a=0;//     #v4=(Float);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     aput v3, v6, v0
a=0;// 
a=0;//     .line 257
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     aput v2, v6, v0
a=0;// 
a=0;//     .line 258
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v0, v6}, Landroid/graphics/Matrix;->setValues([F)V
a=0;// 
a=0;//     .line 259
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/c;->setImageMatrix(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 260
a=0;//     new-instance v0, Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/TranslateAnimation;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v0, v1, v2, v4, v3}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/TranslateAnimation;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 263
a=0;//     :cond_8
a=0;//     #v0=(Null);v1=(Boolean);v2=(Integer);v3=(Integer);v4=(Byte);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {p0, v1}, Lcom/tencent/connect/avatar/c;->setImageMatrix(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private c()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v6, 0x45000000    # 2048.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/high16 v5, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 294
a=0;//     #v5=(Integer);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 320
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 297
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const/16 v0, 0x9
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [F
a=0;// 
a=0;//     .line 298
a=0;//     #v0=(Reference,[F);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->getValues([F)V
a=0;// 
a=0;//     .line 299
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/graphics/Rect;->width()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v1, v2
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v2}, Landroid/graphics/Rect;->height()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget-object v3, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 302
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v2, v2, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget-object v3, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     mul-float/2addr v3, v1
a=0;// 
a=0;//     iget-object v4, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v4}, Landroid/graphics/Rect;->width()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float/2addr v3, v4
a=0;// 
a=0;//     div-float/2addr v3, v5
a=0;// 
a=0;//     sub-float/2addr v2, v3
a=0;// 
a=0;//     iput v2, p0, Lcom/tencent/connect/avatar/c;->j:F
a=0;// 
a=0;//     .line 304
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v2, v2, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget-object v3, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     mul-float/2addr v3, v1
a=0;// 
a=0;//     iget-object v4, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v4}, Landroid/graphics/Rect;->height()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float/2addr v3, v4
a=0;// 
a=0;//     div-float/2addr v3, v5
a=0;// 
a=0;//     sub-float/2addr v2, v3
a=0;// 
a=0;//     iput v2, p0, Lcom/tencent/connect/avatar/c;->k:F
a=0;// 
a=0;//     .line 306
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iget v3, p0, Lcom/tencent/connect/avatar/c;->j:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aput v3, v0, v2
a=0;// 
a=0;//     .line 307
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     iget v3, p0, Lcom/tencent/connect/avatar/c;->k:F
a=0;// 
a=0;//     aput v3, v0, v2
a=0;// 
a=0;//     .line 308
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     aput v1, v0, v3
a=0;// 
a=0;//     aput v1, v0, v2
a=0;// 
a=0;//     .line 309
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v2, v0}, Landroid/graphics/Matrix;->setValues([F)V
a=0;// 
a=0;//     .line 310
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float v0, v6, v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float v2, v6, v2
a=0;// 
a=0;//     invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lcom/tencent/connect/avatar/c;->f:F
a=0;// 
a=0;//     .line 315
a=0;//     iput v1, p0, Lcom/tencent/connect/avatar/c;->g:F
a=0;// 
a=0;//     .line 316
a=0;//     iget v0, p0, Lcom/tencent/connect/avatar/c;->f:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/tencent/connect/avatar/c;->g:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpg-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     .line 317
a=0;//     iget v0, p0, Lcom/tencent/connect/avatar/c;->g:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/tencent/connect/avatar/c;->f:F
a=0;// 
a=0;//     .line 319
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/c;->setImageMatrix(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Landroid/graphics/Rect;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     iput-object p1, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/avatar/c;->c()V
a=0;// 
a=0;//     .line 106
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/high16 v2, 0x41200000    # 10.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 150
a=0;//     #v4=(One);
a=0;//     iget-boolean v0, p0, Lcom/tencent/connect/avatar/c;->i:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 197
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Integer);
a=0;//     return v4
a=0;// 
a=0;//     .line 153
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Integer);v3=(PosByte);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 196
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Integer);
a=0;//     iput-boolean v4, p0, Lcom/tencent/connect/avatar/c;->b:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 156
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Integer);v3=(PosByte);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/avatar/c;->getImageMatrix()Landroid/graphics/Matrix;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->d:Landroid/graphics/Matrix;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->l:Landroid/graphics/PointF;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/graphics/PointF;->set(FF)V
a=0;// 
a=0;//     .line 159
a=0;//     iput v4, p0, Lcom/tencent/connect/avatar/c;->e:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 163
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Integer);
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/connect/avatar/c;->a(Landroid/view/MotionEvent;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/tencent/connect/avatar/c;->n:F
a=0;// 
a=0;//     .line 164
a=0;//     iget v0, p0, Lcom/tencent/connect/avatar/c;->n:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->d:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 166
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/connect/avatar/c;->a(Landroid/graphics/PointF;)V
a=0;// 
a=0;//     .line 167
a=0;//     iput v3, p0, Lcom/tencent/connect/avatar/c;->e:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 173
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/avatar/c;->b()V
a=0;// 
a=0;//     .line 175
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/tencent/connect/avatar/c;->e:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 178
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);
a=0;//     iget v0, p0, Lcom/tencent/connect/avatar/c;->e:I
a=0;// 
a=0;//     if-ne v0, v4, :cond_2
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/c;->d:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/c;->l:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v1, v1, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     .line 181
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/c;->l:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v2, v2, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-float/2addr v1, v2
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v2, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/c;->setImageMatrix(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 184
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Integer);
a=0;//     iget v0, p0, Lcom/tencent/connect/avatar/c;->e:I
a=0;// 
a=0;//     if-ne v0, v3, :cond_1
a=0;// 
a=0;//     .line 185
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 186
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/connect/avatar/c;->a(Landroid/view/MotionEvent;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 187
a=0;//     #v0=(Float);
a=0;//     cmpl-float v1, v0, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     .line 188
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Matrix;);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/c;->d:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 189
a=0;//     iget v1, p0, Lcom/tencent/connect/avatar/c;->n:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-float/2addr v0, v1
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Matrix;);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;
a=0;// 
a=0;//     iget v2, v2, Landroid/graphics/PointF;->x:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PointF;);
a=0;//     iget v3, v3, Landroid/graphics/PointF;->y:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v0, v0, v2, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z
a=0;// 
a=0;//     .line 192
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/c;->setImageMatrix(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 153
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 82
a=0;//     iput-object p1, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 83
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 84
a=0;//     iput-object p1, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 86
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
