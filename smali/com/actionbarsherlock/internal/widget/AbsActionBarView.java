package com.actionbarsherlock.internal.widget; class AbsActionBarView { void a() { int a;
a=0;// .class public abstract Lcom/actionbarsherlock/internal/widget/AbsActionBarView;
a=0;// .super Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;
a=0;// .source "AbsActionBarView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final FADE_DURATION:I = 0xc8
a=0;// 
a=0;// .field private static final sAlphaInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;// .field protected mContentHeight:I
a=0;// 
a=0;// .field final mContext:Landroid/content/Context;
a=0;// 
a=0;// .field protected mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;// .field protected mSplitActionBar:Z
a=0;// 
a=0;// .field protected mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;// .field protected mSplitWhenNarrow:Z
a=0;// 
a=0;// .field protected final mVisAnimListener:Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;
a=0;// 
a=0;// .field protected mVisibilityAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     new-instance v0, Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     sput-object v0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->sAlphaInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/AbsActionBarView;);
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;);
a=0;//     invoke-direct {v0, p0}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;-><init>(Lcom/actionbarsherlock/internal/widget/AbsActionBarView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mVisAnimListener:Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;
a=0;// 
a=0;//     .line 56
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 57
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     invoke-direct {p0, p1, p2}, Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/AbsActionBarView;);
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;);
a=0;//     invoke-direct {v0, p0}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;-><init>(Lcom/actionbarsherlock/internal/widget/AbsActionBarView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mVisAnimListener:Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;
a=0;// 
a=0;//     .line 61
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/AbsActionBarView;);
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;);
a=0;//     invoke-direct {v0, p0}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;-><init>(Lcom/actionbarsherlock/internal/widget/AbsActionBarView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mVisAnimListener:Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;
a=0;// 
a=0;//     .line 66
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 67
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public animateToVisibility(I)V
a=0;//     .locals 11
a=0;//     .param p1, "visibility"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v10, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const-wide/16 v8, 0xc8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 135
a=0;//     #v6=(Null);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mVisibilityAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mVisibilityAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;->cancel()V
a=0;// 
a=0;//     .line 138
a=0;//     :cond_0
a=0;//     if-nez p1, :cond_3
a=0;// 
a=0;//     .line 139
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->getVisibility()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 140
a=0;//     invoke-virtual {p0, v6}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->setAlpha(F)V
a=0;// 
a=0;//     .line 141
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->setAlpha(F)V
a=0;// 
a=0;//     .line 145
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "alpha"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v5, [F
a=0;// 
a=0;//     #v4=(Reference,[F);
a=0;//     aput v10, v4, v7
a=0;// 
a=0;//     invoke-static {p0, v3, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 146
a=0;//     .local v0, "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, v8, v9}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setDuration(J)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     .line 147
a=0;//     sget-object v3, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->sAlphaInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 149
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-direct {v1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;-><init>()V
a=0;// 
a=0;//     .line 150
a=0;//     .local v1, "set":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     const-string v4, "alpha"
a=0;// 
a=0;//     new-array v5, v5, [F
a=0;// 
a=0;//     #v5=(Reference,[F);
a=0;//     aput v10, v5, v7
a=0;// 
a=0;//     invoke-static {v3, v4, v5}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 151
a=0;//     .local v2, "splitAnim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v2, v8, v9}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setDuration(J)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mVisAnimListener:Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;->withFinalVisibility(I)Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->addListener(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 153
a=0;//     invoke-virtual {v1, v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->play(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;->with(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 154
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->start()V
a=0;// 
a=0;//     .line 175
a=0;//     .end local v1    # "set":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;//     .end local v2    # "splitAnim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 156
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Uninit);v5=(One);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mVisAnimListener:Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;->withFinalVisibility(I)Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->addListener(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 157
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 160
a=0;//     .end local v0    # "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v4=(Uninit);
a=0;//     const-string v3, "alpha"
a=0;// 
a=0;//     new-array v4, v5, [F
a=0;// 
a=0;//     #v4=(Reference,[F);
a=0;//     aput v6, v4, v7
a=0;// 
a=0;//     invoke-static {p0, v3, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 161
a=0;//     .restart local v0    # "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, v8, v9}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setDuration(J)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     .line 162
a=0;//     sget-object v3, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->sAlphaInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 164
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-direct {v1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;-><init>()V
a=0;// 
a=0;//     .line 165
a=0;//     .restart local v1    # "set":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     const-string v4, "alpha"
a=0;// 
a=0;//     new-array v5, v5, [F
a=0;// 
a=0;//     #v5=(Reference,[F);
a=0;//     aput v6, v5, v7
a=0;// 
a=0;//     invoke-static {v3, v4, v5}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 166
a=0;//     .restart local v2    # "splitAnim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v2, v8, v9}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setDuration(J)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     .line 167
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mVisAnimListener:Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;->withFinalVisibility(I)Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->addListener(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 168
a=0;//     invoke-virtual {v1, v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->play(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;->with(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 169
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 171
a=0;//     .end local v1    # "set":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;//     .end local v2    # "splitAnim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v2=(Uninit);v5=(One);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mVisAnimListener:Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;->withFinalVisibility(I)Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->addListener(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 172
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dismissPopupMenus()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->dismissPopupMenus()Z
a=0;// 
a=0;//     .line 222
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getAnimatedVisibility()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mVisibilityAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mVisAnimListener:Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;
a=0;// 
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView$VisibilityAnimListener;->mFinalVisibility:I
a=0;// 
a=0;//     .line 131
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getContentHeight()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mContentHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public hideOverflowMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->hideOverflowMenu()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 204
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isOverflowMenuShowing()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->isOverflowMenuShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 211
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isOverflowReserved()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->isOverflowReserved()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected measureChildView(Landroid/view/View;III)I
a=0;//     .locals 1
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "availableWidth"    # I
a=0;//     .param p3, "childSpecHeight"    # I
a=0;//     .param p4, "spacing"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     const/high16 v0, -0x80000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p1, v0, p3}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 229
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     sub-int/2addr p2, v0
a=0;// 
a=0;//     .line 230
a=0;//     sub-int/2addr p2, p4
a=0;// 
a=0;//     .line 232
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 6
a=0;//     .param p1, "newConfig"    # Landroid/content/res/Configuration;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 74
a=0;//     #v5=(Null);
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_3
a=0;// 
a=0;//     .line 75
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 82
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-object v3, Lcom/actionbarsherlock/R$styleable;->SherlockActionBar:[I
a=0;// 
a=0;//     .line 83
a=0;//     #v3=(Reference,[I);
a=0;//     sget v4, Lcom/actionbarsherlock/R$attr;->actionBarStyle:I
a=0;// 
a=0;//     .line 82
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v2, v3, v4, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 84
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->setContentHeight(I)V
a=0;// 
a=0;//     .line 85
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 86
a=0;//     iget-boolean v1, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mSplitWhenNarrow:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 87
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 88
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     sget v2, Lcom/actionbarsherlock/R$bool;->abs__split_action_bar_is_narrow:I
a=0;// 
a=0;//     .line 87
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2}, Lcom/actionbarsherlock/internal/ResourcesCompat;->getResources_getBoolean(Landroid/content/Context;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->setSplitActionBar(Z)V
a=0;// 
a=0;//     .line 90
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 93
a=0;//     :cond_2
a=0;//     return-void
a=0;// 
a=0;//     .line 76
a=0;//     .end local v0    # "a":Landroid/content/res/TypedArray;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Integer);v2=(PosByte);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected positionChild(Landroid/view/View;III)I
a=0;//     .locals 5
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "x"    # I
a=0;//     .param p3, "y"    # I
a=0;//     .param p4, "contentHeight"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 236
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 237
a=0;//     .local v2, "childWidth":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 238
a=0;//     .local v0, "childHeight":I
a=0;//     #v0=(Integer);
a=0;//     sub-int v3, p4, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-int/lit8 v3, v3, 0x2
a=0;// 
a=0;//     add-int v1, p3, v3
a=0;// 
a=0;//     .line 240
a=0;//     .local v1, "childTop":I
a=0;//     #v1=(Integer);
a=0;//     add-int v3, p2, v2
a=0;// 
a=0;//     add-int v4, v1, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p1, p2, v1, v3, v4}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 242
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method protected positionChildInverse(Landroid/view/View;III)I
a=0;//     .locals 5
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "x"    # I
a=0;//     .param p3, "y"    # I
a=0;//     .param p4, "contentHeight"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 247
a=0;//     .local v2, "childWidth":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 248
a=0;//     .local v0, "childHeight":I
a=0;//     #v0=(Integer);
a=0;//     sub-int v3, p4, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-int/lit8 v3, v3, 0x2
a=0;// 
a=0;//     add-int v1, p3, v3
a=0;// 
a=0;//     .line 250
a=0;//     .local v1, "childTop":I
a=0;//     #v1=(Integer);
a=0;//     sub-int v3, p2, v2
a=0;// 
a=0;//     add-int v4, v1, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p1, v3, v1, p2, v4}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 252
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method public postShowOverflowMenu()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/AbsActionBarView$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView$1;-><init>(Lcom/actionbarsherlock/internal/widget/AbsActionBarView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/AbsActionBarView$1;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 198
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentHeight(I)V
a=0;//     .locals 0
a=0;//     .param p1, "height"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mContentHeight:I
a=0;// 
a=0;//     .line 113
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->requestLayout()V
a=0;// 
a=0;//     .line 114
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSplitActionBar(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "split"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mSplitActionBar:Z
a=0;// 
a=0;//     .line 101
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSplitView(Lcom/actionbarsherlock/internal/widget/ActionBarContainer;)V
a=0;//     .locals 0
a=0;//     .param p1, "splitView"    # Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     .line 122
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSplitWhenNarrow(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "splitWhenNarrow"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mSplitWhenNarrow:Z
a=0;// 
a=0;//     .line 109
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setVisibility(I)V
a=0;//     .locals 1
a=0;//     .param p1, "visibility"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mVisibilityAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mVisibilityAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;->end()V
a=0;// 
a=0;//     .line 182
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/view/NineViewGroup;->setVisibility(I)V
a=0;// 
a=0;//     .line 183
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showOverflowMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->showOverflowMenu()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 189
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
