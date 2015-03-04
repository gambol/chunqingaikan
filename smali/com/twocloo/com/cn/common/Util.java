package com.twocloo.com.cn.common; class Util { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/common/Util;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Util.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/common/Util$SSLSocketFactoryEx;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final HEX_DIGITS:[C
a=0;// 
a=0;// .field public static obj:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 295
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/common/Util;->HEX_DIGITS:[C
a=0;// 
a=0;//     .line 483
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/common/Util;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 295
a=0;//     #v0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 2
a=0;//         0x30s
a=0;//         0x31s
a=0;//         0x32s
a=0;//         0x33s
a=0;//         0x34s
a=0;//         0x35s
a=0;//         0x36s
a=0;//         0x37s
a=0;//         0x38s
a=0;//         0x39s
a=0;//         0x61s
a=0;//         0x62s
a=0;//         0x63s
a=0;//         0x64s
a=0;//         0x65s
a=0;//         0x66s
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/Util;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static DrawableToBitmap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
a=0;//     .locals 7
a=0;//     .param p0, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 886
a=0;//     #v6=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 887
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 894
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/graphics/Bitmap;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 889
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 890
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getOpacity()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-eq v2, v5, :cond_1
a=0;// 
a=0;//     sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     .line 889
a=0;//     :goto_1
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {v3, v4, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 891
a=0;//     .local v1, "photo":Landroid/graphics/Bitmap;
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     new-instance v0, Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 892
a=0;//     .local v0, "canvas":Landroid/graphics/Canvas;
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {p0, v6, v6, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 893
a=0;//     invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 890
a=0;//     .end local v0    # "canvas":Landroid/graphics/Canvas;
a=0;//     .end local v1    # "photo":Landroid/graphics/Bitmap;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static GBK2Unicode(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .param p0, "str"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     new-instance v2, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 342
a=0;//     .local v2, "result":Ljava/lang/StringBuffer;
a=0;//     #v2=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v1, v3, :cond_0
a=0;// 
a=0;//     .line 350
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 343
a=0;//     :cond_0
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 344
a=0;//     .local v0, "chr1":C
a=0;//     #v0=(Char);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/Util;->isNeedConvert(C)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 345
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 342
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 348
a=0;//     :cond_1
a=0;//     #v3=(Boolean);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\\u"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static UritoDrawable(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 4
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "uri"    # Landroid/net/Uri;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 154
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/ContentResolver;);
a=0;//     invoke-virtual {v2, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v2, v3}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 158
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/graphics/drawable/Drawable;);v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 155
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 156
a=0;//     .local v0, "e":Ljava/io/FileNotFoundException;
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     invoke-virtual {v0}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static closeSoftKeyBoard(Landroid/app/Activity;)V
a=0;//     .locals 3
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 875
a=0;//     const-string v1, "input_method"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/inputmethod/InputMethodManager;
a=0;// 
a=0;//     .line 876
a=0;//     .local v0, "inputMethodManager":Landroid/view/inputmethod/InputMethodManager;
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z
a=0;// 
a=0;//     .line 877
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static copy(Landroid/content/Context;)V
a=0;//     .locals 5
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 651
a=0;//     const-string v1, "[^0-9]"
a=0;// 
a=0;//     .line 652
a=0;//     .local v1, "regEx":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 654
a=0;//     .local v0, "p":Ljava/util/regex/Pattern;
a=0;//     #v0=(Reference,Ljava/util/regex/Pattern;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_BOOK:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/common/Util$1;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/common/Util$1;);
a=0;//     invoke-direct {v3, v0, p0}, Lcom/twocloo/com/cn/common/Util$1;-><init>(Ljava/util/regex/Pattern;Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/common/Util$1;);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
a=0;// 
a=0;//     .line 695
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_DATA_ROOT:Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, "/rdbook"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/common/Util$2;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/common/Util$2;);
a=0;//     invoke-direct {v3, v0}, Lcom/twocloo/com/cn/common/Util$2;-><init>(Ljava/util/regex/Pattern;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/common/Util$2;);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
a=0;// 
a=0;//     .line 712
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static copyFile(Ljava/io/File;Ljava/io/File;)V
a=0;//     .locals 9
a=0;//     .param p0, "oldPath"    # Ljava/io/File;
a=0;//     .param p1, "newPath"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 591
a=0;//     invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 626
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 593
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 594
a=0;//     .local v5, "inStream":Ljava/io/InputStream;
a=0;//     #v5=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 596
a=0;//     .local v3, "fs":Ljava/io/FileOutputStream;
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->exists()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_2
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     .line 614
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 615
a=0;//     :try_start_1
a=0;//     invoke-virtual {v5}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 616
a=0;//     :cond_2
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 617
a=0;//     invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 621
a=0;//     :cond_3
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 622
a=0;//     invoke-virtual {p0}, Ljava/io/File;->deleteOnExit()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 618
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 619
a=0;//     .local v2, "e":Ljava/io/IOException;
a=0;//     :try_start_2
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 621
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 622
a=0;//     invoke-virtual {p0}, Ljava/io/File;->deleteOnExit()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 620
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 621
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_4
a=0;// 
a=0;//     .line 622
a=0;//     invoke-virtual {p0}, Ljava/io/File;->deleteOnExit()V
a=0;// 
a=0;//     .line 623
a=0;//     :cond_4
a=0;//     throw v7
a=0;// 
a=0;//     .line 598
a=0;//     :cond_5
a=0;//     #v2=(Uninit);v7=(Boolean);v8=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 599
a=0;//     .local v1, "byteread":I
a=0;//     :try_start_3
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 600
a=0;//     invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     .line 601
a=0;//     new-instance v6, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v6, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_2
a=0;// 
a=0;//     .line 602
a=0;//     .end local v5    # "inStream":Ljava/io/InputStream;
a=0;//     .local v6, "inStream":Ljava/io/InputStream;
a=0;//     :try_start_4
a=0;//     #v6=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v4, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v4, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_5
a=0;// 
a=0;//     .line 603
a=0;//     .end local v3    # "fs":Ljava/io/FileOutputStream;
a=0;//     .local v4, "fs":Ljava/io/FileOutputStream;
a=0;//     #v4=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v7, 0x1000
a=0;// 
a=0;//     :try_start_5
a=0;//     #v7=(PosShort);
a=0;//     new-array v0, v7, [B
a=0;// 
a=0;//     .line 604
a=0;//     .local v0, "buffer":[B
a=0;//     :goto_1
a=0;//     #v0=(Reference,[B);v1=(Integer);
a=0;//     invoke-virtual {v6, v0}, Ljava/io/InputStream;->read([B)I
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_6
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-ne v1, v7, :cond_9
a=0;// 
a=0;//     .line 614
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     .line 615
a=0;//     :try_start_6
a=0;//     invoke-virtual {v6}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 616
a=0;//     :cond_6
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     .line 617
a=0;//     invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_4
a=0;// 
a=0;//     .line 621
a=0;//     :cond_7
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_8
a=0;// 
a=0;//     .line 622
a=0;//     invoke-virtual {p0}, Ljava/io/File;->deleteOnExit()V
a=0;// 
a=0;//     :cond_8
a=0;//     #v2=(Conflicted);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .end local v4    # "fs":Ljava/io/FileOutputStream;
a=0;//     .restart local v3    # "fs":Ljava/io/FileOutputStream;
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .end local v6    # "inStream":Ljava/io/InputStream;
a=0;//     .restart local v5    # "inStream":Ljava/io/InputStream;
a=0;//     #v5=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 605
a=0;//     .end local v3    # "fs":Ljava/io/FileOutputStream;
a=0;//     .end local v5    # "inStream":Ljava/io/InputStream;
a=0;//     .restart local v4    # "fs":Ljava/io/FileOutputStream;
a=0;//     .restart local v6    # "inStream":Ljava/io/InputStream;
a=0;//     :cond_9
a=0;//     #v2=(Uninit);v3=(Null);v5=(Null);v7=(Byte);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     :try_start_7
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v4, v0, v7, v1}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_6
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 608
a=0;//     .end local v0    # "buffer":[B
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v7=(PosShort);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .end local v4    # "fs":Ljava/io/FileOutputStream;
a=0;//     .restart local v3    # "fs":Ljava/io/FileOutputStream;
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 609
a=0;//     .end local v1    # "byteread":I
a=0;//     .end local v6    # "inStream":Ljava/io/InputStream;
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     .restart local v5    # "inStream":Ljava/io/InputStream;
a=0;//     :goto_2
a=0;//     :try_start_8
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Reference,Ljava/io/FileInputStream;);v6=(Conflicted);v7=(Conflicted);
a=0;//     sget-object v7, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/PrintStream;);
a=0;//     const-string v8, "\u590d\u5236\u5355\u4e2a\u6587\u4ef6\u64cd\u4f5c\u51fa\u9519"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 610
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_2
a=0;// 
a=0;//     .line 614
a=0;//     if-eqz v5, :cond_a
a=0;// 
a=0;//     .line 615
a=0;//     :try_start_9
a=0;//     invoke-virtual {v5}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 616
a=0;//     :cond_a
a=0;//     if-eqz v3, :cond_b
a=0;// 
a=0;//     .line 617
a=0;//     invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_1
a=0;// 
a=0;//     .line 621
a=0;//     :cond_b
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 622
a=0;//     invoke-virtual {p0}, Ljava/io/File;->deleteOnExit()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 618
a=0;//     :catch_2
a=0;//     #v7=(Reference,Ljava/io/PrintStream;);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 619
a=0;//     .local v2, "e":Ljava/io/IOException;
a=0;//     :try_start_a
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_a
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_1
a=0;// 
a=0;//     .line 621
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 622
a=0;//     invoke-virtual {p0}, Ljava/io/File;->deleteOnExit()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 620
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     :catchall_1
a=0;//     #v7=(Reference,Ljava/io/PrintStream;);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 621
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_c
a=0;// 
a=0;//     .line 622
a=0;//     invoke-virtual {p0}, Ljava/io/File;->deleteOnExit()V
a=0;// 
a=0;//     .line 623
a=0;//     :cond_c
a=0;//     throw v7
a=0;// 
a=0;//     .line 612
a=0;//     :catchall_2
a=0;//     #v2=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 614
a=0;//     :goto_3
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v5, :cond_d
a=0;// 
a=0;//     .line 615
a=0;//     :try_start_b
a=0;//     invoke-virtual {v5}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 616
a=0;//     :cond_d
a=0;//     if-eqz v3, :cond_e
a=0;// 
a=0;//     .line 617
a=0;//     invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_3
a=0;// 
a=0;//     .line 621
a=0;//     :cond_e
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_f
a=0;// 
a=0;//     .line 622
a=0;//     invoke-virtual {p0}, Ljava/io/File;->deleteOnExit()V
a=0;// 
a=0;//     .line 624
a=0;//     :cond_f
a=0;//     :goto_4
a=0;//     throw v7
a=0;// 
a=0;//     .line 618
a=0;//     :catch_3
a=0;//     #v8=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 619
a=0;//     .restart local v2    # "e":Ljava/io/IOException;
a=0;//     :try_start_c
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_c
a=0;//     .catchall {:try_start_c .. :try_end_c} :catchall_3
a=0;// 
a=0;//     .line 621
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_f
a=0;// 
a=0;//     .line 622
a=0;//     invoke-virtual {p0}, Ljava/io/File;->deleteOnExit()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 620
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     :catchall_3
a=0;//     #v2=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 621
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_10
a=0;// 
a=0;//     .line 622
a=0;//     invoke-virtual {p0}, Ljava/io/File;->deleteOnExit()V
a=0;// 
a=0;//     .line 623
a=0;//     :cond_10
a=0;//     throw v7
a=0;// 
a=0;//     .line 618
a=0;//     .end local v3    # "fs":Ljava/io/FileOutputStream;
a=0;//     .end local v5    # "inStream":Ljava/io/InputStream;
a=0;//     .restart local v0    # "buffer":[B
a=0;//     .restart local v1    # "byteread":I
a=0;//     .restart local v4    # "fs":Ljava/io/FileOutputStream;
a=0;//     .restart local v6    # "inStream":Ljava/io/InputStream;
a=0;//     :catch_4
a=0;//     #v0=(Reference,[B);v1=(Integer);v2=(Uninit);v3=(Null);v4=(Reference,Ljava/io/FileOutputStream;);v5=(Null);v6=(Reference,Ljava/io/FileInputStream;);v7=(Byte);v8=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 619
a=0;//     .restart local v2    # "e":Ljava/io/IOException;
a=0;//     :try_start_d
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_d
a=0;//     .catchall {:try_start_d .. :try_end_d} :catchall_4
a=0;// 
a=0;//     .line 621
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_8
a=0;// 
a=0;//     .line 622
a=0;//     invoke-virtual {p0}, Ljava/io/File;->deleteOnExit()V
a=0;// 
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .end local v4    # "fs":Ljava/io/FileOutputStream;
a=0;//     .restart local v3    # "fs":Ljava/io/FileOutputStream;
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .end local v6    # "inStream":Ljava/io/InputStream;
a=0;//     .restart local v5    # "inStream":Ljava/io/InputStream;
a=0;//     #v5=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 620
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     .end local v3    # "fs":Ljava/io/FileOutputStream;
a=0;//     .end local v5    # "inStream":Ljava/io/InputStream;
a=0;//     .restart local v4    # "fs":Ljava/io/FileOutputStream;
a=0;//     .restart local v6    # "inStream":Ljava/io/InputStream;
a=0;//     :catchall_4
a=0;//     #v2=(Conflicted);v3=(Null);v5=(Null);v7=(Byte);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 621
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_11
a=0;// 
a=0;//     .line 622
a=0;//     invoke-virtual {p0}, Ljava/io/File;->deleteOnExit()V
a=0;// 
a=0;//     .line 623
a=0;//     :cond_11
a=0;//     throw v7
a=0;// 
a=0;//     .line 612
a=0;//     .end local v0    # "buffer":[B
a=0;//     .end local v4    # "fs":Ljava/io/FileOutputStream;
a=0;//     .restart local v3    # "fs":Ljava/io/FileOutputStream;
a=0;//     :catchall_5
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v4=(Conflicted);v8=(Uninit);
a=0;//     move-exception v7
a=0;// 
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .end local v6    # "inStream":Ljava/io/InputStream;
a=0;//     .restart local v5    # "inStream":Ljava/io/InputStream;
a=0;//     #v5=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .end local v3    # "fs":Ljava/io/FileOutputStream;
a=0;//     .end local v5    # "inStream":Ljava/io/InputStream;
a=0;//     .restart local v4    # "fs":Ljava/io/FileOutputStream;
a=0;//     .restart local v6    # "inStream":Ljava/io/InputStream;
a=0;//     :catchall_6
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Reference,Ljava/io/FileOutputStream;);v5=(Null);v7=(PosShort);
a=0;//     move-exception v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .end local v4    # "fs":Ljava/io/FileOutputStream;
a=0;//     .restart local v3    # "fs":Ljava/io/FileOutputStream;
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .end local v6    # "inStream":Ljava/io/InputStream;
a=0;//     .restart local v5    # "inStream":Ljava/io/InputStream;
a=0;//     #v5=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 608
a=0;//     .end local v1    # "byteread":I
a=0;//     :catch_5
a=0;//     #v0=(Uninit);v1=(Conflicted);v3=(Null);v4=(Uninit);v5=(Null);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .end local v5    # "inStream":Ljava/io/InputStream;
a=0;//     .restart local v1    # "byteread":I
a=0;//     .restart local v6    # "inStream":Ljava/io/InputStream;
a=0;//     :catch_6
a=0;//     #v1=(Null);v2=(Uninit);v4=(Conflicted);v6=(Reference,Ljava/io/FileInputStream;);v7=(Reference,Ljava/io/File;);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .end local v6    # "inStream":Ljava/io/InputStream;
a=0;//     .restart local v5    # "inStream":Ljava/io/InputStream;
a=0;//     #v5=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static copyphoneToSd(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 13
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "from"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 395
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 396
a=0;//     .local v0, "am":Landroid/content/res/AssetManager;
a=0;//     #v0=(Reference,Landroid/content/res/AssetManager;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 398
a=0;//     .local v5, "ins":Ljava/io/InputStream;
a=0;//     #v5=(Null);
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, "/read/"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 399
a=0;//     .local v10, "sp":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/io/File;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/File;);
a=0;//     const-string v11, "test.txt"
a=0;// 
a=0;//     invoke-direct {v7, v10, v11}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 400
a=0;//     .local v7, "outFile":Ljava/io/File;
a=0;//     #v7=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v7}, Ljava/io/File;->getParent()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 401
a=0;//     .local v8, "parentDir":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/io/File;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v9, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 403
a=0;//     .local v9, "parentFile":Ljava/io/File;
a=0;//     #v9=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v9}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_0
a=0;// 
a=0;//     .line 404
a=0;//     invoke-virtual {v9}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 407
a=0;//     :cond_0
a=0;//     invoke-virtual {v7}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     if-nez v11, :cond_1
a=0;// 
a=0;//     .line 409
a=0;//     :try_start_0
a=0;//     invoke-virtual {v7}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     .line 410
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 411
a=0;//     #v5=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v2, Ljava/io/DataInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/DataInputStream;);
a=0;//     invoke-direct {v2, v5}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 412
a=0;//     .local v2, "dis":Ljava/io/DataInputStream;
a=0;//     #v2=(Reference,Ljava/io/DataInputStream;);
a=0;//     new-instance v4, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v4, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 413
a=0;//     .local v4, "fOut":Ljava/io/FileOutputStream;
a=0;//     #v4=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v6, 0x1000
a=0;// 
a=0;//     .line 414
a=0;//     .local v6, "n":I
a=0;//     #v6=(PosShort);
a=0;//     new-array v1, v6, [B
a=0;// 
a=0;//     .line 416
a=0;//     .local v1, "buffer":[B
a=0;//     :goto_0
a=0;//     #v1=(Reference,[B);v11=(Integer);v12=(Conflicted);
a=0;//     invoke-virtual {v2, v1}, Ljava/io/DataInputStream;->read([B)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     const/4 v12, -0x1
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     if-ne v11, v12, :cond_2
a=0;// 
a=0;//     .line 419
a=0;//     invoke-virtual {v4}, Ljava/io/FileOutputStream;->flush()V
a=0;// 
a=0;//     .line 420
a=0;//     invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 421
a=0;//     invoke-virtual {v2}, Ljava/io/DataInputStream;->close()V
a=0;// 
a=0;//     .line 429
a=0;//     .end local v1    # "buffer":[B
a=0;//     .end local v2    # "dis":Ljava/io/DataInputStream;
a=0;//     .end local v4    # "fOut":Ljava/io/FileOutputStream;
a=0;//     .end local v6    # "n":I
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 417
a=0;//     .restart local v1    # "buffer":[B
a=0;//     .restart local v2    # "dis":Ljava/io/DataInputStream;
a=0;//     .restart local v4    # "fOut":Ljava/io/FileOutputStream;
a=0;//     .restart local v6    # "n":I
a=0;//     :cond_2
a=0;//     #v1=(Reference,[B);v2=(Reference,Ljava/io/DataInputStream;);v3=(Uninit);v4=(Reference,Ljava/io/FileOutputStream;);v6=(PosShort);v11=(Integer);v12=(Byte);
a=0;//     invoke-virtual {v4, v1}, Ljava/io/FileOutputStream;->write([B)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 422
a=0;//     .end local v1    # "buffer":[B
a=0;//     .end local v2    # "dis":Ljava/io/DataInputStream;
a=0;//     .end local v4    # "fOut":Ljava/io/FileOutputStream;
a=0;//     .end local v6    # "n":I
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);v12=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 423
a=0;//     .local v3, "e":Ljava/io/FileNotFoundException;
a=0;//     #v3=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     invoke-virtual {v3}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v11, v3}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 424
a=0;//     .end local v3    # "e":Ljava/io/FileNotFoundException;
a=0;//     :catch_1
a=0;//     #v3=(Uninit);v11=(Integer);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 425
a=0;//     .local v3, "e":Ljava/io/IOException;
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v3}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v11, v3}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static cropImage(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
a=0;//     .locals 12
a=0;//     .param p0, "picRes"    # Landroid/graphics/Bitmap;
a=0;//     .param p1, "screenWidth"    # I
a=0;//     .param p2, "screenHeigh"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v11, 0x64
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1230
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1231
a=0;//     .local v3, "picWidth":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1233
a=0;//     .local v4, "picHeight":I
a=0;//     #v4=(Integer);
a=0;//     int-to-float v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     int-to-float v2, v3
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float v10, v0, v2
a=0;// 
a=0;//     .line 1234
a=0;//     .local v10, "scaleWidth":F
a=0;//     #v10=(Float);
a=0;//     int-to-float v0, p2
a=0;// 
a=0;//     int-to-float v2, v4
a=0;// 
a=0;//     div-float v9, v0, v2
a=0;// 
a=0;//     .line 1236
a=0;//     .local v9, "scaleHeight":F
a=0;//     #v9=(Float);
a=0;//     new-instance v5, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     .line 1238
a=0;//     .local v5, "matrix":Landroid/graphics/Matrix;
a=0;//     #v5=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v5, v10, v9}, Landroid/graphics/Matrix;->postScale(FF)Z
a=0;// 
a=0;//     .line 1240
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1241
a=0;//     .local v8, "picNewRes":Landroid/graphics/Bitmap;
a=0;//     #v8=(Reference,Landroid/graphics/Bitmap;);
a=0;//     div-int/lit8 v0, p1, 0x2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x32
a=0;// 
a=0;//     div-int/lit8 v1, p2, 0x2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x32
a=0;// 
a=0;//     invoke-static {v8, v0, v1, v11, v11}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 1242
a=0;//     .local v7, "cropImgBitmap":Landroid/graphics/Bitmap;
a=0;//     #v7=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/common/Util;->recycleBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 1244
a=0;//     return-object v7
a=0;// .end method
a=0;// 
a=0;// .method public static cropImage(Landroid/graphics/Bitmap;Ljava/io/File;II)Landroid/graphics/Bitmap;
a=0;//     .locals 12
a=0;//     .param p0, "picRes"    # Landroid/graphics/Bitmap;
a=0;//     .param p1, "cropImgFile"    # Ljava/io/File;
a=0;//     .param p2, "screenWidth"    # I
a=0;//     .param p3, "screenHeigh"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v11, 0x28
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1210
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1211
a=0;//     .local v3, "picWidth":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1213
a=0;//     .local v4, "picHeight":I
a=0;//     #v4=(Integer);
a=0;//     int-to-float v0, p2
a=0;// 
a=0;//     #v0=(Float);
a=0;//     int-to-float v2, v3
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float v10, v0, v2
a=0;// 
a=0;//     .line 1214
a=0;//     .local v10, "scaleWidth":F
a=0;//     #v10=(Float);
a=0;//     int-to-float v0, p3
a=0;// 
a=0;//     int-to-float v2, v4
a=0;// 
a=0;//     div-float v9, v0, v2
a=0;// 
a=0;//     .line 1216
a=0;//     .local v9, "scaleHeight":F
a=0;//     #v9=(Float);
a=0;//     new-instance v5, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     .line 1218
a=0;//     .local v5, "matrix":Landroid/graphics/Matrix;
a=0;//     #v5=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v5, v10, v9}, Landroid/graphics/Matrix;->postScale(FF)Z
a=0;// 
a=0;//     .line 1220
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1221
a=0;//     .local v8, "picNewRes":Landroid/graphics/Bitmap;
a=0;//     #v8=(Reference,Landroid/graphics/Bitmap;);
a=0;//     div-int/lit8 v0, p2, 0x2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x32
a=0;// 
a=0;//     div-int/lit8 v1, p3, 0x2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x32
a=0;// 
a=0;//     invoke-static {v8, v0, v1, v11, v11}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 1223
a=0;//     .local v7, "cropImgBitmap":Landroid/graphics/Bitmap;
a=0;//     #v7=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-static {v7, p1}, Lcom/twocloo/com/cn/common/Util;->storeImage(Landroid/graphics/Bitmap;Ljava/io/File;)V
a=0;// 
a=0;//     .line 1224
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/common/Util;->recycleBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 1226
a=0;//     return-object v7
a=0;// .end method
a=0;// 
a=0;// .method public static delFile(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p0, "oldPath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 635
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 637
a=0;//     .local v0, "file":Ljava/io/File;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 638
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 643
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 640
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getAndroidSDKVersion()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 748
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 750
a=0;//     .local v0, "version":I
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     sget-object v1, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 754
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 751
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getDrawableFromCache(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 16
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const-string v11, ""
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_2
a=0;// 
a=0;//     .line 109
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v11=(Conflicted);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 149
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Reference,Landroid/graphics/drawable/Drawable;);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     return-object v11
a=0;// 
a=0;//     .line 110
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Boolean);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);
a=0;//     const-string v10, ""
a=0;// 
a=0;//     .line 111
a=0;//     .local v10, "urlPath":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 112
a=0;//     .local v9, "uri":Landroid/net/Uri;
a=0;//     #v9=(Null);
a=0;//     move-object/from16 v10, p1
a=0;// 
a=0;//     .line 113
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v11, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_IMGCACHE:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 114
a=0;//     .local v2, "cacheFile":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_3
a=0;// 
a=0;//     .line 115
a=0;//     invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 117
a=0;//     :cond_3
a=0;//     new-instance v5, Ljava/io/File;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/File;);
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v2, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 119
a=0;//     .local v5, "file":Ljava/io/File;
a=0;//     :try_start_0
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v5}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_4
a=0;// 
a=0;//     .line 120
a=0;//     invoke-static {v5}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 121
a=0;//     #v9=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Landroid/content/ContentResolver;);
a=0;//     invoke-virtual {v11, v9}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     invoke-static {v11, v12}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 144
a=0;//     invoke-virtual {v5}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v12
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     const-wide/16 v14, 0xa
a=0;// 
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     cmp-long v12, v12, v14
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     if-gez v12, :cond_1
a=0;// 
a=0;//     .line 145
a=0;//     invoke-virtual {v5}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 146
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 123
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v9=(Null);v11=(Boolean);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);
a=0;//     new-instance v8, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v8, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 124
a=0;//     .local v8, "outStream":Ljava/io/FileOutputStream;
a=0;//     #v8=(Reference,Ljava/io/FileOutputStream;);
a=0;//     new-instance v11, Ljava/net/URL;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v11, v10}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v11}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v3, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 125
a=0;//     .local v3, "conn":Ljava/net/HttpURLConnection;
a=0;//     const/16 v11, 0x2710
a=0;// 
a=0;//     #v11=(PosShort);
a=0;//     invoke-virtual {v3, v11}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     .line 126
a=0;//     invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     const/16 v12, 0xc8
a=0;// 
a=0;//     #v12=(PosShort);
a=0;//     if-ne v11, v12, :cond_6
a=0;// 
a=0;//     .line 127
a=0;//     invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 128
a=0;//     .local v6, "inStream":Ljava/io/InputStream;
a=0;//     #v6=(Reference,Ljava/io/InputStream;);
a=0;//     const/16 v11, 0x400
a=0;// 
a=0;//     #v11=(PosShort);
a=0;//     new-array v1, v11, [B
a=0;// 
a=0;//     .line 129
a=0;//     .local v1, "buffer":[B
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 130
a=0;//     .local v7, "len":I
a=0;//     :goto_1
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v1}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     const/4 v11, -0x1
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     if-ne v7, v11, :cond_5
a=0;// 
a=0;//     .line 133
a=0;//     invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 134
a=0;//     invoke-virtual {v6}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 135
a=0;//     invoke-static {v5}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 137
a=0;//     #v9=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Landroid/content/ContentResolver;);
a=0;//     invoke-virtual {v11, v9}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     invoke-static {v11, v12}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 144
a=0;//     invoke-virtual {v5}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v12
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     const-wide/16 v14, 0xa
a=0;// 
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     cmp-long v12, v12, v14
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     if-gez v12, :cond_1
a=0;// 
a=0;//     .line 145
a=0;//     invoke-virtual {v5}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 146
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 131
a=0;//     :cond_5
a=0;//     #v9=(Null);v11=(Byte);v12=(PosShort);v13=(Uninit);v14=(Uninit);v15=(Uninit);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v11=(Null);
a=0;//     invoke-virtual {v8, v1, v11, v7}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 141
a=0;//     .end local v1    # "buffer":[B
a=0;//     .end local v3    # "conn":Ljava/net/HttpURLConnection;
a=0;//     .end local v6    # "inStream":Ljava/io/InputStream;
a=0;//     .end local v7    # "len":I
a=0;//     .end local v8    # "outStream":Ljava/io/FileOutputStream;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Reference,Landroid/net/Uri;);v11=(Conflicted);v12=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 142
a=0;//     .local v4, "e":Ljava/lang/Exception;
a=0;//     :try_start_3
a=0;//     #v4=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v11, v4}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 144
a=0;//     invoke-virtual {v5}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v11
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     const-wide/16 v13, 0xa
a=0;// 
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     cmp-long v11, v11, v13
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     if-gez v11, :cond_9
a=0;// 
a=0;//     .line 145
a=0;//     invoke-virtual {v5}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 146
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 144
a=0;//     .end local v4    # "e":Ljava/lang/Exception;
a=0;//     .restart local v3    # "conn":Ljava/net/HttpURLConnection;
a=0;//     .restart local v8    # "outStream":Ljava/io/FileOutputStream;
a=0;//     :cond_6
a=0;//     #v1=(Uninit);v3=(Reference,Ljava/net/HttpURLConnection;);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Reference,Ljava/io/FileOutputStream;);v9=(Null);v11=(Integer);v12=(PosShort);v13=(Uninit);v14=(Uninit);
a=0;//     invoke-virtual {v5}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v11
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     const-wide/16 v13, 0xa
a=0;// 
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     cmp-long v11, v11, v13
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     if-gez v11, :cond_7
a=0;// 
a=0;//     .line 145
a=0;//     invoke-virtual {v5}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 146
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 139
a=0;//     :cond_7
a=0;//     #v11=(Byte);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 143
a=0;//     .end local v3    # "conn":Ljava/net/HttpURLConnection;
a=0;//     .end local v8    # "outStream":Ljava/io/FileOutputStream;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Reference,Landroid/net/Uri;);v11=(Conflicted);v12=(Conflicted);v13=(Uninit);v14=(Uninit);
a=0;//     move-exception v11
a=0;// 
a=0;//     .line 144
a=0;//     #v11=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v5}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v12
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     const-wide/16 v14, 0xa
a=0;// 
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     cmp-long v12, v12, v14
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     if-gez v12, :cond_8
a=0;// 
a=0;//     .line 145
a=0;//     invoke-virtual {v5}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 146
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 148
a=0;//     :cond_8
a=0;//     #v11=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v11
a=0;// 
a=0;//     .line 149
a=0;//     .restart local v4    # "e":Ljava/lang/Exception;
a=0;//     :cond_9
a=0;//     #v4=(Reference,Ljava/lang/Exception;);v11=(Byte);v12=(LongHi);v13=(LongLo);v14=(LongHi);v15=(Uninit);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getImageStream(Ljava/lang/String;)Ljava/io/InputStream;
a=0;//     .locals 4
a=0;//     .param p0, "path"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 224
a=0;//     new-instance v1, Ljava/net/URL;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v1, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 225
a=0;//     .local v1, "url":Ljava/net/URL;
a=0;//     #v1=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 226
a=0;//     .local v0, "conn":Ljava/net/HttpURLConnection;
a=0;//     const/16 v2, 0x2710
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     .line 227
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 228
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xc8
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     .line 229
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 231
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/io/InputStream;);
a=0;//     return-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getModel()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 759
a=0;//     sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static getNewHttpClient()Lorg/apache/http/client/HttpClient;
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     .line 1060
a=0;//     :try_start_0
a=0;//     invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1061
a=0;//     .local v5, "trustStore":Ljava/security/KeyStore;
a=0;//     #v5=(Reference,Ljava/security/KeyStore;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v5, v6, v7}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V
a=0;// 
a=0;//     .line 1063
a=0;//     new-instance v4, Lcom/twocloo/com/cn/common/Util$SSLSocketFactoryEx;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/common/Util$SSLSocketFactoryEx;);
a=0;//     invoke-direct {v4, v5}, Lcom/twocloo/com/cn/common/Util$SSLSocketFactoryEx;-><init>(Ljava/security/KeyStore;)V
a=0;// 
a=0;//     .line 1064
a=0;//     .local v4, "sf":Lorg/apache/http/conn/ssl/SSLSocketFactory;
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/common/Util$SSLSocketFactoryEx;);
a=0;//     sget-object v6, Lorg/apache/http/conn/ssl/SSLSocketFactory;->ALLOW_ALL_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;
a=0;// 
a=0;//     #v6=(Reference,Lorg/apache/http/conn/ssl/X509HostnameVerifier;);
a=0;//     invoke-virtual {v4, v6}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->setHostnameVerifier(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V
a=0;// 
a=0;//     .line 1066
a=0;//     new-instance v2, Lorg/apache/http/params/BasicHttpParams;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-direct {v2}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
a=0;// 
a=0;//     .line 1067
a=0;//     .local v2, "params":Lorg/apache/http/params/HttpParams;
a=0;//     #v2=(Reference,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     sget-object v6, Lorg/apache/http/HttpVersion;->HTTP_1_1:Lorg/apache/http/HttpVersion;
a=0;// 
a=0;//     invoke-static {v2, v6}, Lorg/apache/http/params/HttpProtocolParams;->setVersion(Lorg/apache/http/params/HttpParams;Lorg/apache/http/ProtocolVersion;)V
a=0;// 
a=0;//     .line 1068
a=0;//     const-string v6, "UTF-8"
a=0;// 
a=0;//     invoke-static {v2, v6}, Lorg/apache/http/params/HttpProtocolParams;->setContentCharset(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1070
a=0;//     new-instance v3, Lorg/apache/http/conn/scheme/SchemeRegistry;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/conn/scheme/SchemeRegistry;);
a=0;//     invoke-direct {v3}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V
a=0;// 
a=0;//     .line 1071
a=0;//     .local v3, "registry":Lorg/apache/http/conn/scheme/SchemeRegistry;
a=0;//     #v3=(Reference,Lorg/apache/http/conn/scheme/SchemeRegistry;);
a=0;//     new-instance v6, Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     #v6=(UninitRef,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     const-string v7, "http"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/conn/scheme/PlainSocketFactory;);
a=0;//     const/16 v9, 0x50
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     invoke-direct {v6, v7, v8, v9}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
a=0;// 
a=0;//     #v6=(Reference,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     invoke-virtual {v3, v6}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     .line 1072
a=0;//     new-instance v6, Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     #v6=(UninitRef,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     const-string v7, "https"
a=0;// 
a=0;//     const/16 v8, 0x1bb
a=0;// 
a=0;//     #v8=(PosShort);
a=0;//     invoke-direct {v6, v7, v4, v8}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
a=0;// 
a=0;//     #v6=(Reference,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     invoke-virtual {v3, v6}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     .line 1074
a=0;//     new-instance v0, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;);
a=0;//     invoke-direct {v0, v2, v3}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V
a=0;// 
a=0;//     .line 1076
a=0;//     .local v0, "ccm":Lorg/apache/http/conn/ClientConnectionManager;
a=0;//     #v0=(Reference,Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;);
a=0;//     new-instance v6, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v6=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v6, v0, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1078
a=0;//     .end local v0    # "ccm":Lorg/apache/http/conn/ClientConnectionManager;
a=0;//     .end local v2    # "params":Lorg/apache/http/params/HttpParams;
a=0;//     .end local v3    # "registry":Lorg/apache/http/conn/scheme/SchemeRegistry;
a=0;//     .end local v4    # "sf":Lorg/apache/http/conn/ssl/SSLSocketFactory;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 1077
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 1078
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v6, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v6=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v6}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getSIMOperator(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 776
a=0;//     if-eqz p0, :cond_3
a=0;// 
a=0;//     .line 777
a=0;//     const-string v2, "phone"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 778
a=0;//     .local v1, "iPhoneManager":Landroid/telephony/TelephonyManager;
a=0;//     invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 779
a=0;//     .local v0, "iNumeric":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_3
a=0;// 
a=0;//     .line 780
a=0;//     const-string v2, "46000"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const-string v2, "46002"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const-string v2, "46007"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 781
a=0;//     :cond_0
a=0;//     const-string v2, "CMCC"
a=0;// 
a=0;//     .line 788
a=0;//     .end local v0    # "iNumeric":Ljava/lang/String;
a=0;//     .end local v1    # "iPhoneManager":Landroid/telephony/TelephonyManager;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 782
a=0;//     .restart local v0    # "iNumeric":Ljava/lang/String;
a=0;//     .restart local v1    # "iPhoneManager":Landroid/telephony/TelephonyManager;
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Landroid/telephony/TelephonyManager;);v2=(Boolean);
a=0;//     const-string v2, "46001"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 783
a=0;//     const-string v2, "CU"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 784
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     const-string v2, "46003"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 785
a=0;//     const-string v2, "CT"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 788
a=0;//     .end local v0    # "iNumeric":Ljava/lang/String;
a=0;//     .end local v1    # "iPhoneManager":Landroid/telephony/TelephonyManager;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getScreenBrightness(Landroid/app/Activity;)I
a=0;//     .locals 4
a=0;//     .param p0, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 360
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 361
a=0;//     .local v1, "nowBrightnessValue":I
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 363
a=0;//     .local v2, "resolver":Landroid/content/ContentResolver;
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/content/ContentResolver;);
a=0;//     const-string v3, "screen_brightness"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 367
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 364
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Null);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 365
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getScreenBrightness(Landroid/content/Context;)I
a=0;//     .locals 4
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 373
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 374
a=0;//     .local v1, "nowBrightnessValue":I
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 376
a=0;//     .local v2, "resolver":Landroid/content/ContentResolver;
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/content/ContentResolver;);
a=0;//     const-string v3, "screen_brightness"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 380
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 377
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Null);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 378
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getScreenHeigh(Landroid/app/Activity;)I
a=0;//     .locals 4
a=0;//     .param p0, "context"    # Landroid/app/Activity;
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "NewApi"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1170
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/WindowManager;);
a=0;//     invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1171
a=0;//     .local v0, "display":Landroid/view/Display;
a=0;//     #v0=(Reference,Landroid/view/Display;);
a=0;//     sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xd
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v2, v3, :cond_0
a=0;// 
a=0;//     .line 1172
a=0;//     new-instance v1, Landroid/graphics/Point;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Point;);
a=0;//     invoke-direct {v1}, Landroid/graphics/Point;-><init>()V
a=0;// 
a=0;//     .line 1173
a=0;//     .local v1, "size":Landroid/graphics/Point;
a=0;//     #v1=(Reference,Landroid/graphics/Point;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V
a=0;// 
a=0;//     .line 1174
a=0;//     iget v2, v1, Landroid/graphics/Point;->y:I
a=0;// 
a=0;//     .line 1176
a=0;//     .end local v1    # "size":Landroid/graphics/Point;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     invoke-virtual {v0}, Landroid/view/Display;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getScreenWidth(Landroid/app/Activity;)I
a=0;//     .locals 4
a=0;//     .param p0, "context"    # Landroid/app/Activity;
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "NewApi"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1151
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/WindowManager;);
a=0;//     invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1152
a=0;//     .local v0, "display":Landroid/view/Display;
a=0;//     #v0=(Reference,Landroid/view/Display;);
a=0;//     sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xd
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v2, v3, :cond_0
a=0;// 
a=0;//     .line 1153
a=0;//     new-instance v1, Landroid/graphics/Point;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Point;);
a=0;//     invoke-direct {v1}, Landroid/graphics/Point;-><init>()V
a=0;// 
a=0;//     .line 1154
a=0;//     .local v1, "size":Landroid/graphics/Point;
a=0;//     #v1=(Reference,Landroid/graphics/Point;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V
a=0;// 
a=0;//     .line 1155
a=0;//     iget v2, v1, Landroid/graphics/Point;->x:I
a=0;// 
a=0;//     .line 1157
a=0;//     .end local v1    # "size":Landroid/graphics/Point;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     invoke-virtual {v0}, Landroid/view/Display;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getSystemRelease()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 764
a=0;//     sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     .line 765
a=0;//     .local v0, "release":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getVersionCode()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 735
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 737
a=0;//     .local v0, "code":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v2}, Landroid/app/Application;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v3}, Landroid/app/Application;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 738
a=0;//     .local v1, "info":Landroid/content/pm/PackageInfo;
a=0;//     #v1=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget v3, v1, Landroid/content/pm/PackageInfo;->versionCode:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 742
a=0;//     .end local v1    # "info":Landroid/content/pm/PackageInfo;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 740
a=0;//     :catch_0
a=0;//     #v0=(Null);v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getVersionName()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 721
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v1}, Landroid/app/Application;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v2}, Landroid/app/Application;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 722
a=0;//     .local v0, "info":Landroid/content/pm/PackageInfo;
a=0;//     #v0=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     iget-object v1, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 725
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 723
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 725
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static httpGet(Ljava/lang/String;)[B
a=0;//     .locals 8
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 994
a=0;//     #v4=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 995
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     const-string v5, "result"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "httpGet, url is null"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1014
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,[B);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 999
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Integer);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getNewHttpClient()Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1000
a=0;//     .local v1, "httpClient":Lorg/apache/http/client/HttpClient;
a=0;//     #v1=(Reference,Lorg/apache/http/client/HttpClient;);
a=0;//     new-instance v2, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-direct {v2, p0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1003
a=0;//     .local v2, "httpGet":Lorg/apache/http/client/methods/HttpGet;
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-interface {v1, v2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1004
a=0;//     .local v3, "resp":Lorg/apache/http/HttpResponse;
a=0;//     #v3=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v5}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v6, 0xc8
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     if-eq v5, v6, :cond_2
a=0;// 
a=0;//     .line 1005
a=0;//     const-string v5, "result"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "httpGet fail, status code = "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-interface {v7}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1011
a=0;//     .end local v3    # "resp":Lorg/apache/http/HttpResponse;
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1012
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v5, "result"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "httpGet exception, e = "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1013
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1009
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     .restart local v3    # "resp":Lorg/apache/http/HttpResponse;
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v3=(Reference,Lorg/apache/http/HttpResponse;);v5=(Integer);v6=(PosShort);v7=(Uninit);
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-static {v5}, Lorg/apache/http/util/EntityUtils;->toByteArray(Lorg/apache/http/HttpEntity;)[B
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static httpPost(Ljava/lang/String;Ljava/lang/String;)[B
a=0;//     .locals 8
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .param p1, "entity"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 1026
a=0;//     #v4=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 1027
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     const-string v5, "result"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "httpPost, url is null"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1050
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,[B);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 1031
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Integer);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getNewHttpClient()Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1033
a=0;//     .local v1, "httpClient":Lorg/apache/http/client/HttpClient;
a=0;//     #v1=(Reference,Lorg/apache/http/client/HttpClient;);
a=0;//     new-instance v2, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-direct {v2, p0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1036
a=0;//     .local v2, "httpPost":Lorg/apache/http/client/methods/HttpPost;
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     new-instance v5, Lorg/apache/http/entity/StringEntity;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/apache/http/entity/StringEntity;);
a=0;//     invoke-direct {v5, p1}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Lorg/apache/http/entity/StringEntity;);
a=0;//     invoke-virtual {v2, v5}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 1037
a=0;//     const-string v5, "Accept"
a=0;// 
a=0;//     const-string v6, "application/json"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5, v6}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1038
a=0;//     const-string v5, "Content-type"
a=0;// 
a=0;//     const-string v6, "application/json"
a=0;// 
a=0;//     invoke-virtual {v2, v5, v6}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1040
a=0;//     invoke-interface {v1, v2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1041
a=0;//     .local v3, "resp":Lorg/apache/http/HttpResponse;
a=0;//     #v3=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v5}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v6, 0xc8
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     if-eq v5, v6, :cond_2
a=0;// 
a=0;//     .line 1042
a=0;//     const-string v5, "result"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "httpGet fail, status code = "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-interface {v7}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1047
a=0;//     .end local v3    # "resp":Lorg/apache/http/HttpResponse;
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1048
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v5, "result"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "httpPost exception, e = "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1049
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1046
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     .restart local v3    # "resp":Lorg/apache/http/HttpResponse;
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v3=(Reference,Lorg/apache/http/HttpResponse;);v5=(Integer);v6=(PosShort);v7=(Uninit);
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-static {v5}, Lorg/apache/http/util/EntityUtils;->toByteArray(Lorg/apache/http/HttpEntity;)[B
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isChinaUnionPhoneNo(Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;//     .param p0, "mobiles"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 819
a=0;//     const-string v0, "[1][358][01256]\\d{8}"
a=0;// 
a=0;//     .line 820
a=0;//     .local v0, "telRegex":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 821
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 823
a=0;//     :goto_0
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isNeedConvert(C)Z
a=0;//     .locals 1
a=0;//     .param p0, "para"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 354
a=0;//     and-int/lit16 v0, p0, 0xff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, p0, :cond_0
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
a=0;// .method public static isTelePhoneNo(Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;//     .param p0, "mobiles"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 804
a=0;//     const-string v0, "[1][358]\\d{9}"
a=0;// 
a=0;//     .line 805
a=0;//     .local v0, "telRegex":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 806
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 808
a=0;//     :goto_0
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isUsernamelong(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;//     .param p0, "name"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 835
a=0;//     :try_start_0
a=0;//     const-string v2, "gbk"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     array-length v1, v2
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 836
a=0;//     .local v1, "len":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 837
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 842
a=0;//     .end local v1    # "len":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     .line 839
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 840
a=0;//     .local v0, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
a=0;// 
a=0;//     .line 842
a=0;//     .end local v0    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static md5(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "s"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 283
a=0;//     :try_start_0
a=0;//     const-string v3, "MD5"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 284
a=0;//     .local v0, "digest":Ljava/security/MessageDigest;
a=0;//     #v0=(Reference,Ljava/security/MessageDigest;);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/security/MessageDigest;->update([B)V
a=0;// 
a=0;//     .line 285
a=0;//     invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 287
a=0;//     .local v2, "messageDigest":[B
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/Util;->toHexString([B)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 292
a=0;//     .end local v0    # "digest":Ljava/security/MessageDigest;
a=0;//     .end local v2    # "messageDigest":[B
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 288
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 289
a=0;//     .local v1, "e":Ljava/security/NoSuchAlgorithmException;
a=0;//     #v1=(Reference,Ljava/security/NoSuchAlgorithmException;);
a=0;//     invoke-virtual {v1}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 292
a=0;//     const-string v3, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static rblur(Landroid/graphics/Bitmap;Landroid/view/View;Landroid/content/Context;FF)V
a=0;//     .locals 8
a=0;//     .param p0, "bkg"    # Landroid/graphics/Bitmap;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "context"    # Landroid/content/Context;
a=0;//     .param p3, "scaleFactor"    # F
a=0;//     .param p4, "radius"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v7, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 1129
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v3, p3
a=0;// 
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float/2addr v4, p3
a=0;// 
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     .line 1130
a=0;//     #v4=(Integer);
a=0;//     sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     .line 1129
a=0;//     #v5=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1131
a=0;//     .local v1, "overlay":Landroid/graphics/Bitmap;
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     new-instance v0, Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 1132
a=0;//     .local v0, "canvas":Landroid/graphics/Canvas;
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     neg-int v3, v3
a=0;// 
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v3, p3
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     neg-int v4, v4
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float/2addr v4, p3
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 1133
a=0;//     div-float v3, v7, p3
a=0;// 
a=0;//     div-float v4, v7, p3
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/graphics/Canvas;->scale(FF)V
a=0;// 
a=0;//     .line 1134
a=0;//     new-instance v2, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     .line 1135
a=0;//     .local v2, "paint":Landroid/graphics/Paint;
a=0;//     #v2=(Reference,Landroid/graphics/Paint;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setFlags(I)V
a=0;// 
a=0;//     .line 1136
a=0;//     invoke-virtual {v0, p0, v6, v6, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 1137
a=0;//     float-to-int v3, p4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {v1, v3, v4}, Lcom/twocloo/com/cn/utils/FastBlur;->doBlur(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1138
a=0;//     new-instance v3, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-direct {v3, v4, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     invoke-virtual {p1, v3}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 1139
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized read(Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .locals 10
a=0;//     .param p0, "aid"    # Ljava/lang/String;
a=0;//     .param p1, "chapterid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 526
a=0;//     const-class v6, Lcom/twocloo/com/cn/common/Util;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v6
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v7, Lcom/twocloo/com/cn/common/Util;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v7
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 528
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 530
a=0;//     .local v2, "in":Ljava/io/ObjectInputStream;
a=0;//     :try_start_1
a=0;//     #v2=(Null);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v8, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_BOOK:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "/"
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v8, "/obj"
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "rdbook"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "_"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v1, v5, v8}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 531
a=0;//     .local v1, "f":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 532
a=0;//     new-instance v3, Ljava/io/ObjectInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/ObjectInputStream;);
a=0;//     new-instance v5, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v5, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v3, v5}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_3
a=0;// 
a=0;//     .line 533
a=0;//     .end local v2    # "in":Ljava/io/ObjectInputStream;
a=0;//     .local v3, "in":Ljava/io/ObjectInputStream;
a=0;//     :try_start_2
a=0;//     #v3=(Reference,Ljava/io/ObjectInputStream;);
a=0;//     invoke-virtual {v3}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_4
a=0;// 
a=0;//     .line 540
a=0;//     .local v4, "rdbook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 542
a=0;//     :try_start_3
a=0;//     invoke-virtual {v3}, Ljava/io/ObjectInputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 534
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :try_start_4
a=0;//     #v0=(Conflicted);
a=0;//     monitor-exit v7
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 551
a=0;//     .end local v1    # "f":Ljava/io/File;
a=0;//     .end local v3    # "in":Ljava/io/ObjectInputStream;
a=0;//     .end local v4    # "rdbook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .restart local v2    # "in":Ljava/io/ObjectInputStream;
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/io/ObjectInputStream;);v3=(Conflicted);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     monitor-exit v6
a=0;// 
a=0;//     return-object v4
a=0;// 
a=0;//     .line 543
a=0;//     .end local v2    # "in":Ljava/io/ObjectInputStream;
a=0;//     .restart local v1    # "f":Ljava/io/File;
a=0;//     .restart local v3    # "in":Ljava/io/ObjectInputStream;
a=0;//     .restart local v4    # "rdbook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Reference,Ljava/io/File;);v2=(Null);v3=(Reference,Ljava/io/ObjectInputStream;);v5=(Reference,Ljava/io/FileInputStream;);v8=(Reference,Ljava/lang/String;);v9=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 544
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     :try_start_5
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 526
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .end local v1    # "f":Ljava/io/File;
a=0;//     .end local v3    # "in":Ljava/io/ObjectInputStream;
a=0;//     .end local v4    # "rdbook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .restart local v2    # "in":Ljava/io/ObjectInputStream;
a=0;//     :goto_2
a=0;//     :try_start_6
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/io/ObjectInputStream;);v3=(Conflicted);v4=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     monitor-exit v7
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_2
a=0;// 
a=0;//     :try_start_7
a=0;//     throw v5
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_1
a=0;// 
a=0;//     .end local v2    # "in":Ljava/io/ObjectInputStream;
a=0;//     :catchall_1
a=0;//     #v2=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v6
a=0;// 
a=0;//     throw v5
a=0;// 
a=0;//     .line 537
a=0;//     .restart local v2    # "in":Ljava/io/ObjectInputStream;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v2=(Null);v4=(Uninit);v5=(Conflicted);v7=(Reference,Ljava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 538
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     :goto_3
a=0;//     :try_start_8
a=0;//     #v0=(Reference,Ljava/lang/Exception;);v2=(Reference,Ljava/io/ObjectInputStream;);v4=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_3
a=0;// 
a=0;//     .line 540
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 542
a=0;//     :try_start_9
a=0;//     invoke-virtual {v2}, Ljava/io/ObjectInputStream;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_2
a=0;// 
a=0;//     .line 526
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     :cond_1
a=0;//     :goto_4
a=0;//     :try_start_a
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     monitor-exit v7
a=0;// 
a=0;//     .line 551
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 543
a=0;//     .restart local v0    # "e":Ljava/lang/Exception;
a=0;//     :catch_2
a=0;//     #v0=(Reference,Ljava/lang/Exception;);v4=(Conflicted);v5=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 544
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_a
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_2
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 526
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 539
a=0;//     :catchall_3
a=0;//     #v5=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 540
a=0;//     :goto_5
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 542
a=0;//     :try_start_b
a=0;//     invoke-virtual {v2}, Ljava/io/ObjectInputStream;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_2
a=0;// 
a=0;//     .line 548
a=0;//     :cond_2
a=0;//     :goto_6
a=0;//     :try_start_c
a=0;//     throw v5
a=0;// 
a=0;//     .line 543
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 544
a=0;//     .restart local v0    # "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_c
a=0;//     .catchall {:try_start_c .. :try_end_c} :catchall_2
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 540
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     .restart local v1    # "f":Ljava/io/File;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Reference,Ljava/io/File;);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Boolean);v9=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 542
a=0;//     :try_start_d
a=0;//     invoke-virtual {v2}, Ljava/io/ObjectInputStream;->close()V
a=0;//     :try_end_d
a=0;//     .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_4
a=0;//     .catchall {:try_start_d .. :try_end_d} :catchall_2
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 543
a=0;//     :catch_4
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 544
a=0;//     .restart local v0    # "e":Ljava/io/IOException;
a=0;//     :try_start_e
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_e
a=0;//     .catchall {:try_start_e .. :try_end_e} :catchall_2
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 539
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     .end local v2    # "in":Ljava/io/ObjectInputStream;
a=0;//     .restart local v3    # "in":Ljava/io/ObjectInputStream;
a=0;//     :catchall_4
a=0;//     #v0=(Uninit);v3=(Reference,Ljava/io/ObjectInputStream;);v4=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .end local v3    # "in":Ljava/io/ObjectInputStream;
a=0;//     .restart local v2    # "in":Ljava/io/ObjectInputStream;
a=0;//     #v2=(Reference,Ljava/io/ObjectInputStream;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 537
a=0;//     .end local v2    # "in":Ljava/io/ObjectInputStream;
a=0;//     .restart local v3    # "in":Ljava/io/ObjectInputStream;
a=0;//     :catch_5
a=0;//     #v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .end local v3    # "in":Ljava/io/ObjectInputStream;
a=0;//     .restart local v2    # "in":Ljava/io/ObjectInputStream;
a=0;//     #v2=(Reference,Ljava/io/ObjectInputStream;);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized read(Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     .locals 13
a=0;//     .param p0, "aid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 487
a=0;//     const-class v7, Lcom/twocloo/com/cn/common/Util;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v7
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v8, Lcom/twocloo/com/cn/common/Util;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v8
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 488
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 489
a=0;//     .local v3, "in":Ljava/io/ObjectInputStream;
a=0;//     #v3=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 491
a=0;//     .local v5, "mul":Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     :try_start_1
a=0;//     #v5=(Null);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v6, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_DOWNML:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "dlml"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v2, v6, v9}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 492
a=0;//     .local v2, "f":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 493
a=0;//     invoke-virtual {v2}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v9
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     const-wide/16 v11, 0x0
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     cmp-long v6, v9, v11
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-lez v6, :cond_1
a=0;// 
a=0;//     .line 494
a=0;//     new-instance v4, Ljava/io/ObjectInputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/ObjectInputStream;);
a=0;//     new-instance v6, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v6, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v4, v6}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_2
a=0;// 
a=0;//     .line 495
a=0;//     .end local v3    # "in":Ljava/io/ObjectInputStream;
a=0;//     .local v4, "in":Ljava/io/ObjectInputStream;
a=0;//     :try_start_2
a=0;//     #v4=(Reference,Ljava/io/ObjectInputStream;);
a=0;//     invoke-virtual {v4}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     move-object v0, v6
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-object v5, v0
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/EOFException; {:try_start_2 .. :try_end_2} :catch_8
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_7
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_3
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .line 506
a=0;//     .end local v4    # "in":Ljava/io/ObjectInputStream;
a=0;//     .restart local v3    # "in":Ljava/io/ObjectInputStream;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/io/ObjectInputStream;);v4=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 508
a=0;//     :try_start_3
a=0;//     invoke-virtual {v3}, Ljava/io/ObjectInputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 499
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     :try_start_4
a=0;//     #v1=(Conflicted);
a=0;//     monitor-exit v8
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     move-object v6, v5
a=0;// 
a=0;//     .line 515
a=0;//     .end local v2    # "f":Ljava/io/File;
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v6=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     monitor-exit v7
a=0;// 
a=0;//     return-object v6
a=0;// 
a=0;//     .line 497
a=0;//     .restart local v2    # "f":Ljava/io/File;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Ljava/io/File;);v3=(Null);v4=(Uninit);v5=(Null);v6=(Byte);v9=(LongLo);v10=(LongHi);v11=(LongLo);v12=(LongHi);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 509
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/io/ObjectInputStream;);v4=(Conflicted);v5=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 510
a=0;//     .local v1, "e":Ljava/io/IOException;
a=0;//     :try_start_5
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 487
a=0;//     .end local v1    # "e":Ljava/io/IOException;
a=0;//     .end local v2    # "f":Ljava/io/File;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v8
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     :try_start_6
a=0;//     throw v6
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     .end local v3    # "in":Ljava/io/ObjectInputStream;
a=0;//     .end local v5    # "mul":Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     :catchall_1
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v7
a=0;// 
a=0;//     throw v6
a=0;// 
a=0;//     .line 501
a=0;//     .restart local v3    # "in":Ljava/io/ObjectInputStream;
a=0;//     .restart local v5    # "mul":Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Null);v5=(Null);v6=(Conflicted);v8=(Reference,Ljava/lang/Object;);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 502
a=0;//     .local v1, "e":Ljava/io/EOFException;
a=0;//     :goto_3
a=0;//     :try_start_7
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/EOFException;);v3=(Reference,Ljava/io/ObjectInputStream;);
a=0;//     invoke-virtual {v1}, Ljava/io/EOFException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_2
a=0;// 
a=0;//     .line 506
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 508
a=0;//     :try_start_8
a=0;//     invoke-virtual {v3}, Ljava/io/ObjectInputStream;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_0
a=0;// 
a=0;//     .line 487
a=0;//     .end local v1    # "e":Ljava/io/EOFException;
a=0;//     :cond_2
a=0;//     :goto_4
a=0;//     :try_start_9
a=0;//     #v1=(Conflicted);v6=(Conflicted);
a=0;//     monitor-exit v8
a=0;// 
a=0;//     .line 515
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 509
a=0;//     .restart local v1    # "e":Ljava/io/EOFException;
a=0;//     :catch_2
a=0;//     #v1=(Reference,Ljava/io/EOFException;);v6=(Reference,Ljava/lang/String;);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 510
a=0;//     .local v1, "e":Ljava/io/IOException;
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_9
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 503
a=0;//     .end local v1    # "e":Ljava/io/IOException;
a=0;//     :catch_3
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Null);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 504
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     :goto_5
a=0;//     :try_start_a
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Exception;);v3=(Reference,Ljava/io/ObjectInputStream;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_a
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_2
a=0;// 
a=0;//     .line 506
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 508
a=0;//     :try_start_b
a=0;//     invoke-virtual {v3}, Ljava/io/ObjectInputStream;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_4
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 509
a=0;//     :catch_4
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 510
a=0;//     .local v1, "e":Ljava/io/IOException;
a=0;//     :try_start_c
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_c
a=0;//     .catchall {:try_start_c .. :try_end_c} :catchall_0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 505
a=0;//     .end local v1    # "e":Ljava/io/IOException;
a=0;//     :catchall_2
a=0;//     #v1=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 506
a=0;//     :goto_6
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 508
a=0;//     :try_start_d
a=0;//     invoke-virtual {v3}, Ljava/io/ObjectInputStream;->close()V
a=0;//     :try_end_d
a=0;//     .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_5
a=0;//     .catchall {:try_start_d .. :try_end_d} :catchall_0
a=0;// 
a=0;//     .line 513
a=0;//     :cond_3
a=0;//     :goto_7
a=0;//     :try_start_e
a=0;//     throw v6
a=0;// 
a=0;//     .line 509
a=0;//     :catch_5
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 510
a=0;//     .restart local v1    # "e":Ljava/io/IOException;
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_e
a=0;//     .catchall {:try_start_e .. :try_end_e} :catchall_0
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 506
a=0;//     .end local v1    # "e":Ljava/io/IOException;
a=0;//     .restart local v2    # "f":Ljava/io/File;
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Ljava/io/File;);v3=(Null);v4=(Uninit);v6=(Boolean);v10=(Reference,Ljava/lang/String;);v11=(Uninit);v12=(Uninit);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 508
a=0;//     :try_start_f
a=0;//     invoke-virtual {v3}, Ljava/io/ObjectInputStream;->close()V
a=0;//     :try_end_f
a=0;//     .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_6
a=0;//     .catchall {:try_start_f .. :try_end_f} :catchall_0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 509
a=0;//     :catch_6
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 510
a=0;//     .restart local v1    # "e":Ljava/io/IOException;
a=0;//     :try_start_10
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_10
a=0;//     .catchall {:try_start_10 .. :try_end_10} :catchall_0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 505
a=0;//     .end local v1    # "e":Ljava/io/IOException;
a=0;//     .end local v3    # "in":Ljava/io/ObjectInputStream;
a=0;//     .restart local v4    # "in":Ljava/io/ObjectInputStream;
a=0;//     :catchall_3
a=0;//     #v0=(Conflicted);v1=(Uninit);v4=(Reference,Ljava/io/ObjectInputStream;);v9=(LongLo);v10=(LongHi);v11=(LongLo);v12=(LongHi);
a=0;//     move-exception v6
a=0;// 
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .end local v4    # "in":Ljava/io/ObjectInputStream;
a=0;//     .restart local v3    # "in":Ljava/io/ObjectInputStream;
a=0;//     #v3=(Reference,Ljava/io/ObjectInputStream;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 503
a=0;//     .end local v3    # "in":Ljava/io/ObjectInputStream;
a=0;//     .restart local v4    # "in":Ljava/io/ObjectInputStream;
a=0;//     :catch_7
a=0;//     #v3=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .end local v4    # "in":Ljava/io/ObjectInputStream;
a=0;//     .restart local v3    # "in":Ljava/io/ObjectInputStream;
a=0;//     #v3=(Reference,Ljava/io/ObjectInputStream;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 501
a=0;//     .end local v3    # "in":Ljava/io/ObjectInputStream;
a=0;//     .restart local v4    # "in":Ljava/io/ObjectInputStream;
a=0;//     :catch_8
a=0;//     #v1=(Uninit);v3=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/EOFException;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .end local v4    # "in":Ljava/io/ObjectInputStream;
a=0;//     .restart local v3    # "in":Ljava/io/ObjectInputStream;
a=0;//     #v3=(Reference,Ljava/io/ObjectInputStream;);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static readBook(Ljava/lang/String;)Ljava/io/File;
a=0;//     .locals 4
a=0;//     .param p0, "aid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 562
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_BOOK:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "/"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "/book_text_"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ".txt"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 563
a=0;//     .local v1, "bookFileName":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 565
a=0;//     .local v0, "bookFile":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static recycleBitmap(Landroid/graphics/Bitmap;)V
a=0;//     .locals 1
a=0;//     .param p0, "bmp"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 970
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 971
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 972
a=0;//     const/4 p0, 0x0
a=0;// 
a=0;//     .line 974
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static saveBookcoverToSD(Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;//     .locals 7
a=0;//     .param p0, "urlPath"    # Ljava/lang/String;
a=0;//     .param p1, "bitmap"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v5, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_IMGCACHE:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 243
a=0;//     .local v1, "file":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 244
a=0;//     invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 246
a=0;//     :cond_0
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 247
a=0;//     .local v2, "iconFile":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 249
a=0;//     .local v3, "os":Ljava/io/BufferedOutputStream;
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     new-instance v4, Ljava/io/BufferedOutputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/BufferedOutputStream;);
a=0;//     new-instance v5, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v5, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v4, v5}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 250
a=0;//     .end local v3    # "os":Ljava/io/BufferedOutputStream;
a=0;//     .local v4, "os":Ljava/io/BufferedOutputStream;
a=0;//     :try_start_1
a=0;//     #v4=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     sget-object v5, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     const/16 v6, 0x64
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {p1, v5, v6, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     .line 251
a=0;//     invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->flush()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 255
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 257
a=0;//     :try_start_2
a=0;//     invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
a=0;// 
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .line 263
a=0;//     .end local v4    # "os":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v3    # "os":Ljava/io/BufferedOutputStream;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/io/BufferedOutputStream;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 252
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v3=(Null);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 253
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     :goto_1
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Exception;);v3=(Reference,Ljava/io/BufferedOutputStream;);v6=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 255
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 257
a=0;//     :try_start_4
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedOutputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 258
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 259
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 254
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 255
a=0;//     :goto_2
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 257
a=0;//     :try_start_5
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedOutputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     .line 262
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     throw v5
a=0;// 
a=0;//     .line 258
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 259
a=0;//     .restart local v0    # "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 258
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     .end local v3    # "os":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v4    # "os":Ljava/io/BufferedOutputStream;
a=0;//     :catch_3
a=0;//     #v0=(Uninit);v3=(Null);v4=(Reference,Ljava/io/BufferedOutputStream;);v6=(PosByte);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 259
a=0;//     .restart local v0    # "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .end local v4    # "os":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v3    # "os":Ljava/io/BufferedOutputStream;
a=0;//     #v3=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 254
a=0;//     .end local v3    # "os":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v4    # "os":Ljava/io/BufferedOutputStream;
a=0;//     :catchall_1
a=0;//     #v0=(Uninit);v3=(Null);v6=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .end local v4    # "os":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v3    # "os":Ljava/io/BufferedOutputStream;
a=0;//     #v3=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 252
a=0;//     .end local v3    # "os":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v4    # "os":Ljava/io/BufferedOutputStream;
a=0;//     :catch_4
a=0;//     #v3=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .end local v4    # "os":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v3    # "os":Ljava/io/BufferedOutputStream;
a=0;//     #v3=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static saveImgFile(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 14
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const-string v9, ""
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_2
a=0;// 
a=0;//     .line 170
a=0;//     :cond_0
a=0;//     #v9=(Conflicted);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 212
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Reference,Ljava/lang/String;);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     return-object v9
a=0;// 
a=0;//     .line 171
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Boolean);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     move-object v8, p1
a=0;// 
a=0;//     .line 173
a=0;//     .local v8, "urlPath":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v9, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_IMGCACHE:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 174
a=0;//     .local v1, "cacheFile":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_3
a=0;// 
a=0;//     .line 175
a=0;//     invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 177
a=0;//     :cond_3
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v1, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 179
a=0;//     .local v4, "file":Ljava/io/File;
a=0;//     :try_start_0
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_4
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 207
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v10
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const-wide/16 v12, 0xa
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     cmp-long v10, v10, v12
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     if-gez v10, :cond_1
a=0;// 
a=0;//     .line 208
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 209
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 182
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v9=(Boolean);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     new-instance v7, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v7, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 183
a=0;//     .local v7, "outStream":Ljava/io/FileOutputStream;
a=0;//     #v7=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const-string v9, "http.keepAlive"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "false"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v10}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 184
a=0;//     new-instance v9, Ljava/net/URL;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v9, v8}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v9}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v2, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 185
a=0;//     .local v2, "conn":Ljava/net/HttpURLConnection;
a=0;//     sget-object v9, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v9, :cond_5
a=0;// 
a=0;//     sget v9, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/16 v10, 0xd
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     if-le v9, v10, :cond_5
a=0;// 
a=0;//     .line 186
a=0;//     const-string v9, "Connection"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "close"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v9, v10}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 188
a=0;//     :cond_5
a=0;//     #v9=(Conflicted);v10=(Conflicted);
a=0;//     const/16 v9, 0x2710
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     invoke-virtual {v2, v9}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     .line 190
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/16 v10, 0xc8
a=0;// 
a=0;//     #v10=(PosShort);
a=0;//     if-ne v9, v10, :cond_7
a=0;// 
a=0;//     .line 191
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 192
a=0;//     .local v5, "inStream":Ljava/io/InputStream;
a=0;//     #v5=(Reference,Ljava/io/InputStream;);
a=0;//     const/16 v9, 0x400
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     new-array v0, v9, [B
a=0;// 
a=0;//     .line 193
a=0;//     .local v0, "buffer":[B
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 194
a=0;//     .local v6, "len":I
a=0;//     :goto_1
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v0}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     const/4 v9, -0x1
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-ne v6, v9, :cond_6
a=0;// 
a=0;//     .line 197
a=0;//     invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 198
a=0;//     invoke-virtual {v5}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 199
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 207
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v10
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const-wide/16 v12, 0xa
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     cmp-long v10, v10, v12
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     if-gez v10, :cond_1
a=0;// 
a=0;//     .line 208
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 209
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 195
a=0;//     :cond_6
a=0;//     #v9=(Byte);v10=(PosShort);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {v7, v0, v9, v6}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 204
a=0;//     .end local v0    # "buffer":[B
a=0;//     .end local v2    # "conn":Ljava/net/HttpURLConnection;
a=0;//     .end local v5    # "inStream":Ljava/io/InputStream;
a=0;//     .end local v6    # "len":I
a=0;//     .end local v7    # "outStream":Ljava/io/FileOutputStream;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 205
a=0;//     .local v3, "e":Ljava/lang/Exception;
a=0;//     :try_start_3
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v3}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 207
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v9
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     const-wide/16 v11, 0xa
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     cmp-long v9, v9, v11
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-gez v9, :cond_a
a=0;// 
a=0;//     .line 208
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 209
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 207
a=0;//     .end local v3    # "e":Ljava/lang/Exception;
a=0;//     .restart local v2    # "conn":Ljava/net/HttpURLConnection;
a=0;//     .restart local v7    # "outStream":Ljava/io/FileOutputStream;
a=0;//     :cond_7
a=0;//     #v0=(Uninit);v2=(Reference,Ljava/net/HttpURLConnection;);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Reference,Ljava/io/FileOutputStream;);v9=(Integer);v10=(PosShort);v11=(Uninit);v12=(Uninit);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v9
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     const-wide/16 v11, 0xa
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     cmp-long v9, v9, v11
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-gez v9, :cond_8
a=0;// 
a=0;//     .line 208
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 209
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 201
a=0;//     :cond_8
a=0;//     #v9=(Byte);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 206
a=0;//     .end local v2    # "conn":Ljava/net/HttpURLConnection;
a=0;//     .end local v7    # "outStream":Ljava/io/FileOutputStream;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Uninit);v12=(Uninit);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 207
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v10
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const-wide/16 v12, 0xa
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     cmp-long v10, v10, v12
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     if-gez v10, :cond_9
a=0;// 
a=0;//     .line 208
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 209
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 211
a=0;//     :cond_9
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v9
a=0;// 
a=0;//     .line 212
a=0;//     .restart local v3    # "e":Ljava/lang/Exception;
a=0;//     :cond_a
a=0;//     #v3=(Reference,Ljava/lang/Exception;);v9=(Byte);v10=(LongHi);v11=(LongLo);v12=(LongHi);v13=(Uninit);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static savePhotoToSd(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 7
a=0;//     .param p0, "bitmap"    # Landroid/graphics/Bitmap;
a=0;//     .param p1, "filePath"    # Ljava/lang/String;
a=0;//     .param p2, "filename"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 909
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 932
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 911
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 912
a=0;//     .local v1, "file":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     .line 913
a=0;//     invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 915
a=0;//     :cond_2
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, v1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 916
a=0;//     .local v2, "iconFile":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 918
a=0;//     .local v3, "os":Ljava/io/BufferedOutputStream;
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     new-instance v4, Ljava/io/BufferedOutputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/BufferedOutputStream;);
a=0;//     new-instance v5, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v5, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v4, v5}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 919
a=0;//     .end local v3    # "os":Ljava/io/BufferedOutputStream;
a=0;//     .local v4, "os":Ljava/io/BufferedOutputStream;
a=0;//     :try_start_1
a=0;//     #v4=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     sget-object v5, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     const/16 v6, 0x64
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {p0, v5, v6, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     .line 920
a=0;//     invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->flush()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 924
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 926
a=0;//     :try_start_2
a=0;//     invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
a=0;// 
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .line 927
a=0;//     .end local v4    # "os":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v3    # "os":Ljava/io/BufferedOutputStream;
a=0;//     #v3=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 921
a=0;//     :catch_0
a=0;//     #v3=(Null);v4=(Conflicted);v5=(Conflicted);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 922
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     :goto_1
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Exception;);v3=(Reference,Ljava/io/BufferedOutputStream;);v6=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 924
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 926
a=0;//     :try_start_4
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedOutputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 927
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 928
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 923
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 924
a=0;//     :goto_2
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 926
a=0;//     :try_start_5
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedOutputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     .line 931
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     throw v5
a=0;// 
a=0;//     .line 927
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 928
a=0;//     .restart local v0    # "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 927
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     .end local v3    # "os":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v4    # "os":Ljava/io/BufferedOutputStream;
a=0;//     :catch_3
a=0;//     #v0=(Uninit);v3=(Null);v4=(Reference,Ljava/io/BufferedOutputStream;);v6=(PosByte);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 928
a=0;//     .restart local v0    # "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .end local v4    # "os":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v3    # "os":Ljava/io/BufferedOutputStream;
a=0;//     #v3=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 923
a=0;//     .end local v3    # "os":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v4    # "os":Ljava/io/BufferedOutputStream;
a=0;//     :catchall_1
a=0;//     #v0=(Uninit);v3=(Null);v6=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .end local v4    # "os":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v3    # "os":Ljava/io/BufferedOutputStream;
a=0;//     #v3=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 921
a=0;//     .end local v3    # "os":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v4    # "os":Ljava/io/BufferedOutputStream;
a=0;//     :catch_4
a=0;//     #v3=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .end local v4    # "os":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v3    # "os":Ljava/io/BufferedOutputStream;
a=0;//     #v3=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static setBrightness(Landroid/app/Activity;I)V
a=0;//     .locals 3
a=0;//     .param p0, "activity"    # Landroid/app/Activity;
a=0;//     .param p1, "brightness"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 387
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 389
a=0;//     .local v0, "lp":Landroid/view/WindowManager$LayoutParams;
a=0;//     #v0=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     int-to-float v1, p1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Float;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const v2, 0x3b808081
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F
a=0;// 
a=0;//     .line 391
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
a=0;// 
a=0;//     .line 392
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setToString(Ljava/util/Set;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Set",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 569
a=0;//     .local p0, "set":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
a=0;//     if-eqz p0, :cond_2
a=0;// 
a=0;//     invoke-interface {p0}, Ljava/util/Set;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_2
a=0;// 
a=0;//     .line 570
a=0;//     const-string v1, ""
a=0;// 
a=0;//     .line 571
a=0;//     .local v1, "st":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 572
a=0;//     .local v0, "buff":Ljava/lang/StringBuffer;
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 578
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 581
a=0;//     .end local v0    # "buff":Ljava/lang/StringBuffer;
a=0;//     .end local v1    # "st":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 572
a=0;//     .restart local v0    # "buff":Ljava/lang/StringBuffer;
a=0;//     .restart local v1    # "st":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);v1=(Reference,Ljava/lang/String;);v4=(Boolean);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     .line 573
a=0;//     .local v2, "string":Ljava/lang/String;
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 574
a=0;//     const-string v4, ""
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 575
a=0;//     const-string v1, ","
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 581
a=0;//     .end local v0    # "buff":Ljava/lang/StringBuffer;
a=0;//     .end local v1    # "st":Ljava/lang/String;
a=0;//     .end local v2    # "string":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static sha1(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 12
a=0;//     .param p0, "str"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 307
a=0;//     #v11=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-nez v10, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v10=(Conflicted);
a=0;//     move-object v10, v11
a=0;// 
a=0;//     .line 328
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Reference,Ljava/lang/String;);
a=0;//     return-object v10
a=0;// 
a=0;//     .line 311
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Integer);
a=0;//     const/16 v10, 0x10
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     new-array v3, v10, [C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     fill-array-data v3, :array_0
a=0;// 
a=0;//     .line 314
a=0;//     .local v3, "hexDigits":[C
a=0;//     :try_start_0
a=0;//     const-string v10, "SHA1"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v10}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 315
a=0;//     .local v9, "mdTemp":Ljava/security/MessageDigest;
a=0;//     #v9=(Reference,Ljava/security/MessageDigest;);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/security/MessageDigest;->update([B)V
a=0;// 
a=0;//     .line 317
a=0;//     invoke-virtual {v9}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 318
a=0;//     .local v8, "md":[B
a=0;//     #v8=(Reference,[B);
a=0;//     array-length v5, v8
a=0;// 
a=0;//     .line 319
a=0;//     .local v5, "j":I
a=0;//     #v5=(Integer);
a=0;//     mul-int/lit8 v10, v5, 0x2
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     new-array v0, v10, [C
a=0;// 
a=0;//     .line 320
a=0;//     .local v0, "buf":[C
a=0;//     #v0=(Reference,[C);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 321
a=0;//     .local v6, "k":I
a=0;//     #v6=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i":I
a=0;//     #v4=(Null);
a=0;//     move v7, v6
a=0;// 
a=0;//     .end local v6    # "k":I
a=0;//     .local v7, "k":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v4=(Integer);v6=(Integer);v7=(Integer);
a=0;//     if-lt v4, v5, :cond_2
a=0;// 
a=0;//     .line 326
a=0;//     new-instance v10, Ljava/lang/String;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v10, v0}, Ljava/lang/String;-><init>([C)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 327
a=0;//     .end local v0    # "buf":[C
a=0;//     .end local v4    # "i":I
a=0;//     .end local v5    # "j":I
a=0;//     .end local v7    # "k":I
a=0;//     .end local v8    # "md":[B
a=0;//     .end local v9    # "mdTemp":Ljava/security/MessageDigest;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v10, v11
a=0;// 
a=0;//     .line 328
a=0;//     #v10=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 322
a=0;//     .end local v2    # "e":Ljava/lang/Exception;
a=0;//     .restart local v0    # "buf":[C
a=0;//     .restart local v4    # "i":I
a=0;//     .restart local v5    # "j":I
a=0;//     .restart local v7    # "k":I
a=0;//     .restart local v8    # "md":[B
a=0;//     .restart local v9    # "mdTemp":Ljava/security/MessageDigest;
a=0;//     :cond_2
a=0;//     #v0=(Reference,[C);v2=(Uninit);v4=(Integer);v5=(Integer);v6=(Integer);v7=(Integer);v8=(Reference,[B);v9=(Reference,Ljava/security/MessageDigest;);v10=(Integer);
a=0;//     aget-byte v1, v8, v4
a=0;// 
a=0;//     .line 323
a=0;//     .local v1, "byte0":B
a=0;//     #v1=(Byte);
a=0;//     add-int/lit8 v6, v7, 0x1
a=0;// 
a=0;//     .end local v7    # "k":I
a=0;//     .restart local v6    # "k":I
a=0;//     ushr-int/lit8 v10, v1, 0x4
a=0;// 
a=0;//     and-int/lit8 v10, v10, 0xf
a=0;// 
a=0;//     aget-char v10, v3, v10
a=0;// 
a=0;//     #v10=(Char);
a=0;//     aput-char v10, v0, v7
a=0;// 
a=0;//     .line 324
a=0;//     add-int/lit8 v7, v6, 0x1
a=0;// 
a=0;//     .end local v6    # "k":I
a=0;//     .restart local v7    # "k":I
a=0;//     and-int/lit8 v10, v1, 0xf
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     aget-char v10, v3, v10
a=0;// 
a=0;//     #v10=(Char);
a=0;//     aput-char v10, v0, v6
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 321
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 311
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 2
a=0;//         0x30s
a=0;//         0x31s
a=0;//         0x32s
a=0;//         0x33s
a=0;//         0x34s
a=0;//         0x35s
a=0;//         0x36s
a=0;//         0x37s
a=0;//         0x38s
a=0;//         0x39s
a=0;//         0x61s
a=0;//         0x62s
a=0;//         0x63s
a=0;//         0x64s
a=0;//         0x65s
a=0;//         0x66s
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public static shakeAnimation(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 982
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->shake:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 983
a=0;//     .local v0, "shake":Landroid/view/animation/Animation;
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 984
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static showSoftKeyBoard(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 849
a=0;//     new-instance v0, Ljava/util/Timer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Timer;);
a=0;//     invoke-direct {v0}, Ljava/util/Timer;-><init>()V
a=0;// 
a=0;//     .line 850
a=0;//     .local v0, "timer":Ljava/util/Timer;
a=0;//     #v0=(Reference,Ljava/util/Timer;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/common/Util$3;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/common/Util$3;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/common/Util$3;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 856
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/common/Util$3;);
a=0;//     const-wide/16 v2, 0x1f4
a=0;// 
a=0;//     .line 850
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
a=0;// 
a=0;//     .line 857
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static showSoftKeyBoard2(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 863
a=0;//     new-instance v0, Ljava/util/Timer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Timer;);
a=0;//     invoke-direct {v0}, Ljava/util/Timer;-><init>()V
a=0;// 
a=0;//     .line 864
a=0;//     .local v0, "timer":Ljava/util/Timer;
a=0;//     #v0=(Reference,Ljava/util/Timer;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/common/Util$4;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/common/Util$4;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/common/Util$4;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 870
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/common/Util$4;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     .line 864
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
a=0;// 
a=0;//     .line 871
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static slStr(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "str"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     .line 266
a=0;//     #v1=(PosByte);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 267
a=0;//     const-string p0, ""
a=0;// 
a=0;//     .line 271
a=0;//     .end local p0    # "str":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 268
a=0;//     .restart local p0    # "str":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v1, :cond_0
a=0;// 
a=0;//     .line 269
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static storeImage(Landroid/graphics/Bitmap;Ljava/io/File;)V
a=0;//     .locals 3
a=0;//     .param p0, "image"    # Landroid/graphics/Bitmap;
a=0;//     .param p1, "pictureFile"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1186
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 1196
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1190
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 1191
a=0;//     .local v0, "fos":Ljava/io/FileOutputStream;
a=0;//     #v0=(Reference,Ljava/io/FileOutputStream;);
a=0;//     sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p0, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     .line 1192
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1193
a=0;//     .end local v0    # "fos":Ljava/io/FileOutputStream;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1194
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static toHexString([B)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "b"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     .line 298
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 299
a=0;//     .local v1, "sb":Ljava/lang/StringBuilder;
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 303
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 300
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/Util;->HEX_DIGITS:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     aget-byte v3, p0, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     and-int/lit16 v3, v3, 0xf0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     ushr-int/lit8 v3, v3, 0x4
a=0;// 
a=0;//     aget-char v2, v2, v3
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 301
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/Util;->HEX_DIGITS:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     aget-byte v3, p0, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     and-int/lit8 v3, v3, 0xf
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget-char v2, v2, v3
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 299
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static toRoundCorner(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
a=0;//     .locals 11
a=0;//     .param p0, "bitmap"    # Landroid/graphics/Bitmap;
a=0;//     .param p1, "pixels"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 944
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sget-object v9, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {v7, v8, v9}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 945
a=0;//     .local v2, "output":Landroid/graphics/Bitmap;
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     new-instance v0, Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v0, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 947
a=0;//     .local v0, "canvas":Landroid/graphics/Canvas;
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     const v1, -0xbdbdbe
a=0;// 
a=0;//     .line 948
a=0;//     .local v1, "color":I
a=0;//     #v1=(Integer);
a=0;//     new-instance v3, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     .line 949
a=0;//     .local v3, "paint":Landroid/graphics/Paint;
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     new-instance v4, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     invoke-direct {v4, v10, v10, v7, v8}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     .line 950
a=0;//     .local v4, "rect":Landroid/graphics/Rect;
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     new-instance v5, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-direct {v5, v4}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 951
a=0;//     .local v5, "rectF":Landroid/graphics/RectF;
a=0;//     #v5=(Reference,Landroid/graphics/RectF;);
a=0;//     int-to-float v6, p1
a=0;// 
a=0;//     .line 953
a=0;//     .local v6, "roundPx":F
a=0;//     #v6=(Float);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V
a=0;// 
a=0;//     .line 954
a=0;//     invoke-virtual {v0, v10, v10, v10, v10}, Landroid/graphics/Canvas;->drawARGB(IIII)V
a=0;// 
a=0;//     .line 955
a=0;//     const v7, -0xbdbdbe
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 956
a=0;//     invoke-virtual {v0, v5, v6, v6, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 958
a=0;//     new-instance v7, Landroid/graphics/PorterDuffXfermode;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/graphics/PorterDuffXfermode;);
a=0;//     sget-object v8, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;
a=0;// 
a=0;//     #v8=(Reference,Landroid/graphics/PorterDuff$Mode;);
a=0;//     invoke-direct {v7, v8}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/PorterDuffXfermode;);
a=0;//     invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;
a=0;// 
a=0;//     .line 959
a=0;//     invoke-virtual {v0, p0, v4, v4, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 961
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized write(Ljava/lang/String;Lcom/twocloo/com/cn/beans/Shubenmulu;)V
a=0;//     .locals 8
a=0;//     .param p0, "aid"    # Ljava/lang/String;
a=0;//     .param p1, "mul"    # Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 439
a=0;//     const-class v4, Lcom/twocloo/com/cn/common/Util;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v4
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v5, Lcom/twocloo/com/cn/common/Util;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v5
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 441
a=0;//     :try_start_1
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_DOWNML:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "dlml"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v1, v3, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 445
a=0;//     .local v1, "f":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 446
a=0;//     invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     .line 447
a=0;//     new-instance v2, Ljava/io/ObjectOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ObjectOutputStream;);
a=0;//     new-instance v3, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v3, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 448
a=0;//     .local v2, "out":Ljava/io/ObjectOutputStream;
a=0;//     #v2=(Reference,Ljava/io/ObjectOutputStream;);
a=0;//     invoke-virtual {v2, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 449
a=0;//     invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 439
a=0;//     .end local v1    # "f":Ljava/io/File;
a=0;//     .end local v2    # "out":Ljava/io/ObjectOutputStream;
a=0;//     :goto_0
a=0;//     :try_start_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     monitor-exit v5
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 454
a=0;//     monitor-exit v4
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 450
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 451
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 439
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v5
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     :try_start_4
a=0;//     throw v3
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     :catchall_1
a=0;//     #v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized write(Ljava/lang/String;Ljava/lang/String;Lcom/twocloo/com/cn/beans/RDBook;)V
a=0;//     .locals 8
a=0;//     .param p0, "aid"    # Ljava/lang/String;
a=0;//     .param p1, "chapterid"    # Ljava/lang/String;
a=0;//     .param p2, "rdBook"    # Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     .prologue
a=0;//     .line 464
a=0;//     const-class v4, Lcom/twocloo/com/cn/common/Util;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v4
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v5, Lcom/twocloo/com/cn/common/Util;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v5
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 466
a=0;//     :try_start_1
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v6, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_BOOK:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "/"
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v6, "/obj"
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "rdbook"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "_"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v1, v3, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 467
a=0;//     .local v1, "f":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 468
a=0;//     new-instance v2, Ljava/io/ObjectOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ObjectOutputStream;);
a=0;//     new-instance v3, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v3, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 469
a=0;//     .local v2, "out":Ljava/io/ObjectOutputStream;
a=0;//     #v2=(Reference,Ljava/io/ObjectOutputStream;);
a=0;//     invoke-virtual {v2, p2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 470
a=0;//     invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 464
a=0;//     .end local v1    # "f":Ljava/io/File;
a=0;//     .end local v2    # "out":Ljava/io/ObjectOutputStream;
a=0;//     :goto_0
a=0;//     :try_start_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     monitor-exit v5
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 475
a=0;//     monitor-exit v4
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 471
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 472
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 464
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v5
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     :try_start_4
a=0;//     throw v3
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     :catchall_1
a=0;//     #v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     throw v3
a=0;// .end method
}}
