package cn.waps; class AnimationType { void a() { int a;
a=0;// .class public Lcn/waps/AnimationType;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final MINI_RANDOM:I = -0x2
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/AnimationType;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static getAnimation(Landroid/view/View;)Ljava/util/Map;
a=0;//     .locals 8
a=0;// 
a=0;//     const/high16 v3, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/high16 v2, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float v5, v0, v3
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float v6, v0, v3
a=0;// 
a=0;//     #v6=(Float);
a=0;//     new-instance v7, Ljava/util/HashMap;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v7}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/HashMap;);
a=0;//     new-instance v0, Landroid/view/animation/ScaleAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/ScaleAnimation;);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct/range {v0 .. v6}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/ScaleAnimation;);
a=0;//     const-string v3, "1"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     new-instance v0, Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/AlphaAnimation;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     const-string v2, "5"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     new-instance v0, Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/TranslateAnimation;);
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-direct {v0, v2, v1, v1, v1}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/TranslateAnimation;);
a=0;//     const-string v2, "6"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     new-instance v0, Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/TranslateAnimation;);
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     neg-int v2, v2
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-direct {v0, v2, v1, v1, v1}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/TranslateAnimation;);
a=0;//     const-string v1, "7"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     return-object v7
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected startMiniAdAnimation(ILandroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     invoke-static {p2}, Lcn/waps/AnimationType;->getAnimation(Landroid/view/View;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v2, "6"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     const-string v2, "7"
a=0;// 
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v0, Ljava/util/Random;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Random;);
a=0;//     invoke-direct {v0}, Ljava/util/Random;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Random;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/util/Random;);v1=(Reference,Ljava/util/ArrayList;);v2=(Integer);
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/animation/Animation;
a=0;// 
a=0;//     const-wide/16 v1, 0x7d0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     new-instance v1, Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
