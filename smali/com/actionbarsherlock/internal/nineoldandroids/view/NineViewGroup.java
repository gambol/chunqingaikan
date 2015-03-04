package com.actionbarsherlock.internal.nineoldandroids.view; class NineViewGroup { void a() { int a;
a=0;// .class public abstract Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;
a=0;// .super Landroid/view/ViewGroup;
a=0;// .source "NineViewGroup.java"
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
a=0;//     .line 13
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 14
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;);
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
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;->mProxy:Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     .line 15
a=0;//     return-void
a=0;// 
a=0;//     .line 14
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 18
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;);
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
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;->mProxy:Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     .line 19
a=0;//     return-void
a=0;// 
a=0;//     .line 18
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 22
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;);
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
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;->mProxy:Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     .line 23
a=0;//     return-void
a=0;// 
a=0;//     .line 22
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
a=0;//     .line 38
a=0;//     sget-boolean v0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;->mProxy:Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->getAlpha()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 41
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->getAlpha()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getTranslationX()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     sget-boolean v0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;->mProxy:Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->getTranslationX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 55
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->getTranslationX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getTranslationY()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     sget-boolean v0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;->mProxy:Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->getTranslationY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 69
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->getTranslationY()F
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
a=0;//     .line 45
a=0;//     sget-boolean v0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;->mProxy:Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->setAlpha(F)V
a=0;// 
a=0;//     .line 50
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 48
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->setAlpha(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setTranslationX(F)V
a=0;//     .locals 1
a=0;//     .param p1, "translationX"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     sget-boolean v0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;->mProxy:Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->setTranslationX(F)V
a=0;// 
a=0;//     .line 64
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 62
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->setTranslationX(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setTranslationY(F)V
a=0;//     .locals 1
a=0;//     .param p1, "translationY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     sget-boolean v0, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;->mProxy:Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->setTranslationY(F)V
a=0;// 
a=0;//     .line 78
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 76
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->setTranslationY(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setVisibility(I)V
a=0;//     .locals 1
a=0;//     .param p1, "visibility"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;->mProxy:Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 28
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     .line 29
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;->clearAnimation()V
a=0;// 
a=0;//     .line 34
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V
a=0;// 
a=0;//     .line 35
a=0;//     return-void
a=0;// 
a=0;//     .line 30
a=0;//     :cond_1
a=0;//     #v0=(PosByte);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;->mProxy:Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;->setAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
