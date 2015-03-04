package com.actionbarsherlock.internal.widget; class FakeDialogPhoneWindow { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/widget/FakeDialogPhoneWindow;
a=0;// .super Landroid/widget/LinearLayout;
a=0;// .source "FakeDialogPhoneWindow.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final mMinWidthMajor:Landroid/util/TypedValue;
a=0;// 
a=0;// .field final mMinWidthMinor:Landroid/util/TypedValue;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 13
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/FakeDialogPhoneWindow;);
a=0;//     new-instance v1, Landroid/util/TypedValue;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/TypedValue;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/FakeDialogPhoneWindow;->mMinWidthMajor:Landroid/util/TypedValue;
a=0;// 
a=0;//     .line 14
a=0;//     new-instance v1, Landroid/util/TypedValue;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/TypedValue;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/FakeDialogPhoneWindow;->mMinWidthMinor:Landroid/util/TypedValue;
a=0;// 
a=0;//     .line 19
a=0;//     sget-object v1, Lcom/actionbarsherlock/R$styleable;->SherlockTheme:[I
a=0;// 
a=0;//     invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 21
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/16 v1, 0x31
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/FakeDialogPhoneWindow;->mMinWidthMajor:Landroid/util/TypedValue;
a=0;// 
a=0;//     #v2=(Reference,Landroid/util/TypedValue;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
a=0;// 
a=0;//     .line 22
a=0;//     const/16 v1, 0x32
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/FakeDialogPhoneWindow;->mMinWidthMinor:Landroid/util/TypedValue;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
a=0;// 
a=0;//     .line 24
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 9
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v8, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 30
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/FakeDialogPhoneWindow;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 31
a=0;//     .local v2, "metrics":Landroid/util/DisplayMetrics;
a=0;//     #v2=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     iget v6, v2, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, v2, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v6, v7, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 33
a=0;//     .local v0, "isPortrait":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V
a=0;// 
a=0;//     .line 35
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/FakeDialogPhoneWindow;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 36
a=0;//     .local v5, "width":I
a=0;//     #v5=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 38
a=0;//     .local v1, "measure":Z
a=0;//     #v1=(Null);
a=0;//     invoke-static {v5, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 40
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/FakeDialogPhoneWindow;->mMinWidthMinor:Landroid/util/TypedValue;
a=0;// 
a=0;//     .line 42
a=0;//     .local v4, "tv":Landroid/util/TypedValue;
a=0;//     :goto_1
a=0;//     #v4=(Reference,Landroid/util/TypedValue;);
a=0;//     iget v6, v4, Landroid/util/TypedValue;->type:I
a=0;// 
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 44
a=0;//     iget v6, v4, Landroid/util/TypedValue;->type:I
a=0;// 
a=0;//     const/4 v7, 0x5
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-ne v6, v7, :cond_4
a=0;// 
a=0;//     .line 45
a=0;//     invoke-virtual {v4, v2}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     float-to-int v3, v6
a=0;// 
a=0;//     .line 52
a=0;//     .local v3, "min":I
a=0;//     :goto_2
a=0;//     #v3=(Integer);v6=(Integer);v7=(Float);
a=0;//     if-ge v5, v3, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     invoke-static {v3, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 54
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 60
a=0;//     .end local v3    # "min":I
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v3=(Conflicted);v7=(Integer);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 61
a=0;//     invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V
a=0;// 
a=0;//     .line 63
a=0;//     :cond_1
a=0;//     return-void
a=0;// 
a=0;//     .line 31
a=0;//     .end local v0    # "isPortrait":Z
a=0;//     .end local v1    # "measure":Z
a=0;//     .end local v4    # "tv":Landroid/util/TypedValue;
a=0;//     .end local v5    # "width":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 40
a=0;//     .restart local v0    # "isPortrait":Z
a=0;//     .restart local v1    # "measure":Z
a=0;//     .restart local v5    # "width":I
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Null);v5=(Integer);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/FakeDialogPhoneWindow;->mMinWidthMajor:Landroid/util/TypedValue;
a=0;// 
a=0;//     #v4=(Reference,Landroid/util/TypedValue;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 46
a=0;//     .restart local v4    # "tv":Landroid/util/TypedValue;
a=0;//     :cond_4
a=0;//     #v7=(PosByte);
a=0;//     iget v6, v4, Landroid/util/TypedValue;->type:I
a=0;// 
a=0;//     const/4 v7, 0x6
a=0;// 
a=0;//     if-ne v6, v7, :cond_5
a=0;// 
a=0;//     .line 47
a=0;//     iget v6, v2, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iget v7, v2, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     int-to-float v7, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     invoke-virtual {v4, v6, v7}, Landroid/util/TypedValue;->getFraction(FF)F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     float-to-int v3, v6
a=0;// 
a=0;//     .line 48
a=0;//     .restart local v3    # "min":I
a=0;//     #v3=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 49
a=0;//     .end local v3    # "min":I
a=0;//     :cond_5
a=0;//     #v3=(Uninit);v6=(Integer);v7=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .restart local v3    # "min":I
a=0;//     #v3=(Null);
a=0;//     goto :goto_2
a=0;// .end method
}}
