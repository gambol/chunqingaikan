package com.actionbarsherlock.internal.widget; class ActionBarContainer { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// .super Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;
a=0;// .source "ActionBarContainer.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActionBarView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;// .field private mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mIsSplit:Z
a=0;// 
a=0;// .field private mIsStacked:Z
a=0;// 
a=0;// .field private mIsTransitioning:Z
a=0;// 
a=0;// .field private mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mTabContainer:Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 53
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 8
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 56
a=0;//     #v4=(One);
a=0;//     invoke-direct {p0, p1, p2}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 58
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {p0, v6}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 61
a=0;//     sget-object v6, Lcom/actionbarsherlock/R$styleable;->SherlockActionBar:[I
a=0;// 
a=0;//     .line 60
a=0;//     #v6=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 62
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v0, v6}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v6, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 64
a=0;//     const/16 v6, 0xc
a=0;// 
a=0;//     .line 63
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v0, v6}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v6, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 67
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     instance-of v6, v6, Landroid/graphics/drawable/ColorDrawable;
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     sget v6, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/16 v7, 0xb
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-ge v6, v7, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {v4, v4, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 69
a=0;//     .local v1, "bitmap":Landroid/graphics/Bitmap;
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     new-instance v2, Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 70
a=0;//     .local v2, "c":Landroid/graphics/Canvas;
a=0;//     #v2=(Reference,Landroid/graphics/Canvas;);
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v6, v2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 71
a=0;//     invoke-virtual {v1, v5, v5}, Landroid/graphics/Bitmap;->getPixel(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 72
a=0;//     .local v3, "color":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 73
a=0;//     new-instance v6, Lcom/actionbarsherlock/internal/widget/IcsColorDrawable;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsColorDrawable;);
a=0;//     invoke-direct {v6, v3}, Lcom/actionbarsherlock/internal/widget/IcsColorDrawable;-><init>(I)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/actionbarsherlock/internal/widget/IcsColorDrawable;);
a=0;//     iput-object v6, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 76
a=0;//     .end local v1    # "bitmap":Landroid/graphics/Bitmap;
a=0;//     .end local v2    # "c":Landroid/graphics/Canvas;
a=0;//     .end local v3    # "color":I
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getId()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sget v7, Lcom/actionbarsherlock/R$id;->abs__split_action_bar:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v6, v7, :cond_1
a=0;// 
a=0;//     .line 77
a=0;//     iput-boolean v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mIsSplit:Z
a=0;// 
a=0;//     .line 79
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     .line 78
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v0, v6}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v6, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 81
a=0;//     :cond_1
a=0;//     #v6=(Conflicted);
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 83
a=0;//     iget-boolean v6, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mIsSplit:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {p0, v4}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(One);
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 83
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 84
a=0;//     :cond_4
a=0;//     #v4=(One);v6=(Boolean);
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v6, :cond_5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     :cond_5
a=0;//     move v4, v5
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getTabContainer()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 1
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 177
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 167
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mIsSplit:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 170
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 173
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mIsStacked:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onFinishInflate()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     invoke-super {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;->onFinishInflate()V
a=0;// 
a=0;//     .line 90
a=0;//     sget v0, Lcom/actionbarsherlock/R$id;->abs__action_bar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mActionBarView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     .line 91
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onHoverEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;->onHoverEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     .line 140
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mIsTransitioning:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onLayout(ZIIII)V
a=0;//     .locals 13
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "l"    # I
a=0;//     .param p3, "t"    # I
a=0;//     .param p4, "r"    # I
a=0;//     .param p5, "b"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 209
a=0;//     invoke-super/range {p0 .. p5}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;->onLayout(ZIIII)V
a=0;// 
a=0;//     .line 211
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/16 v9, 0x8
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     if-eq v8, v9, :cond_3
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 213
a=0;//     .local v4, "hasTabs":Z
a=0;//     :goto_0
a=0;//     #v4=(Boolean);v8=(Conflicted);v9=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/16 v9, 0x8
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     if-eq v8, v9, :cond_0
a=0;// 
a=0;//     .line 214
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 215
a=0;//     .local v2, "containerHeight":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 217
a=0;//     .local v7, "tabHeight":I
a=0;//     #v7=(Integer);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mActionBarView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getDisplayOptions()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     and-int/lit8 v8, v8, 0x2
a=0;// 
a=0;//     if-nez v8, :cond_7
a=0;// 
a=0;//     .line 219
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 220
a=0;//     .local v3, "count":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v5=(Integer);v8=(Conflicted);
a=0;//     if-lt v5, v3, :cond_4
a=0;// 
a=0;//     .line 229
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     move/from16 v0, p4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v8, p2, v9, v0, v7}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 235
a=0;//     .end local v2    # "containerHeight":I
a=0;//     .end local v3    # "count":I
a=0;//     .end local v5    # "i":I
a=0;//     .end local v7    # "tabHeight":I
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 236
a=0;//     .local v6, "needsInvalidate":Z
a=0;//     #v6=(Null);
a=0;//     iget-boolean v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mIsSplit:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_8
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v8=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {v8, v9, v10, v11, v12}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 239
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 254
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     #v6=(Boolean);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 255
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->invalidate()V
a=0;// 
a=0;//     .line 257
a=0;//     :cond_2
a=0;//     return-void
a=0;// 
a=0;//     .line 211
a=0;//     .end local v4    # "hasTabs":Z
a=0;//     .end local v6    # "needsInvalidate":Z
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 221
a=0;//     .restart local v2    # "containerHeight":I
a=0;//     .restart local v3    # "count":I
a=0;//     .restart local v4    # "hasTabs":Z
a=0;//     .restart local v5    # "i":I
a=0;//     .restart local v7    # "tabHeight":I
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Integer);v3=(Integer);v4=(Boolean);v5=(Integer);v7=(Integer);v9=(PosByte);
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 223
a=0;//     .local v1, "child":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     if-ne v1, v8, :cond_6
a=0;// 
a=0;//     .line 220
a=0;//     :cond_5
a=0;//     :goto_4
a=0;//     #v8=(Conflicted);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 225
a=0;//     :cond_6
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mActionBarView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->isCollapsed()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_5
a=0;// 
a=0;//     .line 226
a=0;//     invoke-virtual {v1, v7}, Landroid/view/View;->offsetTopAndBottom(I)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 231
a=0;//     .end local v1    # "child":Landroid/view/View;
a=0;//     .end local v3    # "count":I
a=0;//     .end local v5    # "i":I
a=0;//     :cond_7
a=0;//     #v1=(Uninit);v3=(Uninit);v5=(Uninit);v8=(Integer);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     sub-int v9, v2, v7
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     move/from16 v0, p4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v8, p2, v9, v0, v2}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 242
a=0;//     .end local v2    # "containerHeight":I
a=0;//     .end local v7    # "tabHeight":I
a=0;//     .restart local v6    # "needsInvalidate":Z
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Null);v7=(Conflicted);v8=(Boolean);v9=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v8=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v8, :cond_9
a=0;// 
a=0;//     .line 243
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mActionBarView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v9=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v9}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getLeft()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iget-object v10, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mActionBarView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v10=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v10}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getTop()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 244
a=0;//     #v10=(Integer);
a=0;//     iget-object v11, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mActionBarView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v11=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v11}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getRight()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     iget-object v12, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mActionBarView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v12=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v12}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getBottom()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 243
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {v8, v9, v10, v11, v12}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 245
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 247
a=0;//     :cond_9
a=0;//     #v6=(Boolean);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     if-eqz v4, :cond_a
a=0;// 
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eqz v8, :cond_a
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     :goto_5
a=0;//     #v8=(Boolean);
a=0;//     iput-boolean v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mIsStacked:Z
a=0;// 
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     .line 248
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v8=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v9}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iget-object v10, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v10=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v10}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 249
a=0;//     #v10=(Integer);
a=0;//     iget-object v11, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v11}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     iget-object v12, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v12=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v12}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 248
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {v8, v9, v10, v11, v12}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 250
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 247
a=0;//     :cond_a
a=0;//     #v6=(Boolean);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     goto :goto_5
a=0;// .end method
a=0;// 
a=0;// .method public onMeasure(II)V
a=0;//     .locals 6
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     invoke-super {p0, p1, p2}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;->onMeasure(II)V
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mActionBarView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 205
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 192
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);v5=(Uninit);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mActionBarView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     .line 193
a=0;//     .local v1, "lp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mActionBarView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->isCollapsed()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 196
a=0;//     .local v0, "actionBarViewHeight":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v4=(Integer);v5=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-eq v4, v5, :cond_0
a=0;// 
a=0;//     .line 197
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 198
a=0;//     .local v3, "mode":I
a=0;//     #v3=(Integer);
a=0;//     const/high16 v4, -0x80000000
a=0;// 
a=0;//     if-ne v3, v4, :cond_0
a=0;// 
a=0;//     .line 199
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 200
a=0;//     .local v2, "maxHeight":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v5, v0
a=0;// 
a=0;//     invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 200
a=0;//     invoke-virtual {p0, v4, v5}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setMeasuredDimension(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 194
a=0;//     .end local v0    # "actionBarViewHeight":I
a=0;//     .end local v2    # "maxHeight":I
a=0;//     .end local v3    # "mode":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Uninit);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mActionBarView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v4, v5
a=0;// 
a=0;//     iget v5, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     add-int v0, v4, v5
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     .line 132
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setPrimaryBackground(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 0
a=0;//     .param p1, "bg"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 95
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->invalidate()V
a=0;// 
a=0;//     .line 96
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSplitBackground(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 0
a=0;//     .param p1, "bg"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 105
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->invalidate()V
a=0;// 
a=0;//     .line 106
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setStackedBackground(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 0
a=0;//     .param p1, "bg"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->invalidate()V
a=0;// 
a=0;//     .line 101
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTabContainer(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)V
a=0;//     .locals 2
a=0;//     .param p1, "tabView"    # Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 147
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     .line 148
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 149
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 150
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 151
a=0;//     .local v0, "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     .line 152
a=0;//     const/4 v1, -0x2
a=0;// 
a=0;//     iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     .line 153
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setAllowCollapse(Z)V
a=0;// 
a=0;//     .line 155
a=0;//     .end local v0    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/view/View;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTransitioning(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "isTransitioning"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->mIsTransitioning:Z
a=0;// 
a=0;//     .line 118
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/high16 v0, 0x60000
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setDescendantFocusability(I)V
a=0;// 
a=0;//     .line 120
a=0;//     return-void
a=0;// 
a=0;//     .line 119
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/high16 v0, 0x40000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
}}
