package com.actionbarsherlock.internal.widget; class CapitalizingTextView { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/widget/CapitalizingTextView;
a=0;// .super Landroid/widget/TextView;
a=0;// .source "CapitalizingTextView.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final IS_GINGERBREAD:Z
a=0;// 
a=0;// .field private static final R_styleable_TextView:[I
a=0;// 
a=0;// .field private static final R_styleable_TextView_textAllCaps:I
a=0;// 
a=0;// .field private static final SANS_ICE_CREAM:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAllCaps:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 12
a=0;//     #v2=(Null);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v3, 0xe
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Lcom/actionbarsherlock/internal/widget/CapitalizingTextView;->SANS_ICE_CREAM:Z
a=0;// 
a=0;//     .line 13
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v3, 0x9
a=0;// 
a=0;//     if-lt v0, v3, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Lcom/actionbarsherlock/internal/widget/CapitalizingTextView;->IS_GINGERBREAD:Z
a=0;// 
a=0;//     .line 15
a=0;//     new-array v0, v1, [I
a=0;// 
a=0;//     .line 16
a=0;//     #v0=(Reference,[I);
a=0;//     const v1, 0x101038c
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aput v1, v0, v2
a=0;// 
a=0;//     .line 15
a=0;//     sput-object v0, Lcom/actionbarsherlock/internal/widget/CapitalizingTextView;->R_styleable_TextView:[I
a=0;// 
a=0;//     .line 18
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(One);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 12
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 13
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/actionbarsherlock/internal/widget/CapitalizingTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 24
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/CapitalizingTextView;);
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
a=0;//     .line 27
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/CapitalizingTextView;);
a=0;//     sget-object v1, Lcom/actionbarsherlock/internal/widget/CapitalizingTextView;->R_styleable_TextView:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 30
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/internal/widget/CapitalizingTextView;->mAllCaps:Z
a=0;// 
a=0;//     .line 31
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public setTextCompat(Ljava/lang/CharSequence;)V
a=0;//     .locals 3
a=0;//     .param p1, "text"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     sget-boolean v1, Lcom/actionbarsherlock/internal/widget/CapitalizingTextView;->SANS_ICE_CREAM:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/actionbarsherlock/internal/widget/CapitalizingTextView;->mAllCaps:Z
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 36
a=0;//     sget-boolean v1, Lcom/actionbarsherlock/internal/widget/CapitalizingTextView;->IS_GINGERBREAD:Z
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     :try_start_0
a=0;//     invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/CapitalizingTextView;->setText(Ljava/lang/CharSequence;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 49
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 39
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 41
a=0;//     .local v0, "e":Ljava/lang/NoSuchFieldError;
a=0;//     #v0=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/CapitalizingTextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 44
a=0;//     .end local v0    # "e":Ljava/lang/NoSuchFieldError;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);
a=0;//     invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/CapitalizingTextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 47
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/CapitalizingTextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
