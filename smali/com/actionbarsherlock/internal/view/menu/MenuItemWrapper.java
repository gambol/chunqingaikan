package com.actionbarsherlock.internal.view.menu; class MenuItemWrapper { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MenuItemWrapper.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/MenuItem$OnMenuItemClickListener;
a=0;// .implements Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActionExpandListener:Lcom/actionbarsherlock/view/MenuItem$OnActionExpandListener;
a=0;// 
a=0;// .field private mMenuItemClickListener:Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;// .field private mNativeActionExpandListener:Landroid/view/MenuItem$OnActionExpandListener;
a=0;// 
a=0;// .field private final mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;// .field private mSubMenu:Lcom/actionbarsherlock/view/SubMenu;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/view/MenuItem;)V
a=0;//     .locals 2
a=0;//     .param p1, "nativeItem"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 22
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 16
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mSubMenu:Lcom/actionbarsherlock/view/SubMenu;
a=0;// 
a=0;//     .line 17
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mMenuItemClickListener:Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     .line 18
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mActionExpandListener:Lcom/actionbarsherlock/view/MenuItem$OnActionExpandListener;
a=0;// 
a=0;//     .line 19
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeActionExpandListener:Landroid/view/MenuItem$OnActionExpandListener;
a=0;// 
a=0;//     .line 23
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 24
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Wrapped menu item cannot be null."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 26
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 27
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;)Lcom/actionbarsherlock/view/MenuItem$OnActionExpandListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mActionExpandListener:Lcom/actionbarsherlock/view/MenuItem$OnActionExpandListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/MenuItem$OnActionExpandListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public collapseActionView()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 273
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->collapseActionView()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public expandActionView()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 268
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->expandActionView()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getActionProvider()Lcom/actionbarsherlock/view/ActionProvider;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 259
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v1}, Landroid/view/MenuItem;->getActionProvider()Landroid/view/ActionProvider;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 260
a=0;//     .local v0, "nativeProvider":Landroid/view/ActionProvider;
a=0;//     #v0=(Reference,Landroid/view/ActionProvider;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     instance-of v1, v0, Lcom/actionbarsherlock/internal/view/ActionProviderWrapper;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 261
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/view/ActionProviderWrapper;
a=0;// 
a=0;//     .end local v0    # "nativeProvider":Landroid/view/ActionProvider;
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/ActionProviderWrapper;->unwrap()Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 263
a=0;//     :goto_0
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/view/ActionProvider;);
a=0;//     return-object v1
a=0;// 
a=0;//     .restart local v0    # "nativeProvider":Landroid/view/ActionProvider;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getActionView()Landroid/view/View;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 245
a=0;//     .local v0, "actionView":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     instance-of v1, v0, Lcom/actionbarsherlock/internal/widget/CollapsibleActionViewWrapper;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 246
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/CollapsibleActionViewWrapper;
a=0;// 
a=0;//     .end local v0    # "actionView":Landroid/view/View;
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/CollapsibleActionViewWrapper;->unwrap()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 248
a=0;//     :cond_0
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAlphabeticShortcut()C
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->getAlphabeticShortcut()C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getGroupId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->getGroupId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getIcon()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getIntent()Landroid/content/Intent;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->getItemId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getNumericShortcut()C
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->getNumericShortcut()C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getOrder()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->getOrder()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getSubMenu()Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->hasSubMenu()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mSubMenu:Lcom/actionbarsherlock/view/SubMenu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/SubMenu;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 181
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v1}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;-><init>(Landroid/view/SubMenu;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mSubMenu:Lcom/actionbarsherlock/view/SubMenu;
a=0;// 
a=0;//     .line 183
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mSubMenu:Lcom/actionbarsherlock/view/SubMenu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/SubMenu;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTitleCondensed()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->getTitleCondensed()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hasSubMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 175
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->hasSubMenu()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isActionViewExpanded()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 278
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->isActionViewExpanded()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isCheckable()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->isCheckable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isChecked()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->isChecked()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isEnabled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->isEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isVisible()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->isVisible()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onMenuItemClick(Landroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 196
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mMenuItemClickListener:Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mMenuItemClickListener:Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     invoke-interface {v0, p0}, Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;->onMenuItemClick(Lcom/actionbarsherlock/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 199
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setActionProvider(Lcom/actionbarsherlock/view/ActionProvider;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "actionProvider"    # Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     .prologue
a=0;//     .line 253
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/view/ActionProviderWrapper;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/view/ActionProviderWrapper;);
a=0;//     invoke-direct {v1, p1}, Lcom/actionbarsherlock/internal/view/ActionProviderWrapper;-><init>(Lcom/actionbarsherlock/view/ActionProvider;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/ActionProviderWrapper;);
a=0;//     invoke-interface {v0, v1}, Landroid/view/MenuItem;->setActionProvider(Landroid/view/ActionProvider;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 254
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setActionView(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 3
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v1, p1}, Landroid/view/MenuItem;->setActionView(I)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 231
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 234
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     instance-of v1, v0, Lcom/actionbarsherlock/view/CollapsibleActionView;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 236
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/MenuItem;);
a=0;//     new-instance v2, Lcom/actionbarsherlock/internal/widget/CollapsibleActionViewWrapper;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/actionbarsherlock/internal/widget/CollapsibleActionViewWrapper;);
a=0;//     invoke-direct {v2, v0}, Lcom/actionbarsherlock/internal/widget/CollapsibleActionViewWrapper;-><init>(Landroid/view/View;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/CollapsibleActionViewWrapper;);
a=0;//     invoke-interface {v1, v2}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 239
a=0;//     .end local v0    # "view":Landroid/view/View;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setActionView(Landroid/view/View;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     instance-of v1, p1, Lcom/actionbarsherlock/view/CollapsibleActionView;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 221
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/CollapsibleActionViewWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/CollapsibleActionViewWrapper;);
a=0;//     invoke-direct {v0, p1}, Lcom/actionbarsherlock/internal/widget/CollapsibleActionViewWrapper;-><init>(Landroid/view/View;)V
a=0;// 
a=0;//     .end local p1    # "view":Landroid/view/View;
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/CollapsibleActionViewWrapper;);
a=0;//     move-object p1, v0
a=0;// 
a=0;//     .line 223
a=0;//     .end local v0    # "view":Landroid/view/View;
a=0;//     .restart local p1    # "view":Landroid/view/View;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v1, p1}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 224
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setAlphabeticShortcut(C)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "alphaChar"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/MenuItem;->setAlphabeticShortcut(C)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 121
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setCheckable(Z)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "checkable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 132
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setChecked(Z)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "checked"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 143
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setEnabled(Z)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 165
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "iconRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 82
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(Landroid/graphics/drawable/Drawable;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 76
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setIntent(Landroid/content/Intent;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/MenuItem;->setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 93
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setNumericShortcut(C)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "numericChar"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/MenuItem;->setNumericShortcut(C)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 110
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setOnActionExpandListener(Lcom/actionbarsherlock/view/MenuItem$OnActionExpandListener;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "listener"    # Lcom/actionbarsherlock/view/MenuItem$OnActionExpandListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 283
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mActionExpandListener:Lcom/actionbarsherlock/view/MenuItem$OnActionExpandListener;
a=0;// 
a=0;//     .line 285
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeActionExpandListener:Landroid/view/MenuItem$OnActionExpandListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem$OnActionExpandListener;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 286
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper$1;-><init>(Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper$1;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeActionExpandListener:Landroid/view/MenuItem$OnActionExpandListener;
a=0;// 
a=0;//     .line 305
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeActionExpandListener:Landroid/view/MenuItem$OnActionExpandListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/MenuItem$OnActionExpandListener;);
a=0;//     invoke-interface {v0, v1}, Landroid/view/MenuItem;->setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 308
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setOnMenuItemClickListener(Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "menuItemClickListener"    # Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mMenuItemClickListener:Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0, p0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 191
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setShortcut(CC)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "numericChar"    # C
a=0;//     .param p2, "alphaChar"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/view/MenuItem;->setShortcut(CC)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 104
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setShowAsAction(I)V
a=0;//     .locals 1
a=0;//     .param p1, "actionEnum"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 209
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/MenuItem;->setShowAsAction(I)V
a=0;// 
a=0;//     .line 210
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShowAsActionFlags(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "actionEnum"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 214
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/MenuItem;->setShowAsActionFlags(I)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 215
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "title"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 54
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 48
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setTitleCondensed(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 65
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setVisible(Z)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "visible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;->mNativeItem:Landroid/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 154
a=0;//     return-object p0
a=0;// .end method
}}
