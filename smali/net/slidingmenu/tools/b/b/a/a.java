package net.slidingmenu.tools.b.b.a; class a { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/a/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-instance v0, Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/TranslateAnimation;);
a=0;//     const/high16 v6, -0x40800000    # -1.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v5, v1
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     move v7, v1
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     move v8, v2
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/TranslateAnimation;);
a=0;//     int-to-long v1, p1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;III)Landroid/view/animation/AnimationSet;
a=0;//     .locals 11
a=0;// 
a=0;//     const v1, 0x3f4ccccd    # 0.8f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v2, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/high16 v6, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     new-instance v9, Landroid/view/animation/AnimationSet;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/view/animation/AnimationSet;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {v9, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/animation/AnimationSet;);
a=0;//     const v0, 0x10a0004
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     new-instance v10, Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     #v10=(UninitRef,Landroid/view/animation/AlphaAnimation;);
a=0;//     invoke-direct {v10, v6, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V
a=0;// 
a=0;//     #v10=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     int-to-long v3, p1
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v10, v3, v4}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     invoke-virtual {v10, v5}, Landroid/view/animation/Animation;->setFillAfter(Z)V
a=0;// 
a=0;//     new-instance v0, Landroid/view/animation/ScaleAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/ScaleAnimation;);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v7, v5
a=0;// 
a=0;//     #v7=(One);
a=0;//     move v8, v6
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/ScaleAnimation;);
a=0;//     int-to-long v1, p1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/view/animation/Animation;->setFillAfter(Z)V
a=0;// 
a=0;//     invoke-static {p0, p3}, Lnet/slidingmenu/tools/b/b/a/a;->b(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-virtual {v1, v5}, Landroid/view/animation/Animation;->setFillAfter(Z)V
a=0;// 
a=0;//     add-int v2, p2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setStartOffset(J)V
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     invoke-virtual {v9, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     return-object v9
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v6, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Landroid/view/animation/ScaleAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/ScaleAnimation;);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v7, v5
a=0;// 
a=0;//     #v7=(One);
a=0;//     move v8, v6
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/ScaleAnimation;);
a=0;//     int-to-long v1, p1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
