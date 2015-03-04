package com.actionbarsherlock.internal.view.menu; class ActionMenuItemView { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;
a=0;// .super Landroid/widget/LinearLayout;
a=0;// .source "ActionMenuItemView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// .implements Landroid/view/View$OnLongClickListener;
a=0;// .implements Lcom/actionbarsherlock/internal/view/View_HasStateListenerSupport;
a=0;// .implements Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$ActionMenuChildView;
a=0;// .implements Lcom/actionbarsherlock/internal/view/menu/MenuView$ItemView;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAllowTextWithIcon:Z
a=0;// 
a=0;// .field private mExpandedFormat:Z
a=0;// 
a=0;// .field private mImageButton:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field private mItemData:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;// .field private mItemInvoker:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder$ItemInvoker;
a=0;// 
a=0;// .field private final mListeners:Ljava/util/Set;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Set",
a=0;//             "<",
a=0;//             "Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mMinWidth:I
a=0;// 
a=0;// .field private mTextButton:Lcom/actionbarsherlock/internal/widget/CapitalizingButton;
a=0;// 
a=0;// .field private mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 65
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 69
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;);
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
a=0;//     .line 73
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 61
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;);
a=0;//     new-instance v1, Ljava/util/HashSet;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v1}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashSet;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mListeners:Ljava/util/Set;
a=0;// 
a=0;//     .line 75
a=0;//     sget v1, Lcom/actionbarsherlock/R$bool;->abs__config_allowActionMenuItemTextWithIcon:I
a=0;// 
a=0;//     .line 74
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1, v1}, Lcom/actionbarsherlock/internal/ResourcesCompat;->getResources_getBoolean(Landroid/content/Context;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mAllowTextWithIcon:Z
a=0;// 
a=0;//     .line 77
a=0;//     sget-object v1, Lcom/actionbarsherlock/R$styleable;->SherlockActionMenuItemView:[I
a=0;// 
a=0;//     .line 76
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v1, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 78
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mMinWidth:I
a=0;// 
a=0;//     .line 80
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private updateTextButtonVisibility()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 175
a=0;//     #v1=(Null);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mTextButton:Lcom/actionbarsherlock/internal/widget/CapitalizingButton;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/widget/CapitalizingButton;);
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/internal/widget/CapitalizingButton;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 176
a=0;//     .local v0, "visible":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mImageButton:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v3}, Landroid/widget/ImageButton;->getDrawable()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mItemData:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->showsTextAsAction()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mAllowTextWithIcon:Z
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mExpandedFormat:Z
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     move v2, v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);v3=(Conflicted);
a=0;//     and-int/2addr v0, v2
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mTextButton:Lcom/actionbarsherlock/internal/widget/CapitalizingButton;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/CapitalizingButton;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v2, v1}, Lcom/actionbarsherlock/internal/widget/CapitalizingButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 180
a=0;//     return-void
a=0;// 
a=0;//     .end local v0    # "visible":Z
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Null);v2=(One);v3=(Boolean);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 175
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 179
a=0;//     .restart local v0    # "visible":Z
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v2=(Reference,Lcom/actionbarsherlock/internal/widget/CapitalizingButton;);v3=(Conflicted);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addOnAttachStateChangeListener(Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mListeners:Ljava/util/Set;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchHoverEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 231
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->onHoverEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 233
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 213
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemData()Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mItemData:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hasText()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mTextButton:Lcom/actionbarsherlock/internal/widget/CapitalizingButton;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/CapitalizingButton;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/CapitalizingButton;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public initialize(Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;I)V
a=0;//     .locals 1
a=0;//     .param p1, "itemData"    # Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;//     .param p2, "menuType"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mItemData:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 128
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->getIcon()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 129
a=0;//     invoke-virtual {p1, p0}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->getTitleForItemView(Lcom/actionbarsherlock/internal/view/menu/MenuView$ItemView;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 130
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->getItemId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->setId(I)V
a=0;// 
a=0;//     .line 132
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->isVisible()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->setVisibility(I)V
a=0;// 
a=0;//     .line 133
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->isEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->setEnabled(Z)V
a=0;// 
a=0;//     .line 134
a=0;//     return-void
a=0;// 
a=0;//     .line 132
a=0;//     :cond_0
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public needsDividerAfter()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 245
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->hasText()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public needsDividerBefore()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->hasText()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mItemData:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->getIcon()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
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
a=0;// .method protected onAttachedToWindow()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     invoke-super {p0}, Landroid/widget/LinearLayout;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mListeners:Ljava/util/Set;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 99
a=0;//     return-void
a=0;// 
a=0;//     .line 96
a=0;//     :cond_0
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;
a=0;// 
a=0;//     .line 97
a=0;//     .local v0, "listener":Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;
a=0;//     invoke-interface {v0, p0}, Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;->onViewAttachedToWindow(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mItemInvoker:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder$ItemInvoker;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder$ItemInvoker;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mItemInvoker:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder$ItemInvoker;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mItemData:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;);
a=0;//     invoke-interface {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder$ItemInvoker;->invokeItem(Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;)Z
a=0;// 
a=0;//     .line 147
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     invoke-super {p0}, Landroid/widget/LinearLayout;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mListeners:Ljava/util/Set;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 107
a=0;//     return-void
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;
a=0;// 
a=0;//     .line 105
a=0;//     .local v0, "listener":Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;
a=0;//     invoke-interface {v0, p0}, Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;->onViewDetachedFromWindow(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onFinishInflate()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     sget v0, Lcom/actionbarsherlock/R$id;->abs__imageButton:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mImageButton:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 113
a=0;//     sget v0, Lcom/actionbarsherlock/R$id;->abs__textButton:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/CapitalizingButton;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mTextButton:Lcom/actionbarsherlock/internal/widget/CapitalizingButton;
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mImageButton:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mTextButton:Lcom/actionbarsherlock/internal/widget/CapitalizingButton;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcom/actionbarsherlock/internal/widget/CapitalizingButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mImageButton:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
a=0;// 
a=0;//     .line 117
a=0;//     invoke-virtual {p0, p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 118
a=0;//     invoke-virtual {p0, p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
a=0;// 
a=0;//     .line 119
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onLongClick(Landroid/view/View;)Z
a=0;//     .locals 12
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 250
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->hasText()Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     .line 276
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Boolean);v10=(PosByte);v11=(Conflicted);
a=0;//     return v8
a=0;// 
a=0;//     .line 255
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Null);v10=(Boolean);v11=(Uninit);
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     new-array v5, v10, [I
a=0;// 
a=0;//     .line 256
a=0;//     .local v5, "screenPos":[I
a=0;//     #v5=(Reference,[I);
a=0;//     new-instance v2, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     .line 257
a=0;//     .local v2, "displayFrame":Landroid/graphics/Rect;
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->getLocationOnScreen([I)V
a=0;// 
a=0;//     .line 258
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 260
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 261
a=0;//     .local v1, "context":Landroid/content/Context;
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->getWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 262
a=0;//     .local v7, "width":I
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 263
a=0;//     .local v3, "height":I
a=0;//     #v3=(Integer);
a=0;//     aget v10, v5, v9
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     div-int/lit8 v11, v3, 0x2
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     add-int v4, v10, v11
a=0;// 
a=0;//     .line 264
a=0;//     .local v4, "midy":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iget v6, v10, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     .line 266
a=0;//     .local v6, "screenWidth":I
a=0;//     #v6=(Integer);
a=0;//     iget-object v10, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mItemData:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->getTitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v1, v10, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 267
a=0;//     .local v0, "cheatSheet":Landroid/widget/Toast;
a=0;//     #v0=(Reference,Landroid/widget/Toast;);
a=0;//     invoke-virtual {v2}, Landroid/graphics/Rect;->height()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-ge v4, v10, :cond_1
a=0;// 
a=0;//     .line 269
a=0;//     const/16 v10, 0x35
a=0;// 
a=0;//     .line 270
a=0;//     #v10=(PosByte);
a=0;//     aget v8, v5, v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sub-int v8, v6, v8
a=0;// 
a=0;//     div-int/lit8 v11, v7, 0x2
a=0;// 
a=0;//     sub-int/2addr v8, v11
a=0;// 
a=0;//     .line 269
a=0;//     invoke-virtual {v0, v10, v8, v3}, Landroid/widget/Toast;->setGravity(III)V
a=0;// 
a=0;//     .line 275
a=0;//     :goto_1
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     move v8, v9
a=0;// 
a=0;//     .line 276
a=0;//     #v8=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 273
a=0;//     :cond_1
a=0;//     #v8=(Null);v10=(Integer);
a=0;//     const/16 v10, 0x51
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v0, v10, v8, v3}, Landroid/widget/Toast;->setGravity(III)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 6
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v5, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 281
a=0;//     #v5=(Integer);
a=0;//     invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V
a=0;// 
a=0;//     .line 283
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 284
a=0;//     .local v3, "widthMode":I
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 285
a=0;//     .local v1, "specSize":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 286
a=0;//     .local v0, "oldMeasuredWidth":I
a=0;//     #v0=(Integer);
a=0;//     const/high16 v4, -0x80000000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v3, v4, :cond_1
a=0;// 
a=0;//     iget v4, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mMinWidth:I
a=0;// 
a=0;//     invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 289
a=0;//     .local v2, "targetWidth":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     if-eq v3, v5, :cond_0
a=0;// 
a=0;//     iget v4, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mMinWidth:I
a=0;// 
a=0;//     if-lez v4, :cond_0
a=0;// 
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 291
a=0;//     invoke-static {v2, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-super {p0, v4, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V
a=0;// 
a=0;//     .line 294
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 287
a=0;//     .end local v2    # "targetWidth":I
a=0;//     :cond_1
a=0;//     #v2=(Uninit);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mMinWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 3
a=0;//     .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 218
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xe
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 219
a=0;//     invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 221
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->getContentDescription()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 222
a=0;//     .local v0, "cdesc":Ljava/lang/CharSequence;
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 223
a=0;//     invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 225
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public prefersCondensedTitle()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public removeOnAttachStateChangeListener(Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mListeners:Ljava/util/Set;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 91
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCheckable(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "checkable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setChecked(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "checked"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setEnabled(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setEnabled(Z)V
a=0;// 
a=0;//     .line 139
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mImageButton:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setEnabled(Z)V
a=0;// 
a=0;//     .line 140
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mTextButton:Lcom/actionbarsherlock/internal/widget/CapitalizingButton;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/CapitalizingButton;->setEnabled(Z)V
a=0;// 
a=0;//     .line 141
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setExpandedFormat(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "expandedFormat"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mExpandedFormat:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     .line 167
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mExpandedFormat:Z
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mItemData:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mItemData:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->actionFormatChanged()V
a=0;// 
a=0;//     .line 172
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 2
a=0;//     .param p1, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mImageButton:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 184
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 185
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mImageButton:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 190
a=0;//     :goto_0
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->updateTextButtonVisibility()V
a=0;// 
a=0;//     .line 191
a=0;//     return-void
a=0;// 
a=0;//     .line 187
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mImageButton:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setItemInvoker(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder$ItemInvoker;)V
a=0;//     .locals 0
a=0;//     .param p1, "invoker"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder$ItemInvoker;
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mItemInvoker:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder$ItemInvoker;
a=0;// 
a=0;//     .line 151
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShortcut(ZC)V
a=0;//     .locals 0
a=0;//     .param p1, "showShortcut"    # Z
a=0;//     .param p2, "shortcutKey"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 2
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mTextButton:Lcom/actionbarsherlock/internal/widget/CapitalizingButton;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/CapitalizingButton;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/CapitalizingButton;->setTextCompat(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 206
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->setContentDescription(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 207
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->updateTextButtonVisibility()V
a=0;// 
a=0;//     .line 208
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showsIcon()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 237
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
}}
