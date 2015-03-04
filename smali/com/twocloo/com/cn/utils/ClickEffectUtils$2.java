package com.twocloo.com.cn.utils; class ClickEffectUtils$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/utils/ClickEffectUtils$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ClickEffectUtils.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnTouchListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/utils/ClickEffectUtils;->getImageButtonListener(Landroid/app/Activity;)Landroid/view/View$OnTouchListener;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public final BT_NOT_SELECTED:[F
a=0;// 
a=0;// .field public final BT_SELECTED:[F
a=0;// 
a=0;// .field private final synthetic val$activity:Landroid/app/Activity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/app/Activity;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x14
a=0;// 
a=0;//     .line 1
a=0;//     #v1=(PosByte);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/utils/ClickEffectUtils$2;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 65
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 67
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/ClickEffectUtils$2;);
a=0;//     new-array v0, v1, [F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/utils/ClickEffectUtils$2;->BT_SELECTED:[F
a=0;// 
a=0;//     .line 68
a=0;//     new-array v0, v1, [F
a=0;// 
a=0;//     fill-array-data v0, :array_1
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/utils/ClickEffectUtils$2;->BT_NOT_SELECTED:[F
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 67
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x3f800000    # 1.0f
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         -0x3db80000    # -50.0f
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//         0x0
a=0;//         0x0
a=0;//         -0x3db80000    # -50.0f
a=0;//         0x0
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//         0x0
a=0;//         -0x3db80000    # -50.0f
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//         0x0
a=0;//     .end array-data
a=0;// 
a=0;//     .line 68
a=0;//     :array_1
a=0;//     .array-data 4
a=0;//         0x3f800000    # 1.0f
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//         0x0
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
a=0;//     .locals 3
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/utils/ClickEffectUtils$2;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 73
a=0;//     .local v0, "iv":Landroid/widget/ImageButton;
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 74
a=0;//     new-instance v1, Landroid/graphics/ColorMatrixColorFilter;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/ColorMatrixColorFilter;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/utils/ClickEffectUtils$2;->BT_SELECTED:[F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     invoke-direct {v1, v2}, Landroid/graphics/ColorMatrixColorFilter;-><init>([F)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/ColorMatrixColorFilter;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setColorFilter(Landroid/graphics/ColorFilter;)V
a=0;// 
a=0;//     .line 78
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     return v1
a=0;// 
a=0;//     .line 75
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 76
a=0;//     new-instance v1, Landroid/graphics/ColorMatrixColorFilter;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/ColorMatrixColorFilter;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/utils/ClickEffectUtils$2;->BT_NOT_SELECTED:[F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     invoke-direct {v1, v2}, Landroid/graphics/ColorMatrixColorFilter;-><init>([F)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/ColorMatrixColorFilter;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setColorFilter(Landroid/graphics/ColorFilter;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
