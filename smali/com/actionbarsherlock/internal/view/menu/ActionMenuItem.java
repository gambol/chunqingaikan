package com.actionbarsherlock.internal.view.menu; class ActionMenuItem { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionMenuItem.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final CHECKABLE:I = 0x1
a=0;// 
a=0;// .field private static final CHECKED:I = 0x2
a=0;// 
a=0;// .field private static final ENABLED:I = 0x10
a=0;// 
a=0;// .field private static final EXCLUSIVE:I = 0x4
a=0;// 
a=0;// .field private static final HIDDEN:I = 0x8
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mClickListener:Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mFlags:I
a=0;// 
a=0;// .field private final mGroup:I
a=0;// 
a=0;// .field private mIconDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private final mId:I
a=0;// 
a=0;// .field private mIntent:Landroid/content/Intent;
a=0;// 
a=0;// .field private final mOrdering:I
a=0;// 
a=0;// .field private mShortcutAlphabeticChar:C
a=0;// 
a=0;// .field private mShortcutNumericChar:C
a=0;// 
a=0;// .field private mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private mTitleCondensed:Ljava/lang/CharSequence;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;IIIILjava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "group"    # I
a=0;//     .param p3, "id"    # I
a=0;//     .param p4, "categoryOrder"    # I
a=0;//     .param p5, "ordering"    # I
a=0;//     .param p6, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 53
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;);
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     .line 62
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 63
a=0;//     iput p3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mId:I
a=0;// 
a=0;//     .line 64
a=0;//     iput p2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mGroup:I
a=0;// 
a=0;//     .line 66
a=0;//     iput p5, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mOrdering:I
a=0;// 
a=0;//     .line 67
a=0;//     iput-object p6, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public collapseActionView()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 265
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public expandActionView()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 260
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getActionProvider()Lcom/actionbarsherlock/view/ActionProvider;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getActionView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAlphabeticShortcut()C
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     iget-char v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mShortcutAlphabeticChar:C
a=0;// 
a=0;//     #v0=(Char);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getGroupId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mGroup:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getIcon()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mIconDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getIntent()Landroid/content/Intent;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getNumericShortcut()C
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     iget-char v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mShortcutNumericChar:C
a=0;// 
a=0;//     #v0=(Char);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getOrder()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mOrdering:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getSubMenu()Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTitleCondensed()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mTitleCondensed:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hasSubMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public invoke()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 213
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mClickListener:Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mClickListener:Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     invoke-interface {v1, p0}, Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;->onMenuItemClick(Lcom/actionbarsherlock/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 222
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 217
a=0;//     :cond_0
a=0;//     #v0=(One);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 222
a=0;//     :cond_1
a=0;//     #v2=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isActionViewExpanded()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 270
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isCheckable()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     if-eqz v0, :cond_0
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
a=0;// .method public isChecked()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     if-eqz v0, :cond_0
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
a=0;// .method public isEnabled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x10
a=0;// 
a=0;//     if-eqz v0, :cond_0
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
a=0;// .method public isVisible()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x8
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
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setActionProvider(Lcom/actionbarsherlock/view/ActionProvider;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "actionProvider"    # Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setActionView(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 239
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setActionView(Landroid/view/View;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "actionView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setAlphabeticShortcut(C)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "alphaChar"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     iput-char p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mShortcutAlphabeticChar:C
a=0;// 
a=0;//     .line 136
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setCheckable(Z)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "checkable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v1, v0, -0x2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     .line 141
a=0;//     return-object p0
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setChecked(Z)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "checked"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v1, v0, -0x3
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     .line 151
a=0;//     return-object p0
a=0;// 
a=0;//     .line 150
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setEnabled(Z)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v1, v0, -0x11
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     .line 156
a=0;//     return-object p0
a=0;// 
a=0;//     .line 155
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setExclusiveCheckable(Z)Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "exclusive"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v1, v0, -0x5
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     .line 146
a=0;//     return-object p0
a=0;// 
a=0;//     .line 145
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "iconRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 167
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mIconDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 168
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(Landroid/graphics/drawable/Drawable;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mIconDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 162
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setIntent(Landroid/content/Intent;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 173
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setNumericShortcut(C)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "numericChar"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     iput-char p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mShortcutNumericChar:C
a=0;// 
a=0;//     .line 178
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setOnActionExpandListener(Lcom/actionbarsherlock/view/MenuItem$OnActionExpandListener;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/actionbarsherlock/view/MenuItem$OnActionExpandListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 276
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setOnMenuItemClickListener(Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "menuItemClickListener"    # Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mClickListener:Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     .line 183
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setShortcut(CC)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "numericChar"    # C
a=0;//     .param p2, "alphaChar"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
a=0;//     iput-char p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mShortcutNumericChar:C
a=0;// 
a=0;//     .line 188
a=0;//     iput-char p2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mShortcutAlphabeticChar:C
a=0;// 
a=0;//     .line 189
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setShowAsAction(I)V
a=0;//     .locals 0
a=0;//     .param p1, "show"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 227
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShowAsActionFlags(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "actionEnum"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 254
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->setShowAsAction(I)V
a=0;// 
a=0;//     .line 255
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "title"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 198
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 199
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 194
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setTitleCondensed(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mTitleCondensed:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 204
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setVisible(Z)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "visible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v1, v0, 0x8
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     .line 209
a=0;//     return-object p0
a=0;// 
a=0;//     .line 208
a=0;//     :cond_0
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
}}
