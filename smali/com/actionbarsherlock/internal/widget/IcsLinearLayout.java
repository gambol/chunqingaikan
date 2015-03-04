package com.actionbarsherlock.internal.widget; class IcsLinearLayout { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// .super Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;
a=0;// .source "IcsLinearLayout.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final LinearLayout_divider:I = 0x0
a=0;// 
a=0;// .field private static final LinearLayout_dividerPadding:I = 0x3
a=0;// 
a=0;// .field private static final LinearLayout_measureWithLargestChild:I = 0x1
a=0;// 
a=0;// .field private static final LinearLayout_showDividers:I = 0x2
a=0;// 
a=0;// .field private static final R_styleable_LinearLayout:[I
a=0;// 
a=0;// .field public static final SHOW_DIVIDER_BEGINNING:I = 0x1
a=0;// 
a=0;// .field public static final SHOW_DIVIDER_END:I = 0x4
a=0;// 
a=0;// .field public static final SHOW_DIVIDER_MIDDLE:I = 0x2
a=0;// 
a=0;// .field public static final SHOW_DIVIDER_NONE:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mDividerHeight:I
a=0;// 
a=0;// .field private mDividerPadding:I
a=0;// 
a=0;// .field private mDividerWidth:I
a=0;// 
a=0;// .field private mShowDividers:I
a=0;// 
a=0;// .field private mUseLargestChild:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->R_styleable_LinearLayout:[I
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// 
a=0;//     .line 21
a=0;//     #v0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x1010129
a=0;//         0x10102d4
a=0;//         0x1010329
a=0;//         0x101032a
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 59
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 61
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;);
a=0;//     sget-object v1, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->R_styleable_LinearLayout:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 63
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->setDividerDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 64
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mShowDividers:I
a=0;// 
a=0;//     .line 65
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerPadding:I
a=0;// 
a=0;//     .line 66
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mUseLargestChild:Z
a=0;// 
a=0;//     .line 68
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private useLargestChildHorizontal()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v9, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 328
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 331
a=0;//     .local v1, "childCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 332
a=0;//     .local v4, "largestChildWidth":I
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Integer);v4=(Integer);v7=(Conflicted);
a=0;//     if-lt v3, v1, :cond_0
a=0;// 
a=0;//     .line 337
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 339
a=0;//     .local v6, "totalWidth":I
a=0;//     #v6=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v5=(Conflicted);v6=(Integer);v8=(Conflicted);
a=0;//     if-lt v3, v1, :cond_1
a=0;// 
a=0;//     .line 365
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     add-int/2addr v7, v8
a=0;// 
a=0;//     add-int/2addr v6, v7
a=0;// 
a=0;//     .line 366
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     invoke-virtual {p0, v6, v7}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 367
a=0;//     return-void
a=0;// 
a=0;//     .line 333
a=0;//     .end local v6    # "totalWidth":I
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Conflicted);v8=(Uninit);
a=0;//     invoke-virtual {p0, v3}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 334
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 332
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 340
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .restart local v6    # "totalWidth":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {p0, v3}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 342
a=0;//     .restart local v0    # "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/16 v8, 0x8
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-ne v7, v8, :cond_3
a=0;// 
a=0;//     .line 339
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 347
a=0;//     :cond_3
a=0;//     #v7=(Integer);v8=(PosByte);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v5, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 349
a=0;//     .local v5, "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     iget v2, v5, Landroid/widget/LinearLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     .line 350
a=0;//     .local v2, "childExtra":F
a=0;//     #v2=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     cmpl-float v7, v2, v7
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-lez v7, :cond_4
a=0;// 
a=0;//     .line 352
a=0;//     invoke-static {v4, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 354
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v8, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 351
a=0;//     invoke-virtual {v0, v7, v8}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 356
a=0;//     add-int/2addr v6, v4
a=0;// 
a=0;//     .line 362
a=0;//     :goto_3
a=0;//     iget v7, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     iget v8, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     add-int/2addr v7, v8
a=0;// 
a=0;//     add-int/2addr v6, v7
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 359
a=0;//     :cond_4
a=0;//     #v7=(Byte);v8=(PosByte);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/2addr v6, v7
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method private useLargestChildVertical()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v9, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 370
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 373
a=0;//     .local v1, "childCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 374
a=0;//     .local v4, "largestChildHeight":I
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Integer);v4=(Integer);v7=(Conflicted);
a=0;//     if-lt v3, v1, :cond_0
a=0;// 
a=0;//     .line 379
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 381
a=0;//     .local v6, "totalHeight":I
a=0;//     #v6=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v5=(Conflicted);v6=(Integer);v8=(Conflicted);
a=0;//     if-lt v3, v1, :cond_1
a=0;// 
a=0;//     .line 407
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     add-int/2addr v7, v8
a=0;// 
a=0;//     add-int/2addr v6, v7
a=0;// 
a=0;//     .line 408
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     invoke-virtual {p0, v7, v6}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 409
a=0;//     return-void
a=0;// 
a=0;//     .line 375
a=0;//     .end local v6    # "totalHeight":I
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Conflicted);v8=(Uninit);
a=0;//     invoke-virtual {p0, v3}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 376
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 374
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 382
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .restart local v6    # "totalHeight":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {p0, v3}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 384
a=0;//     .restart local v0    # "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/16 v8, 0x8
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-ne v7, v8, :cond_3
a=0;// 
a=0;//     .line 381
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 389
a=0;//     :cond_3
a=0;//     #v7=(Integer);v8=(PosByte);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v5, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 391
a=0;//     .local v5, "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     iget v2, v5, Landroid/widget/LinearLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     .line 392
a=0;//     .local v2, "childExtra":F
a=0;//     #v2=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     cmpl-float v7, v2, v7
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-lez v7, :cond_4
a=0;// 
a=0;//     .line 394
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 396
a=0;//     invoke-static {v4, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 393
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v0, v7, v8}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 398
a=0;//     add-int/2addr v6, v4
a=0;// 
a=0;//     .line 404
a=0;//     :goto_3
a=0;//     iget v7, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     iget v8, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     add-int/2addr v7, v8
a=0;// 
a=0;//     add-int/2addr v6, v7
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 401
a=0;//     :cond_4
a=0;//     #v7=(Byte);v8=(PosByte);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/2addr v6, v7
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method drawDividersHorizontal(Landroid/graphics/Canvas;)V
a=0;//     .locals 8
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 217
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-lt v2, v1, :cond_1
a=0;// 
a=0;//     .line 229
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->hasDividerBeforeChildAt(I)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 230
a=0;//     add-int/lit8 v6, v1, -0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p0, v6}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 231
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 232
a=0;//     .local v5, "right":I
a=0;//     #v5=(Null);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 233
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-int/2addr v6, v7
a=0;// 
a=0;//     iget v7, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerWidth:I
a=0;// 
a=0;//     sub-int v5, v6, v7
a=0;// 
a=0;//     .line 238
a=0;//     :goto_1
a=0;//     #v5=(Integer);v7=(Conflicted);
a=0;//     invoke-virtual {p0, p1, v5}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->drawVerticalDivider(Landroid/graphics/Canvas;I)V
a=0;// 
a=0;//     .line 240
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .end local v5    # "right":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 218
a=0;//     :cond_1
a=0;//     #v5=(Uninit);v6=(Conflicted);
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 220
a=0;//     .restart local v0    # "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/16 v7, 0x8
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-eq v6, v7, :cond_2
a=0;// 
a=0;//     .line 221
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->hasDividerBeforeChildAt(I)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 222
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v4, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 223
a=0;//     .local v4, "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-int v3, v6, v7
a=0;// 
a=0;//     .line 224
a=0;//     .local v3, "left":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, p1, v3}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->drawVerticalDivider(Landroid/graphics/Canvas;I)V
a=0;// 
a=0;//     .line 217
a=0;//     .end local v3    # "left":I
a=0;//     .end local v4    # "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 236
a=0;//     .restart local v5    # "right":I
a=0;//     :cond_3
a=0;//     #v5=(Null);v6=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method drawDividersVertical(Landroid/graphics/Canvas;)V
a=0;//     .locals 8
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 189
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 190
a=0;//     .local v2, "count":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-lt v3, v2, :cond_1
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->hasDividerBeforeChildAt(I)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 203
a=0;//     add-int/lit8 v6, v2, -0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p0, v6}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 204
a=0;//     .local v1, "child":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 205
a=0;//     .local v0, "bottom":I
a=0;//     #v0=(Null);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 206
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getHeight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-int/2addr v6, v7
a=0;// 
a=0;//     iget v7, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerHeight:I
a=0;// 
a=0;//     sub-int v0, v6, v7
a=0;// 
a=0;//     .line 211
a=0;//     :goto_1
a=0;//     #v0=(Integer);v7=(Conflicted);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->drawHorizontalDivider(Landroid/graphics/Canvas;I)V
a=0;// 
a=0;//     .line 213
a=0;//     .end local v0    # "bottom":I
a=0;//     .end local v1    # "child":Landroid/view/View;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 191
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v6=(Conflicted);
a=0;//     invoke-virtual {p0, v3}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 193
a=0;//     .restart local v1    # "child":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/16 v7, 0x8
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-eq v6, v7, :cond_2
a=0;// 
a=0;//     .line 194
a=0;//     invoke-virtual {p0, v3}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->hasDividerBeforeChildAt(I)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 195
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v4, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 196
a=0;//     .local v4, "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-int v5, v6, v7
a=0;// 
a=0;//     .line 197
a=0;//     .local v5, "top":I
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0, p1, v5}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->drawHorizontalDivider(Landroid/graphics/Canvas;I)V
a=0;// 
a=0;//     .line 190
a=0;//     .end local v4    # "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     .end local v5    # "top":I
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 209
a=0;//     .restart local v0    # "bottom":I
a=0;//     :cond_3
a=0;//     #v0=(Null);v6=(Integer);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method drawHorizontalDivider(Landroid/graphics/Canvas;I)V
a=0;//     .locals 4
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;//     .param p2, "top"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerPadding:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     .line 244
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerPadding:I
a=0;// 
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerHeight:I
a=0;// 
a=0;//     add-int/2addr v3, p2
a=0;// 
a=0;//     .line 243
a=0;//     invoke-virtual {v0, v1, p2, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 245
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 246
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method drawVerticalDivider(Landroid/graphics/Canvas;I)V
a=0;//     .locals 5
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;//     .param p2, "left"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerPadding:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     .line 250
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerWidth:I
a=0;// 
a=0;//     add-int/2addr v2, p2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     iget v4, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerPadding:I
a=0;// 
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     .line 249
a=0;//     invoke-virtual {v0, p2, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 251
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 252
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getDividerPadding()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getDividerWidth()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getShowDividers()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mShowDividers:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected hasDividerBeforeChildAt(I)Z
a=0;//     .locals 4
a=0;//     .param p1, "childIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 262
a=0;//     #v2=(Null);
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     .line 263
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mShowDividers:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 276
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Uninit);v2=(Null);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 263
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 264
a=0;//     :cond_2
a=0;//     #v0=(One);v3=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne p1, v3, :cond_3
a=0;// 
a=0;//     .line 265
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mShowDividers:I
a=0;// 
a=0;//     and-int/lit8 v3, v3, 0x4
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 266
a=0;//     :cond_3
a=0;//     #v0=(One);
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mShowDividers:I
a=0;// 
a=0;//     and-int/lit8 v3, v3, 0x2
a=0;// 
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 267
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 268
a=0;//     .local v0, "hasVisibleViewBefore":Z
a=0;//     #v0=(Null);
a=0;//     add-int/lit8 v1, p1, -0x1
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Integer);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     .line 269
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-eq v2, v3, :cond_4
a=0;// 
a=0;//     .line 270
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 271
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 268
a=0;//     :cond_4
a=0;//     #v0=(Null);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .end local v0    # "hasVisibleViewBefore":Z
a=0;//     .end local v1    # "i":I
a=0;//     :cond_5
a=0;//     #v0=(One);v1=(Uninit);v2=(Null);v3=(Integer);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 276
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isMeasureWithLargestChildEnabled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 290
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mUseLargestChild:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected measureChildWithMargins(Landroid/view/View;IIII)V
a=0;//     .locals 6
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "parentWidthMeasureSpec"    # I
a=0;//     .param p3, "widthUsed"    # I
a=0;//     .param p4, "parentHeightMeasureSpec"    # I
a=0;//     .param p5, "heightUsed"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 150
a=0;//     #v5=(One);
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->indexOfChild(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 151
a=0;//     .local v1, "index":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getOrientation()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 152
a=0;//     .local v2, "orientation":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v3, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 153
a=0;//     .local v3, "params":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->hasDividerBeforeChildAt(I)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 154
a=0;//     if-ne v2, v5, :cond_2
a=0;// 
a=0;//     .line 156
a=0;//     iget v4, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerHeight:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 163
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 164
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v4, v0, -0x1
a=0;// 
a=0;//     if-ne v1, v4, :cond_1
a=0;// 
a=0;//     .line 165
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->hasDividerBeforeChildAt(I)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 166
a=0;//     if-ne v2, v5, :cond_3
a=0;// 
a=0;//     .line 167
a=0;//     iget v4, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerHeight:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     .line 173
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     invoke-super/range {p0 .. p5}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;->measureChildWithMargins(Landroid/view/View;IIII)V
a=0;// 
a=0;//     .line 174
a=0;//     return-void
a=0;// 
a=0;//     .line 159
a=0;//     .end local v0    # "count":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v4=(Boolean);
a=0;//     iget v4, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 169
a=0;//     .restart local v0    # "count":I
a=0;//     :cond_3
a=0;//     #v0=(Integer);v4=(Boolean);
a=0;//     iget v4, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 2
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 179
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getOrientation()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->drawDividersVertical(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 185
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 186
a=0;//     return-void
a=0;// 
a=0;//     .line 182
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(One);
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->drawDividersHorizontal(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 2
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 311
a=0;//     invoke-super {p0, p1, p2}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineLinearLayout;->onMeasure(II)V
a=0;// 
a=0;//     .line 313
a=0;//     iget-boolean v1, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mUseLargestChild:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 314
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getOrientation()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 315
a=0;//     .local v0, "orientation":I
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 325
a=0;//     .end local v0    # "orientation":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 317
a=0;//     .restart local v0    # "orientation":I
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->useLargestChildHorizontal()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 321
a=0;//     :pswitch_1
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->useLargestChildVertical()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 315
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setDividerDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 2
a=0;//     .param p1, "divider"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 100
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-ne p1, v1, :cond_0
a=0;// 
a=0;//     .line 113
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 104
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     .line 105
a=0;//     invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerWidth:I
a=0;// 
a=0;//     .line 106
a=0;//     invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerHeight:I
a=0;// 
a=0;//     .line 111
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 112
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->requestLayout()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 108
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerWidth:I
a=0;// 
a=0;//     .line 109
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerHeight:I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setDividerPadding(I)V
a=0;//     .locals 0
a=0;//     .param p1, "padding"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mDividerPadding:I
a=0;// 
a=0;//     .line 126
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setMeasureWithLargestChildEnabled(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 306
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mUseLargestChild:Z
a=0;// 
a=0;//     .line 307
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShowDividers(I)V
a=0;//     .locals 1
a=0;//     .param p1, "showDividers"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mShowDividers:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     .line 80
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->requestLayout()V
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->invalidate()V
a=0;// 
a=0;//     .line 83
a=0;//     :cond_0
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->mShowDividers:I
a=0;// 
a=0;//     .line 84
a=0;//     return-void
a=0;// .end method
}}
