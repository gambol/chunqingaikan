package com.nineoldandroids.view; class ViewHelper { void a() { int a;
a=0;// .class public final Lcom/nineoldandroids/view/ViewHelper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ViewHelper.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/nineoldandroids/view/ViewHelper$Honeycomb;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 9
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/nineoldandroids/view/ViewHelper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getAlpha(Landroid/view/View;)F
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getAlpha()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getAlpha(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getPivotX(Landroid/view/View;)F
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getPivotX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getPivotX(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getPivotY(Landroid/view/View;)F
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getPivotY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getPivotY(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getRotation(Landroid/view/View;)F
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getRotation()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getRotation(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getRotationX(Landroid/view/View;)F
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getRotationX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getRotationX(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getRotationY(Landroid/view/View;)F
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getRotationY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getRotationY(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getScaleX(Landroid/view/View;)F
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getScaleX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getScaleX(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getScaleY(Landroid/view/View;)F
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getScaleY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getScaleY(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getScrollX(Landroid/view/View;)F
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getScrollX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getScrollX(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getScrollY(Landroid/view/View;)F
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getScrollY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getScrollY(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getTranslationX(Landroid/view/View;)F
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getTranslationX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getTranslationX(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getTranslationY(Landroid/view/View;)F
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getTranslationY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getTranslationY(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getX(Landroid/view/View;)F
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getX(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getY(Landroid/view/View;)F
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getY(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setAlpha(Landroid/view/View;F)V
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;//     .param p1, "alpha"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 17
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setAlpha(F)V
a=0;// 
a=0;//     .line 21
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 19
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setAlpha(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setPivotX(Landroid/view/View;F)V
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;//     .param p1, "pivotX"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 29
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setPivotX(F)V
a=0;// 
a=0;//     .line 33
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 31
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setPivotX(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setPivotY(Landroid/view/View;F)V
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;//     .param p1, "pivotY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 41
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setPivotY(F)V
a=0;// 
a=0;//     .line 45
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 43
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setPivotY(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setRotation(Landroid/view/View;F)V
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;//     .param p1, "rotation"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setRotation(F)V
a=0;// 
a=0;//     .line 57
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 55
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setRotation(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setRotationX(Landroid/view/View;F)V
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;//     .param p1, "rotationX"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 65
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setRotationX(F)V
a=0;// 
a=0;//     .line 69
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 67
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setRotationX(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setRotationY(Landroid/view/View;F)V
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;//     .param p1, "rotationY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setRotationY(F)V
a=0;// 
a=0;//     .line 81
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 79
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setRotationY(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setScaleX(Landroid/view/View;F)V
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;//     .param p1, "scaleX"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 89
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setScaleX(F)V
a=0;// 
a=0;//     .line 93
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 91
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setScaleX(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setScaleY(Landroid/view/View;F)V
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;//     .param p1, "scaleY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setScaleY(F)V
a=0;// 
a=0;//     .line 105
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setScaleY(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setScrollX(Landroid/view/View;I)V
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;//     .param p1, "scrollX"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 113
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setScrollX(I)V
a=0;// 
a=0;//     .line 117
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 115
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setScrollX(Landroid/view/View;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setScrollY(Landroid/view/View;I)V
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;//     .param p1, "scrollY"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setScrollY(I)V
a=0;// 
a=0;//     .line 129
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setScrollY(Landroid/view/View;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setTranslationX(Landroid/view/View;F)V
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;//     .param p1, "translationX"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 137
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setTranslationX(F)V
a=0;// 
a=0;//     .line 141
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 139
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setTranslationX(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setTranslationY(Landroid/view/View;F)V
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;//     .param p1, "translationY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 149
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setTranslationY(F)V
a=0;// 
a=0;//     .line 153
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 151
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setTranslationY(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setX(Landroid/view/View;F)V
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;//     .param p1, "x"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 161
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setX(F)V
a=0;// 
a=0;//     .line 165
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 163
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setX(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setY(Landroid/view/View;F)V
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;//     .param p1, "y"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 173
a=0;//     invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setY(F)V
a=0;// 
a=0;//     .line 177
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 175
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setY(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
