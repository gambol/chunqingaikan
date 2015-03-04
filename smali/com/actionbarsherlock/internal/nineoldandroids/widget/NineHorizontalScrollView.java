package com.actionbarsherlock.internal.nineoldandroids.widget; class NineHorizontalScrollView { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineHorizontalScrollView;
a=0;// .super Landroid/widget/HorizontalScrollView;
a=0;// .source "NineHorizontalScrollView.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mProxy:Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     invoke-direct {p0, p1}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 12
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineHorizontalScrollView;);
a=0;//     sget-boolean v0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineHorizontalScrollView;->mProxy:Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     .line 13
a=0;//     return-void
a=0;// 
a=0;//     .line 12
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getAlpha()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     sget-boolean v0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 29
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineHorizontalScrollView;->mProxy:Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->getAlpha()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 31
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0}, Landroid/widget/HorizontalScrollView;->getAlpha()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setAlpha(F)V
a=0;//     .locals 1
a=0;//     .param p1, "alpha"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     sget-boolean v0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineHorizontalScrollView;->mProxy:Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->setAlpha(F)V
a=0;// 
a=0;//     .line 40
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 38
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->setAlpha(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setVisibility(I)V
a=0;//     .locals 1
a=0;//     .param p1, "visibility"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineHorizontalScrollView;->mProxy:Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 18
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     .line 19
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineHorizontalScrollView;->clearAnimation()V
a=0;// 
a=0;//     .line 24
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// 
a=0;//     .line 20
a=0;//     :cond_1
a=0;//     #v0=(PosByte);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 21
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineHorizontalScrollView;->mProxy:Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineHorizontalScrollView;->setAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
