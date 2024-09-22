// there are class based and function based components
// here we will use function based components
// rafce - ES7 react snippets
// react arrow function component

import React from "react";

const Navbar = () => {
  return (
    <div className="bg-gray-800">
      <div className="h-16 px-8 flex items-center">
        <p className="text-white font-bold">Employee Management System</p>
      </div>
    </div>
  );
};

export default Navbar;
