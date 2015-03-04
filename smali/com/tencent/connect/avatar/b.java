package com.tencent.connect.avatar; class b { void a() { int a;
a=0;// .class public Lcom/tencent/connect/avatar/b;
a=0;// .super Landroid/view/View;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/graphics/Rect;
a=0;// 
a=0;// .field private b:Landroid/graphics/Paint;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 18
a=0;//     #p0=(Reference,Lcom/tencent/connect/avatar/b;);
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/avatar/b;->b()V
a=0;// 
a=0;//     .line 19
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     new-instance v0, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/avatar/b;->b:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 34
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Landroid/graphics/Rect;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/b;->a:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/avatar/b;->a:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 77
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/avatar/b;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 78
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/avatar/b;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 79
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v2, v1, -0x3c
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x50
a=0;// 
a=0;//     .line 82
a=0;//     invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 83
a=0;//     const/16 v3, 0x280
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 89
a=0;//     sub-int/2addr v0, v2
a=0;// 
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     .line 91
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     div-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     .line 92
a=0;//     add-int v3, v0, v2
a=0;// 
a=0;//     .line 93
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v1
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v4, p0, Lcom/tencent/connect/avatar/b;->a:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v4, v0, v1, v3, v2}, Landroid/graphics/Rect;->set(IIII)V
a=0;// 
a=0;//     .line 99
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/b;->a:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v10, 0x64
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 38
a=0;//     #v9=(Null);
a=0;//     invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 40
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/avatar/b;->a()Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 41
a=0;//     #v6=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/avatar/b;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 42
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/avatar/b;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 45
a=0;//     #v8=(Integer);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/b;->b:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Paint$Style;);
a=0;//     invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/b;->b:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-static {v10, v9, v9, v9}, Landroid/graphics/Color;->argb(IIII)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 50
a=0;//     int-to-float v3, v7
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget v0, v6, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget-object v5, p0, Lcom/tencent/connect/avatar/b;->b:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 51
a=0;//     iget v0, v6, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     int-to-float v3, v7
a=0;// 
a=0;//     int-to-float v4, v8
a=0;// 
a=0;//     iget-object v5, p0, Lcom/tencent/connect/avatar/b;->b:Landroid/graphics/Paint;
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 52
a=0;//     iget v0, v6, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     iget v0, v6, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     int-to-float v3, v0
a=0;// 
a=0;//     iget v0, v6, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     iget-object v5, p0, Lcom/tencent/connect/avatar/b;->b:Landroid/graphics/Paint;
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 53
a=0;//     iget v0, v6, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v0, v6, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     int-to-float v3, v7
a=0;// 
a=0;//     iget v0, v6, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     iget-object v5, p0, Lcom/tencent/connect/avatar/b;->b:Landroid/graphics/Paint;
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 54
a=0;//     invoke-static {v10, v9, v9, v9}, Landroid/graphics/Color;->argb(IIII)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/b;->b:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint$Style;);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/b;->b:Landroid/graphics/Paint;
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 62
a=0;//     iget v0, v6, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v0, v6, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     iget v0, v6, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     int-to-float v3, v0
a=0;// 
a=0;//     iget v0, v6, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     iget-object v5, p0, Lcom/tencent/connect/avatar/b;->b:Landroid/graphics/Paint;
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
}}
