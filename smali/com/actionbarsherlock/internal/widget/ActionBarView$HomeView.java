package com.actionbarsherlock.internal.widget; class ActionBarView$HomeView { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;
a=0;// .super Landroid/widget/FrameLayout;
a=0;// .source "ActionBarView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "HomeView"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private mUpView:Landroid/view/View;
a=0;// 
a=0;// .field private mUpWidth:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1294
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 1295
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1298
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 1299
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public dispatchHoverEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1329
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->onHoverEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1311
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 1312
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getLeftOffset()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1339
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mUpWidth:I
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onFinishInflate()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1334
a=0;//     sget v0, Lcom/actionbarsherlock/R$id;->abs__up:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/view/View;
a=0;// 
a=0;//     .line 1335
a=0;//     sget v0, Lcom/actionbarsherlock/R$id;->abs__home:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 1336
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 15
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "l"    # I
a=0;//     .param p3, "t"    # I
a=0;//     .param p4, "r"    # I
a=0;//     .param p5, "b"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1387
a=0;//     sub-int v12, p5, p3
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     div-int/lit8 v11, v12, 0x2
a=0;// 
a=0;//     .line 1389
a=0;//     .local v11, "vCenter":I
a=0;//     #v11=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 1390
a=0;//     .local v8, "upOffset":I
a=0;//     #v8=(Null);
a=0;//     iget-object v12, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/view/View;
a=0;// 
a=0;//     #v12=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v12}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     const/16 v13, 0x8
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     if-eq v12, v13, :cond_0
a=0;// 
a=0;//     .line 1391
a=0;//     iget-object v12, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/view/View;
a=0;// 
a=0;//     #v12=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v7, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     .line 1392
a=0;//     .local v7, "upLp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     iget-object v12, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1393
a=0;//     .local v6, "upHeight":I
a=0;//     #v6=(Integer);
a=0;//     iget-object v12, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 1394
a=0;//     .local v10, "upWidth":I
a=0;//     #v10=(Integer);
a=0;//     div-int/lit8 v12, v6, 0x2
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     sub-int v9, v11, v12
a=0;// 
a=0;//     .line 1395
a=0;//     .local v9, "upTop":I
a=0;//     #v9=(Integer);
a=0;//     iget-object v12, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/view/View;
a=0;// 
a=0;//     #v12=(Reference,Landroid/view/View;);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     add-int v14, v9, v6
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v12, v13, v9, v10, v14}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 1396
a=0;//     iget v12, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     add-int/2addr v12, v10
a=0;// 
a=0;//     iget v13, v7, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     add-int v8, v12, v13
a=0;// 
a=0;//     .line 1398
a=0;//     #v8=(Integer);
a=0;//     add-int p2, p2, v8
a=0;// 
a=0;//     .line 1400
a=0;//     .end local v6    # "upHeight":I
a=0;//     .end local v7    # "upLp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     .end local v9    # "upTop":I
a=0;//     .end local v10    # "upWidth":I
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v14=(Conflicted);
a=0;//     iget-object v12, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v12=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v12}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v3, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     .line 1401
a=0;//     .local v3, "iconLp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     iget-object v12, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v12}, Landroid/widget/ImageView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1402
a=0;//     .local v1, "iconHeight":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v12, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v12}, Landroid/widget/ImageView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1403
a=0;//     .local v5, "iconWidth":I
a=0;//     #v5=(Integer);
a=0;//     sub-int v12, p4, p2
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     div-int/lit8 v0, v12, 0x2
a=0;// 
a=0;//     .line 1404
a=0;//     .local v0, "hCenter":I
a=0;//     #v0=(Integer);
a=0;//     iget v12, v3, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     div-int/lit8 v13, v5, 0x2
a=0;// 
a=0;//     sub-int v13, v0, v13
a=0;// 
a=0;//     invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     add-int v2, v8, v12
a=0;// 
a=0;//     .line 1405
a=0;//     .local v2, "iconLeft":I
a=0;//     #v2=(Integer);
a=0;//     iget v12, v3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     div-int/lit8 v13, v1, 0x2
a=0;// 
a=0;//     sub-int v13, v11, v13
a=0;// 
a=0;//     invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1406
a=0;//     .local v4, "iconTop":I
a=0;//     #v4=(Integer);
a=0;//     iget-object v12, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v12=(Reference,Landroid/widget/ImageView;);
a=0;//     add-int v13, v2, v5
a=0;// 
a=0;//     add-int v14, v4, v1
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v12, v2, v4, v13, v14}, Landroid/widget/ImageView;->layout(IIII)V
a=0;// 
a=0;//     .line 1407
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 13
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1344
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;);
a=0;//     move v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v4, p2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->measureChildWithMargins(Landroid/view/View;IIII)V
a=0;// 
a=0;//     .line 1345
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v10, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     .line 1346
a=0;//     .local v10, "upLp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     iget v0, v10, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     iget v1, v10, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mUpWidth:I
a=0;// 
a=0;//     .line 1347
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1348
a=0;//     .local v3, "width":I
a=0;//     :goto_0
a=0;//     #v3=(Integer);
a=0;//     iget v0, v10, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     iget v1, v10, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     add-int v6, v0, v1
a=0;// 
a=0;//     .line 1349
a=0;//     .local v6, "height":I
a=0;//     #v6=(Integer);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;);
a=0;//     move v2, p1
a=0;// 
a=0;//     move v4, p2
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->measureChildWithMargins(Landroid/view/View;IIII)V
a=0;// 
a=0;//     .line 1350
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v9, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     .line 1351
a=0;//     .local v9, "iconLp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     iget v0, v9, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/ImageView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     iget v1, v9, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     add-int/2addr v3, v0
a=0;// 
a=0;//     .line 1353
a=0;//     iget v0, v9, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v1}, Landroid/widget/ImageView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     iget v1, v9, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     .line 1352
a=0;//     invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1355
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 1356
a=0;//     .local v11, "widthMode":I
a=0;//     #v11=(Integer);
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 1357
a=0;//     .local v7, "heightMode":I
a=0;//     #v7=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 1358
a=0;//     .local v12, "widthSize":I
a=0;//     #v12=(Integer);
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 1360
a=0;//     .local v8, "heightSize":I
a=0;//     #v8=(Integer);
a=0;//     sparse-switch v11, :sswitch_data_0
a=0;// 
a=0;//     .line 1371
a=0;//     :goto_1
a=0;//     sparse-switch v7, :sswitch_data_1
a=0;// 
a=0;//     .line 1382
a=0;//     :goto_2
a=0;//     invoke-virtual {p0, v3, v6}, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 1383
a=0;//     return-void
a=0;// 
a=0;//     .line 1347
a=0;//     .end local v3    # "width":I
a=0;//     .end local v6    # "height":I
a=0;//     .end local v7    # "heightMode":I
a=0;//     .end local v8    # "heightSize":I
a=0;//     .end local v9    # "iconLp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     .end local v11    # "widthMode":I
a=0;//     .end local v12    # "widthSize":I
a=0;//     :cond_0
a=0;//     #v1=(PosByte);v3=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mUpWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1362
a=0;//     .restart local v3    # "width":I
a=0;//     .restart local v6    # "height":I
a=0;//     .restart local v7    # "heightMode":I
a=0;//     .restart local v8    # "heightSize":I
a=0;//     .restart local v9    # "iconLp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     .restart local v11    # "widthMode":I
a=0;//     .restart local v12    # "widthSize":I
a=0;//     :sswitch_0
a=0;//     #v1=(Integer);v6=(Integer);v7=(Integer);v8=(Integer);v9=(Reference,Landroid/widget/FrameLayout$LayoutParams;);v11=(Integer);v12=(Integer);
a=0;//     invoke-static {v3, v12}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1363
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1365
a=0;//     :sswitch_1
a=0;//     move v3, v12
a=0;// 
a=0;//     .line 1366
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1373
a=0;//     :sswitch_2
a=0;//     invoke-static {v6, v8}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1374
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1376
a=0;//     :sswitch_3
a=0;//     move v6, v8
a=0;// 
a=0;//     .line 1377
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1360
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         -0x80000000 -> :sswitch_0
a=0;//         0x40000000 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// 
a=0;//     .line 1371
a=0;//     :sswitch_data_1
a=0;//     .sparse-switch
a=0;//         -0x80000000 -> :sswitch_2
a=0;//         0x40000000 -> :sswitch_3
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 3
a=0;//     .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1317
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xe
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 1318
a=0;//     invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 1320
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->getContentDescription()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1321
a=0;//     .local v0, "cdesc":Ljava/lang/CharSequence;
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1322
a=0;//     invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1324
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1306
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 1307
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setUp(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "isUp"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1302
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 1303
a=0;//     return-void
a=0;// 
a=0;//     .line 1302
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
}}
