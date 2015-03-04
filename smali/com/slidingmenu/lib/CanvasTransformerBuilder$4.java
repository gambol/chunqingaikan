package com.slidingmenu.lib; class CanvasTransformerBuilder$4 { void a() { int a;
a=0;// .class Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CanvasTransformerBuilder.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/slidingmenu/lib/CanvasTransformerBuilder;->rotate(IIIILandroid/view/animation/Interpolator;)Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/slidingmenu/lib/CanvasTransformerBuilder;
a=0;// 
a=0;// .field private final synthetic val$closedDeg:I
a=0;// 
a=0;// .field private final synthetic val$interp:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field private final synthetic val$openedDeg:I
a=0;// 
a=0;// .field private final synthetic val$px:I
a=0;// 
a=0;// .field private final synthetic val$py:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/slidingmenu/lib/CanvasTransformerBuilder;Landroid/view/animation/Interpolator;IIII)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;->this$0:Lcom/slidingmenu/lib/CanvasTransformerBuilder;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;->val$interp:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     iput p3, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;->val$openedDeg:I
a=0;// 
a=0;//     iput p4, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;->val$closedDeg:I
a=0;// 
a=0;//     iput p5, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;->val$px:I
a=0;// 
a=0;//     iput p6, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;->val$py:I
a=0;// 
a=0;//     .line 54
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public transformCanvas(Landroid/graphics/Canvas;F)V
a=0;//     .locals 4
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;//     .param p2, "percentOpen"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;->this$0:Lcom/slidingmenu/lib/CanvasTransformerBuilder;
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/CanvasTransformerBuilder;);
a=0;//     invoke-static {v1}, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->access$0(Lcom/slidingmenu/lib/CanvasTransformerBuilder;)Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1, p1, p2}, Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;->transformCanvas(Landroid/graphics/Canvas;F)V
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;->val$interp:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     invoke-interface {v1, p2}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 58
a=0;//     .local v0, "f":F
a=0;//     #v0=(Float);
a=0;//     iget v1, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;->val$openedDeg:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;->val$closedDeg:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     mul-float/2addr v1, v0
a=0;// 
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;->val$closedDeg:I
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     add-float/2addr v1, v2
a=0;// 
a=0;//     .line 59
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;->val$px:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v3, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;->val$py:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     .line 58
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {p1, v1, v2, v3}, Landroid/graphics/Canvas;->rotate(FFF)V
a=0;// 
a=0;//     .line 60
a=0;//     return-void
a=0;// .end method
}}
