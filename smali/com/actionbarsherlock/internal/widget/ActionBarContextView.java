package com.actionbarsherlock.internal.widget; class ActionBarContextView { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// .super Lcom/actionbarsherlock/internal/widget/AbsActionBarView;
a=0;// .source "ActionBarContextView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ANIMATE_IDLE:I = 0x0
a=0;// 
a=0;// .field private static final ANIMATE_IN:I = 0x1
a=0;// 
a=0;// .field private static final ANIMATE_OUT:I = 0x2
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAnimateInOnLayout:Z
a=0;// 
a=0;// .field private mAnimationMode:I
a=0;// 
a=0;// .field private mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;// .field private mCurrentAnimation:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;// .field private mCustomView:Landroid/view/View;
a=0;// 
a=0;// .field private mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private mSubtitleStyleRes:I
a=0;// 
a=0;// .field private mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;// .field private mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private mTitleStyleRes:I
a=0;// 
a=0;// .field private mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 71
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     sget v0, Lcom/actionbarsherlock/R$attr;->actionModeStyle:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 75
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 78
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 80
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     sget-object v1, Lcom/actionbarsherlock/R$styleable;->SherlockActionMode:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 82
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 81
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 83
a=0;//     invoke-virtual {v0, v2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleStyleRes:I
a=0;// 
a=0;//     .line 86
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 85
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSubtitleStyleRes:I
a=0;// 
a=0;//     .line 89
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     .line 88
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mContentHeight:I
a=0;// 
a=0;//     .line 92
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     .line 91
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 94
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 95
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private finishAnimation()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 268
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mCurrentAnimation:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .line 269
a=0;//     .local v0, "a":Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 270
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mCurrentAnimation:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .line 271
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;->end()V
a=0;// 
a=0;//     .line 273
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initTitle()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v6, 0x8
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 177
a=0;//     #v4=(Null);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 178
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 179
a=0;//     .local v2, "inflater":Landroid/view/LayoutInflater;
a=0;//     #v2=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v3, Lcom/actionbarsherlock/R$layout;->abs__action_bar_title_item:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 181
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v7, Lcom/actionbarsherlock/R$id;->abs__action_bar_title:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v7, Lcom/actionbarsherlock/R$id;->abs__action_bar_subtitle:I
a=0;// 
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 183
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleStyleRes:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     iget v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleStyleRes:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v3, v7, v8}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 186
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSubtitleStyleRes:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     iget v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSubtitleStyleRes:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v3, v7, v8}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 191
a=0;//     .end local v2    # "inflater":Landroid/view/LayoutInflater;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     move v1, v4
a=0;// 
a=0;//     .line 195
a=0;//     .local v1, "hasTitle":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     move v0, v4
a=0;// 
a=0;//     .line 196
a=0;//     .local v0, "hasSubtitle":Z
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v5, v3}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     move v6, v4
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 198
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 201
a=0;//     :cond_4
a=0;//     return-void
a=0;// 
a=0;//     .end local v0    # "hasSubtitle":Z
a=0;//     .end local v1    # "hasTitle":Z
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Boolean);v5=(One);
a=0;//     move v1, v5
a=0;// 
a=0;//     .line 194
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v1    # "hasTitle":Z
a=0;//     :cond_6
a=0;//     #v1=(Boolean);
a=0;//     move v0, v5
a=0;// 
a=0;//     .line 195
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .restart local v0    # "hasSubtitle":Z
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v5=(Reference,Landroid/widget/TextView;);
a=0;//     move v3, v6
a=0;// 
a=0;//     .line 196
a=0;//     #v3=(PosByte);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private makeInAnimation()Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .line 392
a=0;//     #v12=(Null);
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     #v9=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     #v8=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;);
a=0;//     invoke-virtual {v8}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;->getWidth()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     neg-int v10, v8
a=0;// 
a=0;//     .line 393
a=0;//     #v10=(Integer);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     #v8=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;);
a=0;//     invoke-virtual {v8}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     check-cast v8, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     iget v8, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sub-int v8, v10, v8
a=0;// 
a=0;//     int-to-float v8, v8
a=0;// 
a=0;//     .line 392
a=0;//     #v8=(Float);
a=0;//     invoke-virtual {v9, v8}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;->setTranslationX(F)V
a=0;// 
a=0;//     .line 394
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     #v8=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;);
a=0;//     const-string v9, "translationX"
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     new-array v10, v10, [F
a=0;// 
a=0;//     #v10=(Reference,[F);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     aput v12, v10, v11
a=0;// 
a=0;//     invoke-static {v8, v9, v10}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 395
a=0;//     .local v2, "buttonAnimator":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     const-wide/16 v8, 0xc8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-virtual {v2, v8, v9}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setDuration(J)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     .line 396
a=0;//     invoke-virtual {v2, p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->addListener(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 397
a=0;//     new-instance v8, Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-direct {v8}, Landroid/view/animation/DecelerateInterpolator;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-virtual {v2, v8}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 399
a=0;//     new-instance v7, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-direct {v7}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;-><init>()V
a=0;// 
a=0;//     .line 400
a=0;//     .local v7, "set":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;//     #v7=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-virtual {v7, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->play(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 402
a=0;//     .local v1, "b":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 403
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 404
a=0;//     .local v4, "count":I
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_0
a=0;// 
a=0;//     .line 405
a=0;//     add-int/lit8 v5, v4, -0x1
a=0;// 
a=0;//     .local v5, "i":I
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .local v6, "j":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v6=(Integer);v8=(Conflicted);
a=0;//     if-gez v5, :cond_1
a=0;// 
a=0;//     .line 416
a=0;//     .end local v4    # "count":I
a=0;//     .end local v5    # "i":I
a=0;//     .end local v6    # "j":I
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 406
a=0;//     .restart local v4    # "count":I
a=0;//     .restart local v5    # "i":I
a=0;//     .restart local v6    # "j":I
a=0;//     :cond_1
a=0;//     #v4=(Integer);v5=(Integer);v6=(Integer);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     #v8=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     invoke-virtual {v8, v5}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 407
a=0;//     .local v3, "child":Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v3, v12}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->setScaleY(F)V
a=0;// 
a=0;//     .line 408
a=0;//     const-string v8, "scaleY"
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [F
a=0;// 
a=0;//     #v9=(Reference,[F);
a=0;//     fill-array-data v9, :array_0
a=0;// 
a=0;//     invoke-static {v3, v8, v9}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 409
a=0;//     .local v0, "a":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     const-wide/16 v8, 0x64
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-virtual {v0, v8, v9}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setDuration(J)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     .line 410
a=0;//     mul-int/lit8 v8, v6, 0x46
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     int-to-long v8, v8
a=0;// 
a=0;//     #v8=(LongLo);
a=0;//     invoke-virtual {v0, v8, v9}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setStartDelay(J)V
a=0;// 
a=0;//     .line 411
a=0;//     invoke-virtual {v1, v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;->with(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 405
a=0;//     add-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 408
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method private makeOutAnimation()Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;//     .locals 15
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .line 420
a=0;//     #v12=(Null);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     #v8=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;);
a=0;//     const-string v9, "translationX"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     new-array v10, v14, [F
a=0;// 
a=0;//     .line 421
a=0;//     #v10=(Reference,[F);
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     #v7=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;);
a=0;//     invoke-virtual {v7}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;->getWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     neg-int v11, v7
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     #v7=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;);
a=0;//     invoke-virtual {v7}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     check-cast v7, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-int v7, v11, v7
a=0;// 
a=0;//     int-to-float v7, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     aput v7, v10, v13
a=0;// 
a=0;//     .line 420
a=0;//     invoke-static {v8, v9, v10}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 422
a=0;//     .local v2, "buttonAnimator":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     const-wide/16 v7, 0xc8
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-virtual {v2, v7, v8}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setDuration(J)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     .line 423
a=0;//     invoke-virtual {v2, p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->addListener(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 424
a=0;//     new-instance v7, Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-direct {v7}, Landroid/view/animation/DecelerateInterpolator;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-virtual {v2, v7}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 426
a=0;//     new-instance v6, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-direct {v6}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;-><init>()V
a=0;// 
a=0;//     .line 427
a=0;//     .local v6, "set":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;//     #v6=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-virtual {v6, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->play(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 429
a=0;//     .local v1, "b":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;);
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 430
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 431
a=0;//     .local v4, "count":I
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_0
a=0;// 
a=0;//     .line 432
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Integer);v7=(Conflicted);
a=0;//     if-ltz v5, :cond_1
a=0;// 
a=0;//     .line 443
a=0;//     .end local v4    # "count":I
a=0;//     .end local v5    # "i":I
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 433
a=0;//     .restart local v4    # "count":I
a=0;//     .restart local v5    # "i":I
a=0;//     :cond_1
a=0;//     #v4=(Integer);v5=(Integer);
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     #v7=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     invoke-virtual {v7, v5}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 434
a=0;//     .local v3, "child":Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v3, v12}, Lcom/actionbarsherlock/internal/nineoldandroids/view/animation/AnimatorProxy;->setScaleY(F)V
a=0;// 
a=0;//     .line 435
a=0;//     const-string v7, "scaleY"
a=0;// 
a=0;//     new-array v8, v14, [F
a=0;// 
a=0;//     #v8=(Reference,[F);
a=0;//     aput v12, v8, v13
a=0;// 
a=0;//     invoke-static {v3, v7, v8}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 436
a=0;//     .local v0, "a":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     const-wide/16 v7, 0x64
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-virtual {v0, v7, v8}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setDuration(J)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     .line 437
a=0;//     mul-int/lit8 v7, v5, 0x46
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     int-to-long v7, v7
a=0;// 
a=0;//     #v7=(LongLo);
a=0;//     invoke-virtual {v0, v7, v8}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setStartDelay(J)V
a=0;// 
a=0;//     .line 438
a=0;//     invoke-virtual {v1, v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;->with(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 432
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public closeMode()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 252
a=0;//     #v1=(PosByte);
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mAnimationMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 265
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 256
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 257
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->killMode()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 261
a=0;//     :cond_1
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->finishAnimation()V
a=0;// 
a=0;//     .line 262
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mAnimationMode:I
a=0;// 
a=0;//     .line 263
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->makeOutAnimation()Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mCurrentAnimation:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .line 264
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mCurrentAnimation:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 314
a=0;//     new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/ViewGroup$MarginLayoutParams;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$MarginLayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 2
a=0;//     .param p1, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 319
a=0;//     new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/ViewGroup$MarginLayoutParams;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$MarginLayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSubtitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hideOverflowMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 296
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 297
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->hideOverflowMenu()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 299
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
a=0;// .method public initForMode(Lcom/actionbarsherlock/view/ActionMode;)V
a=0;//     .locals 8
a=0;//     .param p1, "mode"    # Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 204
a=0;//     #v6=(One);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 205
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 206
a=0;//     .local v1, "inflater":Landroid/view/LayoutInflater;
a=0;//     #v1=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v4, Lcom/actionbarsherlock/R$layout;->abs__action_mode_close_item:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v1, v4, p0, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     check-cast v4, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     iput-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 212
a=0;//     .end local v1    # "inflater":Landroid/view/LayoutInflater;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     sget v5, Lcom/actionbarsherlock/R$id;->abs__action_mode_close_button:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 213
a=0;//     .local v0, "closeButton":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     new-instance v4, Lcom/actionbarsherlock/internal/widget/ActionBarContextView$1;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/actionbarsherlock/internal/widget/ActionBarContextView$1;);
a=0;//     invoke-direct {v4, p0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView$1;-><init>(Lcom/actionbarsherlock/internal/widget/ActionBarContextView;Lcom/actionbarsherlock/view/ActionMode;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView$1;);
a=0;//     invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 219
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/view/ActionMode;->getMenu()Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/view/Menu;);
a=0;//     check-cast v3, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 220
a=0;//     .local v3, "menu":Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->dismissPopupMenus()Z
a=0;// 
a=0;//     .line 223
a=0;//     :cond_1
a=0;//     new-instance v4, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v4, v5}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     iput-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->setReserveOverflow(Z)V
a=0;// 
a=0;//     .line 226
a=0;//     new-instance v2, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v4, -0x2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     invoke-direct {v2, v4, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 228
a=0;//     .local v2, "layoutParams":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget-boolean v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSplitActionBar:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 229
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {v3, v4}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->addMenuPresenter(Lcom/actionbarsherlock/internal/view/menu/MenuPresenter;)V
a=0;// 
a=0;//     .line 230
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v4, p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     iput-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     .line 231
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v5}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {p0, v4, v2}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 248
a=0;//     :goto_1
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     iput-boolean v6, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mAnimateInOnLayout:Z
a=0;// 
a=0;//     .line 249
a=0;//     return-void
a=0;// 
a=0;//     .line 208
a=0;//     .end local v0    # "closeButton":Landroid/view/View;
a=0;//     .end local v2    # "layoutParams":Landroid/view/ViewGroup$LayoutParams;
a=0;//     .end local v3    # "menu":Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 235
a=0;//     .restart local v0    # "closeButton":Landroid/view/View;
a=0;//     .restart local v2    # "layoutParams":Landroid/view/ViewGroup$LayoutParams;
a=0;//     .restart local v3    # "menu":Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Conflicted);v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);v3=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);v4=(Boolean);v5=(Reference,Landroid/content/Context;);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     .line 236
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     .line 235
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5, v6}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->setWidthLimit(IZ)V
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     const v5, 0x7fffffff
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->setItemLimit(I)V
a=0;// 
a=0;//     .line 240
a=0;//     iput v7, v2, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     .line 241
a=0;//     iget v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mContentHeight:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v2, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     .line 242
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {v3, v4}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->addMenuPresenter(Lcom/actionbarsherlock/internal/view/menu/MenuPresenter;)V
a=0;// 
a=0;//     .line 243
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v4, p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     iput-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     .line 244
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v4, v5}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 245
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v4, v5, v2}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public isOverflowMenuShowing()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 304
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 305
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->isOverflowMenuShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 307
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
a=0;// .method public killMode()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 276
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->finishAnimation()V
a=0;// 
a=0;//     .line 277
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->removeAllViews()V
a=0;// 
a=0;//     .line 278
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 279
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 281
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iput-object v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     .line 282
a=0;//     iput-object v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     .line 283
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mAnimateInOnLayout:Z
a=0;// 
a=0;//     .line 284
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationCancel(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;//     .locals 0
a=0;//     .param p1, "animation"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 495
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationEnd(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;//     .locals 2
a=0;//     .param p1, "animation"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 487
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mAnimationMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 488
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->killMode()V
a=0;// 
a=0;//     .line 490
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mAnimationMode:I
a=0;// 
a=0;//     .line 491
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationRepeat(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;//     .locals 0
a=0;//     .param p1, "animation"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 499
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationStart(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;//     .locals 0
a=0;//     .param p1, "animation"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 483
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     invoke-super {p0}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->hideOverflowMenu()Z
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->hideSubMenus()Z
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 2
a=0;//     .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 508
a=0;//     invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x20
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 511
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 512
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 513
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setContentDescription(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 517
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 6
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "l"    # I
a=0;//     .param p3, "t"    # I
a=0;//     .param p4, "r"    # I
a=0;//     .param p5, "b"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 448
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 449
a=0;//     .local v2, "x":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getPaddingTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 450
a=0;//     .local v3, "y":I
a=0;//     #v3=(Integer);
a=0;//     sub-int v4, p5, p3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getPaddingTop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int/2addr v4, v5
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     sub-int v0, v4, v5
a=0;// 
a=0;//     .line 452
a=0;//     .local v0, "contentHeight":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;->getVisibility()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-eq v4, v5, :cond_0
a=0;// 
a=0;//     .line 453
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;);
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     .line 454
a=0;//     .local v1, "lp":Landroid/view/ViewGroup$MarginLayoutParams;
a=0;//     iget v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v2, v4
a=0;// 
a=0;//     .line 455
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;);
a=0;//     invoke-virtual {p0, v4, v2, v3, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->positionChild(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v2, v4
a=0;// 
a=0;//     .line 456
a=0;//     iget v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I
a=0;// 
a=0;//     add-int/2addr v2, v4
a=0;// 
a=0;//     .line 458
a=0;//     iget-boolean v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mAnimateInOnLayout:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 459
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iput v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mAnimationMode:I
a=0;// 
a=0;//     .line 460
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->makeInAnimation()Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;);
a=0;//     iput-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mCurrentAnimation:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .line 461
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mCurrentAnimation:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;->start()V
a=0;// 
a=0;//     .line 462
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iput-boolean v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mAnimateInOnLayout:Z
a=0;// 
a=0;//     .line 466
a=0;//     .end local v1    # "lp":Landroid/view/ViewGroup$MarginLayoutParams;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Integer);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 467
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v4, v2, v3, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->positionChild(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v2, v4
a=0;// 
a=0;//     .line 470
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 471
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v4, v2, v3, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->positionChild(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v2, v4
a=0;// 
a=0;//     .line 474
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     sub-int v4, p4, p2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getPaddingRight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     sub-int v2, v4, v5
a=0;// 
a=0;//     .line 476
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 477
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {p0, v4, v2, v3, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->positionChildInverse(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v2, v4
a=0;// 
a=0;//     .line 479
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 24
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 325
a=0;//     .local v20, "widthMode":I
a=0;//     #v20=(Integer);
a=0;//     const/high16 v21, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 326
a=0;//     new-instance v21, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v21=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v22, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v22=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     invoke-static/range {v23 .. v23}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     invoke-direct/range {v22 .. v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v23, " can only be used "
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     .line 327
a=0;//     const-string v23, "with android:layout_width=\"match_parent\" (or fill_parent)"
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     .line 326
a=0;//     invoke-direct/range {v21 .. v22}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v21
a=0;// 
a=0;//     .line 330
a=0;//     :cond_0
a=0;//     #v21=(Integer);v22=(Uninit);v23=(Uninit);
a=0;//     invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 331
a=0;//     .local v12, "heightMode":I
a=0;//     #v12=(Integer);
a=0;//     if-nez v12, :cond_1
a=0;// 
a=0;//     .line 332
a=0;//     new-instance v21, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v21=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v22, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v22=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     invoke-static/range {v23 .. v23}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     invoke-direct/range {v22 .. v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v23, " can only be used "
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     .line 333
a=0;//     const-string v23, "with android:layout_height=\"wrap_content\""
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     .line 332
a=0;//     invoke-direct/range {v21 .. v22}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v21
a=0;// 
a=0;//     .line 336
a=0;//     :cond_1
a=0;//     #v21=(Integer);v22=(Uninit);v23=(Uninit);
a=0;//     invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 338
a=0;//     .local v5, "contentWidth":I
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mContentHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     if-lez v21, :cond_6
a=0;// 
a=0;//     .line 339
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     iget v15, v0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mContentHeight:I
a=0;// 
a=0;//     .line 341
a=0;//     .local v15, "maxHeight":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v15=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getPaddingTop()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     add-int v19, v21, v22
a=0;// 
a=0;//     .line 342
a=0;//     .local v19, "verticalPadding":I
a=0;//     #v19=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     sub-int v21, v5, v21
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getPaddingRight()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     sub-int v3, v21, v22
a=0;// 
a=0;//     .line 343
a=0;//     .local v3, "availableWidth":I
a=0;//     #v3=(Integer);
a=0;//     sub-int v11, v15, v19
a=0;// 
a=0;//     .line 344
a=0;//     .local v11, "height":I
a=0;//     #v11=(Integer);
a=0;//     const/high16 v21, -0x80000000
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v11, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 346
a=0;//     .local v4, "childSpecHeight":I
a=0;//     #v4=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     #v21=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;);
a=0;//     if-eqz v21, :cond_2
a=0;// 
a=0;//     .line 347
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     #v22=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;);
a=0;//     move/from16 v2, v22
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v3, v4, v2}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->measureChildView(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 348
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mClose:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     invoke-virtual/range {v21 .. v21}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v14, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     .line 349
a=0;//     .local v14, "lp":Landroid/view/ViewGroup$MarginLayoutParams;
a=0;//     iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I
a=0;// 
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     add-int v21, v21, v22
a=0;// 
a=0;//     sub-int v3, v3, v21
a=0;// 
a=0;//     .line 352
a=0;//     .end local v14    # "lp":Landroid/view/ViewGroup$MarginLayoutParams;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v14=(Conflicted);v21=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     #v21=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     if-eqz v21, :cond_3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     invoke-virtual/range {v21 .. v21}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 353
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     .line 354
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     .line 353
a=0;//     #v22=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     move/from16 v2, v22
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v3, v4, v2}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->measureChildView(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 357
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v22=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     if-eqz v21, :cond_4
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     if-nez v21, :cond_4
a=0;// 
a=0;//     .line 358
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     #v22=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move/from16 v2, v22
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v3, v4, v2}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->measureChildView(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 361
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);v22=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     if-eqz v21, :cond_5
a=0;// 
a=0;//     .line 362
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     invoke-virtual/range {v21 .. v21}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 363
a=0;//     .local v14, "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v14=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget v0, v14, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     const/16 v22, -0x2
a=0;// 
a=0;//     #v22=(Byte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_7
a=0;// 
a=0;//     .line 364
a=0;//     const/high16 v10, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 365
a=0;//     .local v10, "customWidthMode":I
a=0;//     :goto_1
a=0;//     #v10=(Integer);
a=0;//     iget v0, v14, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     if-ltz v21, :cond_8
a=0;// 
a=0;//     .line 366
a=0;//     iget v0, v14, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 367
a=0;//     .local v9, "customWidth":I
a=0;//     :goto_2
a=0;//     #v9=(Integer);
a=0;//     iget v0, v14, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     const/16 v22, -0x2
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     if-eq v0, v1, :cond_9
a=0;// 
a=0;//     .line 368
a=0;//     const/high16 v8, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 369
a=0;//     .local v8, "customHeightMode":I
a=0;//     :goto_3
a=0;//     #v8=(Integer);
a=0;//     iget v0, v14, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     if-ltz v21, :cond_a
a=0;// 
a=0;//     .line 370
a=0;//     iget v0, v14, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     invoke-static {v0, v11}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 371
a=0;//     .local v7, "customHeight":I
a=0;//     :goto_4
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     #v21=(Reference,Landroid/view/View;);
a=0;//     invoke-static {v9, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     .line 372
a=0;//     #v22=(Integer);
a=0;//     invoke-static {v7, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     .line 371
a=0;//     #v23=(Integer);
a=0;//     invoke-virtual/range {v21 .. v23}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 375
a=0;//     .end local v7    # "customHeight":I
a=0;//     .end local v8    # "customHeightMode":I
a=0;//     .end local v9    # "customWidth":I
a=0;//     .end local v10    # "customWidthMode":I
a=0;//     .end local v14    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v14=(Conflicted);v23=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mContentHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     if-gtz v21, :cond_d
a=0;// 
a=0;//     .line 376
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     .line 377
a=0;//     .local v16, "measuredHeight":I
a=0;//     #v16=(Null);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getChildCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 378
a=0;//     .local v6, "count":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .local v13, "i":I
a=0;//     :goto_5
a=0;//     #v13=(Integer);v16=(Integer);v17=(Conflicted);v18=(Conflicted);
a=0;//     if-lt v13, v6, :cond_b
a=0;// 
a=0;//     .line 385
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     move/from16 v1, v16
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v5, v1}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 389
a=0;//     .end local v6    # "count":I
a=0;//     .end local v13    # "i":I
a=0;//     .end local v16    # "measuredHeight":I
a=0;//     :goto_6
a=0;//     #v1=(Conflicted);v6=(Conflicted);v13=(Conflicted);v16=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 339
a=0;//     .end local v3    # "availableWidth":I
a=0;//     .end local v4    # "childSpecHeight":I
a=0;//     .end local v11    # "height":I
a=0;//     .end local v15    # "maxHeight":I
a=0;//     .end local v19    # "verticalPadding":I
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v22=(Uninit);v23=(Uninit);
a=0;//     invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 364
a=0;//     .restart local v3    # "availableWidth":I
a=0;//     .restart local v4    # "childSpecHeight":I
a=0;//     .restart local v11    # "height":I
a=0;//     .restart local v14    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     .restart local v15    # "maxHeight":I
a=0;//     .restart local v19    # "verticalPadding":I
a=0;//     :cond_7
a=0;//     #v1=(Byte);v2=(Conflicted);v3=(Integer);v4=(Integer);v11=(Integer);v14=(Reference,Landroid/view/ViewGroup$LayoutParams;);v19=(Integer);v22=(Byte);
a=0;//     const/high16 v10, -0x80000000
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .restart local v10    # "customWidthMode":I
a=0;//     :cond_8
a=0;//     move v9, v3
a=0;// 
a=0;//     .line 366
a=0;//     #v9=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 368
a=0;//     .restart local v9    # "customWidth":I
a=0;//     :cond_9
a=0;//     const/high16 v8, -0x80000000
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .restart local v8    # "customHeightMode":I
a=0;//     :cond_a
a=0;//     move v7, v11
a=0;// 
a=0;//     .line 370
a=0;//     #v7=(Integer);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 379
a=0;//     .end local v8    # "customHeightMode":I
a=0;//     .end local v9    # "customWidth":I
a=0;//     .end local v10    # "customWidthMode":I
a=0;//     .end local v14    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     .restart local v6    # "count":I
a=0;//     .restart local v13    # "i":I
a=0;//     .restart local v16    # "measuredHeight":I
a=0;//     :cond_b
a=0;//     #v1=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v13=(Integer);v14=(Conflicted);v16=(Integer);v17=(Conflicted);v18=(Conflicted);v22=(Integer);v23=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     invoke-virtual {v0, v13}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 380
a=0;//     .local v18, "v":Landroid/view/View;
a=0;//     #v18=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     add-int v17, v21, v19
a=0;// 
a=0;//     .line 381
a=0;//     .local v17, "paddedViewHeight":I
a=0;//     #v17=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v16
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_c
a=0;// 
a=0;//     .line 382
a=0;//     move/from16 v16, v17
a=0;// 
a=0;//     .line 378
a=0;//     :cond_c
a=0;//     add-int/lit8 v13, v13, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 387
a=0;//     .end local v6    # "count":I
a=0;//     .end local v13    # "i":I
a=0;//     .end local v16    # "measuredHeight":I
a=0;//     .end local v17    # "paddedViewHeight":I
a=0;//     .end local v18    # "v":Landroid/view/View;
a=0;//     :cond_d
a=0;//     #v1=(Conflicted);v6=(Uninit);v13=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     invoke-virtual {v0, v5, v15}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->setMeasuredDimension(II)V
a=0;// 
a=0;//     goto :goto_6
a=0;// .end method
a=0;// 
a=0;// .method public setContentHeight(I)V
a=0;//     .locals 0
a=0;//     .param p1, "height"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mContentHeight:I
a=0;// 
a=0;//     .line 141
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCustomView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 147
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 150
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 152
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     .line 153
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 155
a=0;//     :cond_2
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->requestLayout()V
a=0;// 
a=0;//     .line 156
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSplitActionBar(Z)V
a=0;//     .locals 6
a=0;//     .param p1, "split"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 108
a=0;//     #v5=(Byte);
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSplitActionBar:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eq v2, p1, :cond_2
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 111
a=0;//     new-instance v0, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {v0, v2, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 113
a=0;//     .local v0, "layoutParams":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     if-nez p1, :cond_3
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {v2, p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 117
a=0;//     .local v1, "oldParent":Landroid/view/ViewGroup;
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 118
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {p0, v2, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 135
a=0;//     .end local v0    # "layoutParams":Landroid/view/ViewGroup$LayoutParams;
a=0;//     .end local v1    # "oldParent":Landroid/view/ViewGroup;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/widget/AbsActionBarView;->setSplitActionBar(Z)V
a=0;// 
a=0;//     .line 137
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 121
a=0;//     .restart local v0    # "layoutParams":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);v1=(Uninit);v2=(Byte);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     .line 122
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 121
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->setWidthLimit(IZ)V
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     const v3, 0x7fffffff
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->setItemLimit(I)V
a=0;// 
a=0;//     .line 126
a=0;//     iput v5, v0, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     .line 127
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mContentHeight:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {v2, p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 131
a=0;//     .restart local v1    # "oldParent":Landroid/view/ViewGroup;
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 132
a=0;//     :cond_4
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setSubtitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 0
a=0;//     .param p1, "subtitle"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 165
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->initTitle()V
a=0;// 
a=0;//     .line 166
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 0
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 160
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->initTitle()V
a=0;// 
a=0;//     .line 161
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public shouldDelayChildPressedState()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 503
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public showOverflowMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 288
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 289
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->mActionMenuPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->showOverflowMenu()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 291
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
